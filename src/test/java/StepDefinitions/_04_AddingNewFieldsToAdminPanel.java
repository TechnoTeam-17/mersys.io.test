
package StepDefinitions;

import Pages.Locator;
import io.cucumber.java.en.*;

public class _04_AddingNewFieldsToAdminPanel {

    Locator lc=new Locator();

    @Given("Navigate to Fields Page")
    public void navigate_to_fields_page() {
        lc.myClick(lc.Setup);
        lc.myClick(lc.Parameters);
        lc.myClick(lc.Fields);
    }

    @When("Create a new Field")
    public void create_a_new_field() {
        lc.myClick(lc.addBtn);
        lc.mySendKeys(lc.Name, "Nord Europa");
        lc.mySendKeys(lc.Code, "12345");
        lc.myClick(lc.SaveBtn);
    }

    @And("edit a Field")
    public void edit_a_field() {

        lc.mySendKeys(lc.searchInput,"Nord Europa");
        lc.myClick(lc.searchNameBtn);
        lc.myClick(lc.EditBtn);
        lc.mySendKeys(lc.Name, "East Europa");
        lc.myClick(lc.SaveBtn);
    }

    @Then("delete a Field")
    public void delete_a_field() {
        lc.deleteItem("East Europa");

    }

    @Then("User should delete successfully")
    public void user_should_delete_successfully() throws InterruptedException {
        lc.verifyContainsText(lc.successMessage, "deleted");
    }

}




