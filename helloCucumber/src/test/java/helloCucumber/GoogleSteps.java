package helloCucumber;

import Utilities.BaseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GoogleSteps {

    private List<String> keys;

    @Given("User is on Google Home Page")
    public void get_url() {
        BaseDriver.Driver().get("http://www.google.com");
    }

    @When("User searches for")
    public void EnterSearchText(DataTable dt) {
        this.keys = dt.asList(String.class);
        for(int i=0;i<this.keys.size();i++){
            try{
                BaseDriver.Driver().findElement(By.name("q")).sendKeys(this.keys.get(i));
                Thread.sleep(2000);
            } catch(Exception e){}
        }
    }

    @And("Click Search Button")
    public void ClickSearch() {
        BaseDriver.Driver().findElement(By.name("btnK")).click();
    }

    @Then("Search Results for Cucumber is available")
    public void VerifyResult(){
        WebElement e = BaseDriver.Driver().findElement(By.id("result-stats"));
        Assert.assertFalse(e.isDisplayed());
    }
}
