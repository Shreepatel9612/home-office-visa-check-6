package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(css = "#response option")
    List<WebElement> dropdownOptions;


    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("Selecting nationality");
        Reporter.log("Selecting nationality");
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on next button");
        Reporter.log("Clicking on next button");
    }

    public List<WebElement> getDropdownOptions() {
        return dropdownOptions;
    }
}
