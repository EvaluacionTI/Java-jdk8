package pe.unjfsc.fsi.java8.logical;

import pe.unjfsc.fsi.java8.entity.CEAreaSuperficieLateral;
import pe.unjfsc.fsi.java8.entity.CEAreaTotalSuperficie;
import pe.unjfsc.fsi.java8.entity.CEMostrarDatos;

public interface CIEvaluarSuperficie {
    public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA);
    public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA);
    public CEMostrarDatos seeData(CEMostrarDatos poData);
}
