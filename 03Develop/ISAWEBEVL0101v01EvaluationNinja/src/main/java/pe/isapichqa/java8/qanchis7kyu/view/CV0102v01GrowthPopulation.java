package pe.isapichqa.java8.qanchis7kyu.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static pe.isapichqa.java8.qanchis7kyu.entity.CE0101v01Utility.MILISEGUNDOS;

public class CV0102v01GrowthPopulation {

    private static final Logger LOG = LoggerFactory.getLogger("CV0102v01GrowthPopulation");

    public static void main(String[] args) {
        LOG.info("[NJA] Begin : ");

        int numberResponse = growthPopulation(1000, 2, 50, 1200);
        LOG.info("[NJA] Number year : {}", numberResponse);

        numberResponse = growthPopulation(1500, 5, 100, 5000);
        LOG.info("[NJA] Number year : {}", numberResponse);

        numberResponse = growthPopulation(1500000, 2.5, 10000, 2000000);
        LOG.info("[NJA] Number year : {}", numberResponse);

        numberResponse = growthPopulation(1500000, 0.25, 1000, 2000000);
        LOG.info("[NJA] Number year : {}", numberResponse);

    }

    public static int growthPopulation(int piBeginPopulation, double pdPorcentaje, int piComeInpopularion, int piEndPopulation) {
        long startTime = System.nanoTime();
        LOG.info("[NJA] Time begin in milisegundos : {} ", startTime);

        int iNumberYear = 1;
        double varationPopulation = piBeginPopulation * pdPorcentaje * 0.01;
        double dTotalPopulation = piBeginPopulation + varationPopulation + piComeInpopularion;
        int totalPopulation = (int) (piBeginPopulation + varationPopulation + piComeInpopularion);

        LOG.info("begin totalPopulation : {} - {} - {} ", iNumberYear, totalPopulation, dTotalPopulation);
        while (piEndPopulation >= totalPopulation) {
            piBeginPopulation = totalPopulation;
            varationPopulation = piBeginPopulation * pdPorcentaje * 0.01;
            dTotalPopulation = piBeginPopulation + varationPopulation + piComeInpopularion;
            totalPopulation = (int) (piBeginPopulation + varationPopulation + piComeInpopularion);
            iNumberYear += 1;
            LOG.info("variacion totalPopulation : {} - {} - {}", iNumberYear, totalPopulation, dTotalPopulation);
        }
        
        LOG.info("[NJA] Number Year : {} ", iNumberYear);

        long endTime = System.nanoTime();
        LOG.info("[NJA] Time end in milisegundos : {} ", System.nanoTime());
        LOG.info("[NJA] Time total milisegundos : {} ", (endTime - startTime));
        LOG.info("[NJA] Time total segundos : {} ", (endTime - startTime) / MILISEGUNDOS);
        return iNumberYear;
    }
}
