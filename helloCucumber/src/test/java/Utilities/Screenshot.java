package Utilities;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Screenshot {
    public static void takeScreenshot(Scenario s){
        final byte[] screenshot = ((TakesScreenshot) BaseDriver.Driver()).getScreenshotAs(OutputType.BYTES);
        s.embed(screenshot, "image/png");
    }
}
