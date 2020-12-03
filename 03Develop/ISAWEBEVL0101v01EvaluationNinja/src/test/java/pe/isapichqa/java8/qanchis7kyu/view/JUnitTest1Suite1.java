package pe.isapichqa.java8.qanchis7kyu.view;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest1Suite1 {

    int totalNumberOfApplicants = 0;
    int totalNumberOfAcceptableApplicants = 10;

    @Before
    public void setData() {
        this.totalNumberOfApplicants = 9;
    }

    @Test
    public void testAssertions() {
        assertTrue((this.totalNumberOfApplicants != this.totalNumberOfAcceptableApplicants));
    }

    @Test
    public void testAssertFalse() {
        assertTrue((this.totalNumberOfApplicants == this.totalNumberOfAcceptableApplicants));
    }

    @Test
    public void testAssertTrueWithMessage() {
        assertTrue("Is total number of applicants acceptable?", (this.totalNumberOfApplicants != this.totalNumberOfAcceptableApplicants));
    }
}
