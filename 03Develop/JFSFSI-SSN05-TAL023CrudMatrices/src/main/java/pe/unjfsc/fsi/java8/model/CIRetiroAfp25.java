package pe.unjfsc.fsi.java8.model;

public interface CIRetiroAfp25 {
    public void saveRetiroDimensional(Object[][] poData);
    public void updateRetiroDimensional(Object[][] poData);
    public void deleteRetiroDimensional(int pId);
    
    public Object[][] consultAllRetiroDimensional();
    public Object[][] consultaByIdRetiroDimensional(int pId);
}
