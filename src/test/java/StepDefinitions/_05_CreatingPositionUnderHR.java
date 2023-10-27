package StepDefinitions;


import Pages.Locator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_CreatingPositionUnderHR {

    Locator lc=new Locator();


    @When("Navigates to HR")
    public void navigatesToGradeLevels(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lc.getWebElement(strLinkList.get(i));
            lc.myClick(linkWebElement);
        }
    }

    @And("the user add a new position")
    public void theUserAddANewPosition() {

        String name= RandomStringUtils.randomAlphanumeric(8);//8 harf
        String shortName= RandomStringUtils.randomNumeric(4); // 4 rakam

        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.nameInput,name);
        lc.mySendKeys(lc.shortName, shortName);
        lc.myClick(lc.saveButton);
    }

    @Then("a new position should be added successfully")
    public void aNewPositionShouldBeAddedSuccessfully() {
        lc.verifyContainsText(lc.successMessage,"success");

    }
}
