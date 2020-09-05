package pe.unjfsc.fsi.java8.entity;

public class CECovid19 {

	private int day;
	private int fallecido;
	private int nacimiento;
	private int contagio;
        private int poblacion;

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getFallecido() {
		return fallecido;
	}
	public void setFallecido(int fallecido) {
		this.fallecido = fallecido;
	}
	public int getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getContagio() {
		return contagio;
	}
	public void setContagio(int contagio) {
		this.contagio = contagio;
	}

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "CECovid19{" + "day=" + day + ", fallecido=" + fallecido + ", nacimiento=" + nacimiento + ", contagio=" + contagio + ", poblacion=" + poblacion + '}';
    }
    

}