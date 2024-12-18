package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(id = "response-yes")
    WebElement yesRadioButton;

    @CacheLookup
    @FindBy(id = "response-no")
    WebElement noRadioButton;


    public void selectImmigrationStatus(String status) {
        switch (status.toLowerCase()) {
            case "yes":
                clickOnElement(yesRadioButton);
                break;
            case "no":
                clickOnElement(noRadioButton);
                break;
        }
        log.info("Selecting immigration status");
        Reporter.log("Selecting immigration status");
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on next button");
        Reporter.log("Clicking on next button");
    }
}
