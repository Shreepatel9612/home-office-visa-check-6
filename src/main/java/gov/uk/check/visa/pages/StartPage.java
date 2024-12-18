package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Start now')]")
    WebElement startNowButton;

    public void clickStartNow() {
        clickOnElement(startNowButton);
        Reporter.log("Click on start now button");
        log.info("Click on start now button");
    }
}
