package pe.isapichqa.java8.qanchis7kyu.view;

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest2Suite2 {
    int totalNumberOfApplicants = 0;
    int totalNumberOfAcceptableApplicants = 10;
    ArrayList listOfValidStrings = new ArrayList();
     
    @Before
    public void setData(){
        this.totalNumberOfApplicants = 9;
        listOfValidStrings.add("object_1");
        listOfValidStrings.add("object_2");
        listOfValidStrings.add("object_3");
    }
     
    @Test
    public void testAssertThatEqual() {
        assertThat("123",is("123"));
    }
     
    @Test
    public void testAssertThatNotEqual() {
        assertThat(totalNumberOfApplicants,is(123));
    }
     
    @Test
    public void testAssertThatObject() {
        assertThat("123",isA(String.class));
    }
     
     
    @Test
    public void testAssertThatWMessage(){
        assertThat("They are not equal!","123",is("1234"));
    }    
}
