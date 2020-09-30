package pe.unjfsc.ads.java8.logical;

import pe.unjfsc.ads.java8.entity.CEAreaSuperficieLateral;
import pe.unjfsc.ads.java8.entity.CEAreaTotalSuperficie;
import pe.unjfsc.ads.java8.entity.CEMostrarDatos;

public interface CIEvaluarSuperficie {
    public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA);
    public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA);
    public CEMostrarDatos procesarData(CEMostrarDatos poData);
}
