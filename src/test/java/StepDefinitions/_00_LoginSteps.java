package StepDefinitions;

import Pages.Locator;
import Utilities.Excel;
import Utilities.WBA;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

public class _00_LoginSteps{

        Locator lc=new Locator();

        @Given("Navigate to Campus")
    public void navigateToCampus() {
        WBA.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password click login button with ApachePOI")
    public void enterUsernameAndPasswordClickLoginButtonWithApachePOI(DataTable dt) {
        List<String> stringList = dt.asList(String.class);
        ArrayList<ArrayList<String>> tablo = Excel.getData
                ("src/test/java/StepDefinitions/TestMersys.io.xlsx", "Sheet1", 2);
        for (ArrayList<String> satir : tablo){
            lc.mySendKeys(lc.getWebElement(stringList.get(0)), satir.get(0));
            lc.mySendKeys(lc.getWebElement(stringList.get(1)), satir.get(1));
        }
        lc.myClick(lc.getWebElement(stringList.get(2)));
    }
    @Then("User should successfully")
    public void userShouldSuccessfully() {
        lc.verifyContainsText(lc.getWebElement("txtTechnoStudy"), "Techno Study");
    }
}


