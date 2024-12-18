package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CountryDropdownSteps {

    StartPage startPage = new StartPage();
    SelectNationalityPage selectNationalityPage = new SelectNationalityPage();

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        startPage.clickStartNow();
    }

    @Then("I can see the following countries in the dropdown:")
    public void iCanSeeTheFollowingCountriesInTheDropdown(DataTable dataTable) {
        List<List<String>> country = dataTable.asLists(String.class);
        for (List<String> list : country) {
            System.out.println(list);
        }
    }
}
