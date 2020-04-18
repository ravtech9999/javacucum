package helloCucumber;

import Utilities.BaseDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FacebookSteps {
    @Given("User is on Facebook Home Page")
    public void loginFacebook(){
        BaseDriver.Driver().get("http://www.facebook.com");
    }
}
