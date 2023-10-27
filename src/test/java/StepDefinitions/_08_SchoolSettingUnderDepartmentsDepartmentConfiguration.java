package StepDefinitions;

import Pages.Locator;
import Utilities.WBA;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _08_SchoolSettingUnderDepartmentsDepartmentConfiguration {
    Locator lc=new Locator();

    @Given("Click on the element in Setup")
    public void clickOnTheElementInSetup(DataTable links) {

        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lc.getWebElement(strLinkList.get(i));
            lc.myClick(linkWebElement);
        }
    }

    @And("User sending the keys in School Department")
    public void userSendingTheKeysInSchoolDepartment(DataTable value) {

        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = lc.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            lc.mySendKeys(element, word);
        }

    }

    @And("add the keys in Section")
    public void addTheKeysInSection(DataTable value) throws InterruptedException {
        lc.myClick(lc.Section);
        //  lc.myClick(lc.name2);
        //   Action aksiyon= aksiyonlar.moveToElement(lc.name2).click().build();
        //   aksiyon.perform();

        //   lc.mySendKeys(lc.Shortname,"ali");
        //    lc.mySendKeys(lc.name,"veli");
        //    Thread.sleep(3000);
        //    lc.myClick(lc.addButton);

        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = lc.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            lc.mySendKeys(element, word);
        }

    }

    @And("add the keys in Department Parameters")
    public void addTheKeysInDepartmentParameters(DataTable value) throws InterruptedException {
        lc.myClick(lc.DepartmantsP);

        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = lc.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            lc.mySendKeys(element, word);
        }
        Thread.sleep(3000);
    }

    @And("save all info")
    public void saveAllInfo() {
        lc.myClick(lc.saveButton);
    }

    @Then("User edit as name {string}  in School Department")
    public void userEditAsNameInSchoolDepartment(String arg0) {
    }

    @And("check verification step")
    public void checkVerificationStep() {
    }

    @And("delete as name {string}  in School Department")
    public void deleteAsNameInSchoolDepartment(String arg0) {
    }

    @Then("Click to addbutton{int}")
    public void clickToAddbutton(int arg0) {

        lc.myJsClick(lc.addButton2);
    }
}