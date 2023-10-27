package StepDefinitions;

import Pages.Locator;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utilities.WBA.quit;

public class _01_PositionCategoriesManagement {
    Locator lc=new Locator();
    Faker fk = new Faker();
    String newCategory = fk.commerce().department();
    String categoryFaker=fk.commerce().department();
    @Given("Navigate to Position Categories")
    public void navigateToPositionCategories() {
        lc.myClick(lc.humanResources1);
        lc.myClick(lc.setup2);
        lc.myClick(lc.positionCategories);
    }

    @When("Create a new Category")
    public void createANewCategory() {

        lc.myClick(lc.addPositionCategoryButton);
        lc.mySendKeys(lc.pcInput,newCategory);
        lc.myClick(lc.saveButton);
    }
    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("user edit and delete position category")
    public void userEditandDeletePositionCategory() {
        lc.editandDeleteItem(newCategory);
        quit();
    }
}




