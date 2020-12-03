package pe.isapichqa.java8.qanchis7kyu.view;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CV0102v01GrowthPopulationTest {

    @Test
    public void testGrowthPopulation() {
        assertEquals(3, new CV0102v01GrowthPopulation().growthPopulation(1000, 2, 50, 1200));
        assertEquals(15, new CV0102v01GrowthPopulation().growthPopulation(1500, 5, 100, 5000));
        assertEquals(10, new CV0102v01GrowthPopulation().growthPopulation(1500000, 2.5, 10000, 2000000));
        assertEquals(94, new CV0102v01GrowthPopulation().growthPopulation(1500000, 0.25, 1000, 2000000));
    }

//    private static void testing(int actual, int expected) {
//        assertEquals(expected, actual);
//    }

//    @Test
//    public void test1() {

//        testing(CV0102v01GrowthPopulation.growthPopulation(1500, 5, 100, 5000), 15);
//        testing(CV0102v01GrowthPopulation.growthPopulation(1500000, 2.5, 10000, 2000000), 10);
//        testing(CV0102v01GrowthPopulation.growthPopulation(1500000, 0.25, 1000, 2000000), 94);
//    }

}
