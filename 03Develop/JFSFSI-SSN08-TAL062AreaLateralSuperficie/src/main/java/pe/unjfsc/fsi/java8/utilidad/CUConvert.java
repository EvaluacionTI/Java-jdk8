package pe.unjfsc.fsi.java8.utilidad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CUConvert {

    private static final Logger LOG = LoggerFactory.getLogger("CUConvert");

    protected String numeroLetras(int pNumero) {
        String sNumeroLetra = null;

        switch (pNumero) {
            case 1:
                sNumeroLetra = "Uno";
                break;
            case 2:
                sNumeroLetra = "Dos";
                break;
            case 5:
                sNumeroLetra = "Cinco";
                break;
            default:
                sNumeroLetra = "Por definir";
                break;
        }
        return sNumeroLetra;
    }

    public String rotarDerechaIzquierda(String psCadena) {
        String sCadenaRotada = "";
        LOG.info(" psCadena {}", psCadena);
        LOG.info(" psCadena {}", psCadena.length());

        for (int i = psCadena.length(); i > 0; i--) {
            LOG.info(" psCadena {}", psCadena.substring(i-1, i));
            sCadenaRotada = sCadenaRotada + psCadena.substring(i-1, i);
        }

        return sCadenaRotada.trim();
    }
}
