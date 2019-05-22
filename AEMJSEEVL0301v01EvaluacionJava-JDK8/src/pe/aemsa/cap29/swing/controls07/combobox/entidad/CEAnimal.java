package pe.aemsa.cap29.swing.controls07.combobox.entidad;

public class CEAnimal {
    private int idAnimal;
    private String codigoAnimal;
    private String numeroArete;
    private String nombreAlias;

    public CEAnimal(){}
    
    public CEAnimal(int pIdAnimal, String psCodigoAnimal, String psNumeroArete, String psNombreAlias){
        this.idAnimal = pIdAnimal;
        this.codigoAnimal = psCodigoAnimal;
        this.numeroArete = psNumeroArete;
        this.nombreAlias = psNombreAlias;
    }
    public int getIdAnimal() {
            return idAnimal;
    }
    public void setIdAnimal(int idAnimal) {
            this.idAnimal = idAnimal;
    }
    public String getCodigoAnimal() {
            return codigoAnimal;
    }
    public void setCodigoAnimal(String codigoAnimal) {
            this.codigoAnimal = codigoAnimal;
    }
    public String getNumeroArete() {
            return numeroArete;
    }
    public void setNumeroArete(String numeroArete) {
            this.numeroArete = numeroArete;
    }
    public String getNombreAlias() {
            return nombreAlias;
    }
    public void setNombreAlias(String nombreAlias) {
            this.nombreAlias = nombreAlias;
    }
    
    public String toString(){
        return nombreAlias;
    }
}
