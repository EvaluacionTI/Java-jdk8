package aemsa.cap07.excepcion;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/////////////////////////////////////////////////////////////////
// Definici�n de la clase CO06v02BaseDeDatos.
//
public class CO06v02BaseDeDatos {
    // Atributos

    private File ficheroActual;     // objeto File (nombre del fichero)
    private RandomAccessFile fes;   // flujo hacia/desde el fichero
    private int nregs;              // n�mero de registros
    private int tamanoReg = 50;     // tama�o del registro en bytes
    private boolean borrar = false; // true si se borran registros

    // M�todos
    public CO06v02BaseDeDatos(File fichero) throws IOException {
        // �Existe el fichero?
        if (fichero.exists() && !fichero.isFile()) {
            throw new IOException(fichero.getName() + " no es un fichero");
        }
        // Asignar valores a los atributos
        ficheroActual = fichero;
        fes = new RandomAccessFile(fichero, "rw");
        // El �ltimo registro no ocupa el tama�o especificado.
        // Por esta causa utilizamos ceil, para redondear por encima.
        nregs = (int) Math.ceil((double) fes.length() / (double) tamanoReg);
    }

    public void cerrar() throws IOException {
        fes.close();
    }

    public int longitud() {
        return nregs;
    } // n�mero de registros

    public boolean ponerValorEn(int i, CO06v01Registro objeto)
            throws IOException {
        if (i >= 0 && i <= nregs) {
            // Los 2 primeros bytes que escribe writeUTF indican la
            // longitud de la String que escribe a continuaci�n. Esta
            // informaci�n es utilizada por readUTF.
            if (objeto.tamano() + 2 > tamanoReg) {
                System.err.println("tama�o del registro excedido");
            } else {
                // Situar el puntero de L/E en el registro i.
                fes.seek(i * tamanoReg);
                // Sobreescribir el registro con la nueva informaci�n
                fes.writeUTF(objeto.obtenerReferencia());
                fes.writeDouble(objeto.obtenerPrecio());
                return true;
            }
        } else {
            System.err.println("n�mero de registro fuera de l�mites");
        }
        return false;
    }

    public void anadir(CO06v01Registro obj) throws IOException {
        // A�adir un registro al final del fichero e incrementar
        // el n�mero de registros
        if (ponerValorEn(nregs, obj)) {
            nregs++;
        }
    }

    public CO06v01Registro valorEn(int i) throws IOException {
        if (i >= 0 && i < nregs) {
            // Situar el puntero de L/E en el registro i.
            fes.seek(i * tamanoReg);

            String referencia;
            double precio;
            // Leer la informaci�n correspondiente al registro i.
            referencia = fes.readUTF();
            precio = fes.readDouble();

            // Devolver el objeto CO06v01Registro correspondiente.
            return new CO06v01Registro(referencia, precio);
        } else {
            System.out.println("n�mero de registro fuera de l�mites");
            return null;
        }
    }

    public int buscar(String str, int nreg) throws IOException {
        // Buscar un registro por una subcadena de la referencia
        // a partir de un registro determinado. Si se encuentra,
        // se devuelve el n�mero de registro, o -1 en otro caso.
        CO06v01Registro obj;
        String ref;
        if (str == null) {
            return -1;
        }
        if (nreg < 0) {
            nreg = 0;
        }
        for (int reg_i = nreg; reg_i < nregs; reg_i++) {
            // Obtener el registro reg_i
            obj = valorEn(reg_i);
            // Obtener su referencia
            ref = obj.obtenerReferencia();
            // �str est� contenida en referencia?
            if (ref.indexOf(str) > -1) {
                return reg_i; // devolver el n�mero de registro
            }
        }
        return -1; // la b�squeda fall�
    }

    public boolean eliminar(String ref) throws IOException {
        CO06v01Registro obj;
        // Buscar la referencia y marcar el registro correspondiente
        // para poder eliminarlo en otro proceso.
        for (int reg_i = 0; reg_i < nregs; reg_i++) {
            // Obtener el registro reg_i
            obj = valorEn(reg_i);
            // �Tiene la referencia ref?
            if (ref.compareTo(obj.obtenerReferencia()) == 0) {
                // Marcar el registro con la referencia "borrar"
                obj.asignarReferencia("borrar");
                borrar = true;
                // Grabarlo
                ponerValorEn(reg_i, obj);
                return true;
            }
        }
        return false;
    }

    public boolean tieneRegsEliminados() {
        return borrar;
    }

    public void actualizar() throws IOException {
        // Crear un fichero temporal.
        File ficheroTemp = new File("articulos.tmp");
        CO06v02BaseDeDatos ftemp = new CO06v02BaseDeDatos(ficheroTemp);

        // Copiar en el fichero temporal todos los registros del
        // fichero actual que no est�n marcados para "borrar"
        CO06v01Registro obj;
        for (int reg_i = 0; reg_i < nregs; reg_i++) {
            obj = valorEn(reg_i);
            if (obj.obtenerReferencia().compareTo("borrar") != 0) {
                ftemp.anadir(obj);
            }
        }
        // Borrar el fichero actual y renombrar el temporal con el
        // nombre del actual. Para hacer estas operaciones los ficheros
        // no pueden estar en uso.
        this.cerrar();          // cerrar el fichero actual
        ftemp.cerrar();         // cerrar el fichero temporal
        ficheroActual.delete(); // borrar el fichero actual
        if (!ficheroTemp.renameTo(ficheroActual)) // renombrar
        {
            throw new IOException("no se actualiz� el fichero");
        }
    }
}
