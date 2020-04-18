package helloCucumber;

import Utilities.BaseDriver;
import Utilities.Screenshot;
import cucumber.api.Result;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.runtime.StepDefinition;
import org.hamcrest.Condition;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;

public class Hooks {
    @Before
    public void beforeScenario(Scenario scenario){
        System.out.format("Thread ID - %2d - %s from feature file.\n",
                Thread.currentThread().getId(), scenario);
        BaseDriver.setDriver();
    }

    @After
    public void afterScenario(Scenario scenario){
        System.out.println("Test Status -> "+scenario.getStatus());
        if(scenario.isFailed()){
            Screenshot.takeScreenshot(scenario);
        }
        BaseDriver.Driver().close();
    }
    @AfterClass
    public void Wrap(){
        BaseDriver.Driver().quit();
    }

//    @BeforeStep
//    public void beforestep(){
//        System.out.println("before step ");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("after step ");
//    }
}
