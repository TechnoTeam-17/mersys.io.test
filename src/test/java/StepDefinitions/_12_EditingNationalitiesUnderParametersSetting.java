package StepDefinitions;

import Pages.Locator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.util.List;


public class _12_EditingNationalitiesUnderParametersSetting {

    Locator lc=new Locator();
    String natNameStr = "Team17";
    String newNatNameStr = "Team17edit";

    @When("the user navigates to nationalities")
    public void theUserNavigatesToNationalities(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lc.getWebElement(strLinkList.get(i));
            lc.myClick(linkWebElement);
        }
    }

    @And("the user adds a nationality")
    public void theUserAddsANationality() {
        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.sendName, natNameStr);
        lc.myClick(lc.saveButton);
    }

    @Then("the nationality should be added successfully")
    public void theNationalityShouldBeAddedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user edits the nationality")
    public void theUserEditsTheNationality() {
        lc.mySendKeys(lc.searchBox, natNameStr);
        lc.myClick(lc.searchButton);
        lc.wait.until(ExpectedConditions.elementToBeClickable(lc.searchButton));
        lc.myClick(lc.editButton);
        lc.mySendKeys(lc.sendName, newNatNameStr);
        lc.myClick(lc.saveButton);
    }

    @Then("the nationality should be edited successfully")
    public void theNationalityShouldBeEditedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user uses the search function to find a nationality")
    public void theUserUsesTheSearchFunctionToFindANationality() {
        lc.mySendKeys(lc.searchBox, newNatNameStr);
        lc.myClick(lc.searchButton);
        lc.wait.until(ExpectedConditions.elementToBeClickable(lc.searchButton));
    }

    @Then("the matching nationalities should be displayed successfully")
    public void theMatchingNationalitiesShouldBeDisplayedSuccessfully() {
        Assert.assertEquals(lc.positionNameText.getText(), newNatNameStr);
    }

    @And("the user deletes a nationality")
    public void theUserDeletesANationality() {
        lc.mySendKeys(lc.searchBox, newNatNameStr);
        lc.myClick(lc.searchButton);
        lc.wait.until(ExpectedConditions.elementToBeClickable(lc.searchButton));
        lc.myClick(lc.deleteImageButton);
        lc.myClick(lc.deleteDialogButton);
    }

    @Then("the nationality should be deleted successfully")
    public void theNationalityShouldBeDeletedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }
}

