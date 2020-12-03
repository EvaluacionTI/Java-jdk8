package pe.isapichqa.java8.qanchis7kyu.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CV0101v01SquareEveryDigit {

    private static final Logger LOG = LoggerFactory.getLogger("CV0101v01SquareEveryDigit");

    public static void main(String[] args) {
        LOG.info("[NJA] Begin : ");
        int numberResponse = digitoElevado(9119);
        LOG.info("[NJA] Concatenado : {}", numberResponse);

        int kataNumberResponse = kataBest(9119);
        LOG.info("[NJA] Kata best : {}", kataNumberResponse);
    }

    public static int digitoElevado(int piNumero) {
        long startTime = System.nanoTime();
        LOG.info("[NJA] Time begin : {} ", startTime);

        String sNumeroConcaternar = "";
        String sNumeroEvaluar = String.valueOf(piNumero);

        LOG.info("[NJA] Numero String : {} ", sNumeroEvaluar);
        for (int i = 0; i < sNumeroEvaluar.length(); i++) {
            LOG.info("[NJA] item, numero : {} - {} ", i, sNumeroEvaluar.substring(i, i + 1));

            int iNuevoNumero = Integer.parseInt(sNumeroEvaluar.substring(i, i + 1));
            int iNumberElevado = iNuevoNumero * iNuevoNumero;
            LOG.info("[NJA] numero - numero Elevado : {} - {} ", iNuevoNumero, iNumberElevado);

            sNumeroConcaternar = sNumeroConcaternar + String.valueOf(iNumberElevado);
            LOG.info("[NJA] Nuevo concatenado : {} ", sNumeroConcaternar);
        }
        long endTime = System.nanoTime();
        LOG.info("[NJA] Time end : {} ", System.nanoTime());
        LOG.info("[NJA] Time total : {} ", (endTime - startTime));
        return Integer.valueOf(sNumeroConcaternar);
    }

    public static int kataBest(int n) {
        long startTime = System.nanoTime();
        LOG.info("[NJA] Time begin : {} ", startTime);

        String result = "";
        while (n != 0) {
            int digit = n % 10;
            result = digit * digit + result;
            LOG.info("[NJA] kata numero - kata numero Elevado - kata result: {} - {} - {}", n, digit, result);
            n /= 10;
        }
        long endTime = System.nanoTime();
        LOG.info("[NJA] Time end : {} ", System.nanoTime());
        LOG.info("[NJA] Time total : {} ", (endTime - startTime));
        return Integer.parseInt(result);
    }

}
