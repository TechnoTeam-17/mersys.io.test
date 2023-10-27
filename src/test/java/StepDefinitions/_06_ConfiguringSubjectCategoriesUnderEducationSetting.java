package StepDefinitions;

import Pages.Locator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import java.util.List;


public class _06_ConfiguringSubjectCategoriesUnderEducationSetting {
    Locator lc=new Locator();
    @When("Navigates to subject education")
    public void navigatesToSubjectEducation(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (String s : strLinkList) {
            WebElement linkWebElement = lc.getWebElement(s);
            lc.myClick(linkWebElement);
        }
    }

    @And("The user add a subject category")
    public void theUserAddASubjectCategory() {

        String nameFaker= RandomStringUtils.randomAlphanumeric(8);//8 harf
        String codeFaker= RandomStringUtils.randomNumeric(4); // 4 rakam

        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.nameInput,nameFaker);
        lc.mySendKeys(lc.code, codeFaker);
        lc.myClick(lc.saveButton);

    }

    @Then("A subject category should be added successfully")
    public void aSubjectCategoryShouldBeAddedSuccessfully() {lc.verifyContainsText(lc.successMessage,"success");
    }
}



