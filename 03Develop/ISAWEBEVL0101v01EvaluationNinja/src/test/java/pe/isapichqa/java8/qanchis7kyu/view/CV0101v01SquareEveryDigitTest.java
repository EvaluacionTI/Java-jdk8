package pe.isapichqa.java8.qanchis7kyu.view;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class CV0101v01SquareEveryDigitTest {

    @Test
    public void testDigitoElevado() {
      assertEquals(811181, new CV0101v01SquareEveryDigit().digitoElevado(9119));
    }

    @Test
    public void testKataBest() {
      assertEquals(811181, new CV0101v01SquareEveryDigit().kataBest(9119));
    }
}
