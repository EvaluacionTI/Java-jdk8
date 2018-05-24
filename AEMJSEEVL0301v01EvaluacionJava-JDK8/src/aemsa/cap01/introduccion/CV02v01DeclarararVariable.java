package aemsa.cap01.introduccion;

public class CV02v01DeclarararVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iImporteporLaboratorioSabado;

        // Casteando un valor double a entero, solo toma la parte entera
        iImporteporLaboratorioSabado = (int) 0.7;
        
        System.out.println(iImporteporLaboratorioSabado);

        // Declarando y asignado un valor
        double dImporteSueldo = 500.00;
        System.out.println(dImporteSueldo);

        String sMiNombreEs = "Alex Diaz";
        System.out.println(sMiNombreEs);
    }

}
