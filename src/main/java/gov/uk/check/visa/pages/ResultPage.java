package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@id='result']")
    WebElement resultMessage;


    public String getResultMessage() {
        log.info("Getting result message");
        Reporter.log("Getting result message");
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage) {
        Assert.assertTrue(getResultMessage().contains(expectedMessage));
    }
}
