package pe.unjfsc.ads.java8.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.ads.java8.entity.CEAreaSuperficieLateral;
import pe.unjfsc.ads.java8.entity.CEAreaTotalSuperficie;
import static pe.unjfsc.ads.java8.entity.CEConstant.CUATRO;
import static pe.unjfsc.ads.java8.entity.CEConstant.DOS;
import static pe.unjfsc.ads.java8.entity.CEConstant.PI;
import static pe.unjfsc.ads.java8.entity.CEConstant.TRES;
import pe.unjfsc.ads.java8.entity.CEMostrarDatos;
import pe.unjfsc.ads.java8.logical.CIEvaluarSuperficie;

public class CMEvaluarArea implements CIEvaluarSuperficie {

    private static final Logger LOG = LoggerFactory.getLogger("CMEvaluarArea");
    private CEAreaSuperficieLateral oCELsa, oCELsaRpta;
    private CEAreaTotalSuperficie oCETsa, oCETsaRpta;
    private CEMostrarDatos oCEMostrarDatos;

    @Override
    public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA) {
        oCELsa = new CEAreaSuperficieLateral();
        double radio;

        LOG.info("CEAreaSuperficieLateral receiver : {}", poLSA);
        LOG.info("CEAreaSuperficieLateral instanciando : {}", oCELsa);

        radio = poLSA.getLsa() / (DOS * PI * poLSA.getAltura());
        LOG.info("Valor del radio : {}", radio);

        oCELsa.setLsa(poLSA.getLsa());
        oCELsa.setRadio(radio);
        oCELsa.setAltura(poLSA.getAltura());
        oCELsa.setDiametro(calcularDiametro(radio));

        String letra = convertirNumeroLetra(radio);
        oCELsa.setRadioLetra(letra);

        letra = convertirNumeroLetra(calcularDiametro(radio));
        oCELsa.setDiametroLetra(letra);
        LOG.info("CEAreaSuperficieLateral new data : {}", oCELsa);
        return oCELsa;
    }

    @Override
    public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA) {
        oCETsa = new CEAreaTotalSuperficie();
        double dAreaTotalSuperficie = poTSA.getoCELsa().getLsa() + DOS * PI * Math.pow(poTSA.getoCELsa().getRadio(), DOS);

        LOG.info("CEAreaTotalSuperficie receiver : {}", poTSA);
        LOG.info("CEAreaTotalSuperficie instanciando : {}", oCETsa);
        LOG.info("Area Total Superficie : {}", dAreaTotalSuperficie);

        oCETsa = poTSA;
        oCETsa.setTsa(dAreaTotalSuperficie);
        oCETsa.setAte(calcularAreaTrianguloEquilatero(poTSA.getoCELsa().getRadio()));
        return oCETsa;
    }

    @Override
    public CEMostrarDatos procesarData(CEMostrarDatos poData) {
        oCEMostrarDatos = new CEMostrarDatos();

        oCELsaRpta = calcularLSA(poData.getoCETsa().getoCELsa());

        oCETsaRpta.setoCELsa(oCELsaRpta);
        oCEMostrarDatos.setoCETsa(oCETsaRpta);

        return oCEMostrarDatos;
    }

    protected double calcularDiametro(double pdRadio) {
        return DOS * pdRadio;
    }
    
    protected double calcularAreaTrianguloEquilatero(double pdLado) {
        return (Math.sqrt(TRES) * Math.pow(pdLado, DOS)) / CUATRO;
    }

    protected String convertirNumeroLetra(double pdNumero) {
        String numeroLetra = "";
        //Convirtiendo un double en entero
        int result = (int) pdNumero;

        switch (result) {
            case 5:
                numeroLetra = "Cinco";
                break;
            case 10:
                numeroLetra = "DIEz";
                break;
        }
        return numeroLetra;
    }


}
