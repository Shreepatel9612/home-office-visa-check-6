package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationSteps {

    StartPage startPage = new StartPage();
    SelectNationalityPage selectNationalityPage = new SelectNationalityPage();
    ReasonForTravelPage reasonForTravelPage = new ReasonForTravelPage();
    DurationOfStayPage durationOfStayPage = new DurationOfStayPage();
    FamilyImmigrationStatusPage familyStatusPage = new FamilyImmigrationStatusPage();
    WorkTypePage workTypePage = new WorkTypePage();
    ResultPage resultPage = new ResultPage();

    @Given("I am on home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on the start button")
    public void iClickOnStartButton() {
        startPage.clickStartNow();
    }

    @When("I select nationality {string}")
    public void iSelectNationality(String nationality) {
        selectNationalityPage.selectNationality(nationality);
        selectNationalityPage.clickNextStepButton();
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
    }

    @When("I select reason {string}")
    public void iSelectReason(String reason) {
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
    }

    @When("I select intendent to stay for {string}")
    public void iSelectIntendentToStayFor(String stayDuration) {
        durationOfStayPage.selectLengthOfStay(stayDuration);
        durationOfStayPage.clickNextStepButton();
    }

    @When("I select job type {string}")
    public void iSelectJobType(String jobType) {
        workTypePage.selectJobType(jobType);
        workTypePage.clickNextStepButton();
    }

    @When("I select immigration status {string}")
    public void iSelectImmigrationStatus(String status) {
        familyStatusPage.selectImmigrationStatus(status);
        familyStatusPage.clickNextStepButton();
    }

    @Then("I should see the result {string}")
    public void iShouldSeeTheResult(String expectedMessage) {
        resultPage.confirmResultMessage(expectedMessage);
    }


}
