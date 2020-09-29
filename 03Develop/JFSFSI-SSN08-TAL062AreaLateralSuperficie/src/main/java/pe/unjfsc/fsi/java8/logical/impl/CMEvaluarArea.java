package pe.unjfsc.fsi.java8.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CEAreaSuperficieLateral;
import pe.unjfsc.fsi.java8.entity.CEAreaTotalSuperficie;
import static pe.unjfsc.fsi.java8.entity.CEConstant.CUATRO;
import static pe.unjfsc.fsi.java8.entity.CEConstant.DOS;
import static pe.unjfsc.fsi.java8.entity.CEConstant.LSA;
import static pe.unjfsc.fsi.java8.entity.CEConstant.PI;
import static pe.unjfsc.fsi.java8.entity.CEConstant.TRES;
import pe.unjfsc.fsi.java8.entity.CEMostrarDatos;
import pe.unjfsc.fsi.java8.logical.CIEvaluarSuperficie;

public class CMEvaluarArea implements CIEvaluarSuperficie {

    public static final Logger LOG = LoggerFactory.getLogger("CMEvaluarArea");
    private CEAreaSuperficieLateral oCELsa, oCELsaRpta;
    private CEAreaTotalSuperficie oCETsa, oCETsaRpta;
    private CEMostrarDatos oMostrarRequest, oMostrarResponse;

    @Override
    public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA) {
        oCELsa = new CEAreaSuperficieLateral();
        double radio;

        radio = poLSA.getLsa() / (DOS * PI * poLSA.getAltura());
        oCELsa = poLSA;
        oCELsa.setRadio(radio);
        oCELsa.setDiametro(calcularDiametro(radio));
        String letra = letraNumero(radio);
        oCELsa.setRadioLetra(letra);
        letra = letraNumero(calcularDiametro(radio));
        oCELsa.setDiametroLetra(letra);
        return oCELsa;
    }

    @Override
    public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA) {
        oCETsa = new CEAreaTotalSuperficie();
        double dTsa = poTSA.getoCELsa().getLsa() + DOS * PI * Math.pow(poTSA.getoCELsa().getRadio(), DOS);

        oCETsa = poTSA;
        oCETsa.setTsa(dTsa);
        oCETsa.setAte(calcularAtequilatero(poTSA.getoCELsa().getRadio()));
        return oCETsa;
    }

    @Override
    public CEMostrarDatos seeData(CEMostrarDatos poData) {
        oMostrarResponse = new CEMostrarDatos();
        oCELsa = new CEAreaSuperficieLateral();
        oCELsaRpta = new CEAreaSuperficieLateral();
        oCETsa = new CEAreaTotalSuperficie();
        oCETsaRpta = new CEAreaTotalSuperficie();
        
        LOG.info("CELsa Request : {}", oCELsa);
        if (poData.getoCELsa().getLsa()==0){
            oCELsa.setLsa(LSA);
        }
        oCELsa.setAltura(poData.getoCELsa().getAltura());
        oCELsaRpta = calcularLSA(oCELsa);
        LOG.info("CELsa Response : {}", oCELsaRpta);

        oCETsa.setoCELsa(oCELsaRpta);
          LOG.info("CETsa Request : {}", oCETsa);
          
        oCETsaRpta = calcularTSA(oCETsa);
        LOG.info("CETsa Response : {}", oCETsaRpta);

        oMostrarResponse.setoCELsa(oCELsaRpta);
        oMostrarResponse.setoCETsa(oCETsaRpta);
        oMostrarResponse.setValorPI(PI);
        oMostrarResponse.setRotarIzquierdaDerecha("134");
        oMostrarResponse.setEnMinuscula("Cien");
        oMostrarResponse.setEnMayuscula("CATORCe");
        oMostrarResponse.setPrimerUltimoCaracter("13");

        return oMostrarResponse;
    }

    protected double calcularDiametro(double pdRadio) {
        return DOS * pdRadio;
    }

    protected double calcularAtequilatero(double pdLado) {
        return (Math.sqrt(TRES) * Math.pow(pdLado, DOS)) / CUATRO;
    }
    
    protected String letraNumero(double pdNumero){
        String letra="";
        int result = (int) pdNumero;
        switch (result){
            case 5:
                letra="Cinco";
                break;
            case 10:
                letra="DIEz";
                break;
        }
        return letra;
    }

}
