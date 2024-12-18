package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(name = "response")
    List<WebElement> reasonForVisitList;


    public void selectReasonForVisit(String reason) {
        for (WebElement visitReason : reasonForVisitList) {
            if (visitReason.getText().equalsIgnoreCase(reason)) {
                clickOnElement(visitReason);
                break;
            }
        }
        log.info("Selecting reason for visit");
        Reporter.log("Selecting reason for visit");
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on next button");
        Reporter.log("Clicking on next button");
    }
}
