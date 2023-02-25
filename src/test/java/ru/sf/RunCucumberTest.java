package ru.sf;

import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@CucumberOptions(
    features = {"classpath:features"}
)
public class RunCucumberTest {
    public RunCucumberTest() {
    }

    @AfterClass
    public static void finalizeResources() {
        StepDefinitions.driver.close();
    }
}
