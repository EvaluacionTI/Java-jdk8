package pe.isapichqa.java8.qanchis7kyu.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import pe.isapichqa.java8.qanchis7kyu.view.JUnitSuiteCV0102v01GrowthPopulation;

public class TestRunnerForCV0102v01GrowthPopulation {

    public static void main(String[] args) {
        org.junit.runner.Result result = JUnitCore.runClasses(JUnitSuiteCV0102v01GrowthPopulation.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
