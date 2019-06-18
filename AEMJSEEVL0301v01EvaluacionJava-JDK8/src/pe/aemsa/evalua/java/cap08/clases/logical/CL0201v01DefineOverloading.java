package pe.aemsa.evalua.java.cap08.clases.logical;

/*
* Description : La sobrecarga es cuando en una misma clase redefines un mismo método
                       Son métodos que tienen el mismo nombre pero diferente argumento.
                       Un método sobrecargado debe tener diferentes parámetros (tipos de dato)
*/
public class CL0201v01DefineOverloading {
    
    public int multiplicar(int x, int y) {
    	return x * y;
    }
     
    public float multiplicar(float x, float y) {
    	return x * y;
    }    
}
