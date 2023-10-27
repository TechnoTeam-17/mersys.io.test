package StepDefinitions;

import Pages.Locator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _11_EditingDiscountsUnderParametersSetting {

    Locator lc=new Locator();

    String descriptionName = "Team17";
    String integrationCode = "t17";
    String priority = "%10";
    String editDescriptionName = "Team17edit";
    String editIntegrationCode = "t17edit";
    String editPriority = "%5";

    @When("the user navigates to setup")
    public void theUserNavigatesToSetup(DataTable links) {

                List<String> strLinkList = links.asList(String.class);
                for (int i = 0; i < strLinkList.size(); i++) {
                    WebElement linkWebElement = lc.getWebElement(strLinkList.get(i));
                    lc.myClick(linkWebElement);
                }
            }

    @And("the user creates a new discount")
    public void theUserCreatesANewDiscount() {
        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.descriptionName, descriptionName);
        lc.mySendKeys(lc.integrationCode, integrationCode);
        lc.mySendKeys(lc.priority, priority + Keys.ENTER);
        lc.myClick(lc.saveButton);
    }

    @Then("the discount document should be added successfully")
    public void theDiscountDocumentShouldBeAddedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user edits an existing new discount")
    public void theUserEditsAnExistingNewDiscount() {
        lc.mySendKeys(lc.descriptionSearch, descriptionName);
        lc.myClick(lc.searchButton);
        lc.wait.until(ExpectedConditions.elementToBeClickable(lc.searchButton));
        lc.myClick(lc.editButton);
        lc.mySendKeys(lc.descriptionName, editDescriptionName);
        lc.mySendKeys(lc.integrationCode, editIntegrationCode);
        lc.mySendKeys(lc.priority, editPriority + Keys.ENTER);
        lc.myClick(lc.saveButton);
    }

    @Then("the new discount should be edited successfully")
    public void theNewDiscountShouldBeEditedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user deletes an existing new discount")
    public void theUserDeletesAnExistingNewDiscount() {
        lc.mySendKeys(lc.descriptionSearch, editDescriptionName);
        lc.myClick(lc.searchButton);
        lc.wait.until(ExpectedConditions.elementToBeClickable(lc.searchButton));
        lc.myClick(lc.deleteImageButton);
        lc.myClick(lc.deleteDialogButton);
    }

    @Then("the new discount should be deleted successfully")
    public void theNewDiscountShouldBeDeletedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }
}