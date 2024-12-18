package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(id = "response-less-than-6-months")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-more-than-6-months")
    WebElement moreThanSixMonths;


    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess.toLowerCase()) {
            case "less than 6 months":
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
        }
        log.info("Selecting length of stay");
        Reporter.log("Selecting length of stay");
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on next button");
        Reporter.log("Clicking on next button");
    }
}
