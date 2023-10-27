
package StepDefinitions;

import Pages.Locator;
import Utilities.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class _03_DocumentTypesManegment{

    Locator lc=new Locator();

    @Given("Navigate to Document Types")
    public void navigate_to_document_types() {
        lc.myClick(lc.Setup);
        lc.myClick(lc.Parameters);
        lc.myClick(lc.DocumentTypes);
    }

    @When("Create a new document")
    public void create_a_new_document() {
        lc.myClick(lc.addBtn);
        lc.mySendKeys(lc.Name, "Education");
        lc.myClick(lc.StageBtn);
        lc.myClick(lc.StudentRegistrationBtn);
        new Actions(WBA.getDriver()).sendKeys(Keys.ESCAPE).perform();
        lc.myClick(lc.SaveBtn);
    }

    @And("edit a document")
    public void user_edit_document() {
        lc.mySendKeys(lc.searchInput,"Education");
        lc.myClick(lc.searchButton);
        lc.myClick(lc.EditBtn);
        lc.mySendKeys(lc.Name, "Neslihan");
        lc.myClick(lc.SaveBtn);
    }
    @Then("delete document")
    public void delete_document() {
        lc.deleteItem("Neslihan");

    }
    @Then("document should be deleted")
    public void document_should_be_deleted() throws InterruptedException {
        lc.verifyContainsText(lc.successMessage,"Document");
    }
}
