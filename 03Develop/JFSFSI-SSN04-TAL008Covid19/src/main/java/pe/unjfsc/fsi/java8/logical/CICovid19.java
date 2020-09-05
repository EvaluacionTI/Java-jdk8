package pe.unjfsc.fsi.java8.logical;

import pe.unjfsc.fsi.java8.entity.CECovid19;

public interface CICovid19 {
	public int calcularFallecidos(int piDiasTranscurridos);
        public int calcularNacimientos(int piDiasTranscurridos);
        public int calcularContagios(int piDiasTranscurridos);
        public int calcularPoblacion(int piDiasTranscurridos);
	public CECovid19 proyectarCovid19(int piDiasTranscurridos);
}
