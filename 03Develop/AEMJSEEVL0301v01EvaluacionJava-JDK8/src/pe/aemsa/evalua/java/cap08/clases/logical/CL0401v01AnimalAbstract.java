package pe.aemsa.evalua.java.cap08.clases.logical;

// La clase abstract no se puede instanciar
// Es una clase padre de otras clases
public abstract class CL0401v01AnimalAbstract {
    private String nombre;
    
    public CL0401v01AnimalAbstract(){}
    
    public void comer(){
        System.out.println("El " + nombre + "está comiendo");
    }
    
    // Este método tiene que ser implementado cuando se va instanciar.
    public abstract void moverse();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
