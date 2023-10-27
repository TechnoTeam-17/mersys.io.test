package StepDefinitions;

import Pages.Locator;
import Utilities.WBA;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static Utilities.WBA.quit;

public class _10_ParametersUnderSettingClassLevelsGradeLevels {

    Locator lc=new Locator();
    
    String gradeName = "Team17";
    String shortName = "Team";
    String order = "17";
    String maxApplicationCount = "17";
    String newGradeName = "Team16";

    public WebDriverWait wait = new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(20));

    @When("the user navigates to grade levels")
    public void theUserNavigatesToGradeLevels(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lc.getWebElement(strLinkList.get(i));
            lc.myClick(linkWebElement);
        }
    }

    @And("the user adds a new grade level")
    public void theUserAddsANewGradeLevel() {
        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.name, gradeName);
        lc.mySendKeys(lc.shortName, shortName);
        lc.mySendKeys(lc.order, order);
        lc.mySendKeys(lc.maxApplicationCount, maxApplicationCount);
        lc.myClick(lc.saveButton);
    }

    @Then("the grade level should be added successfully")
    public void theGradeLevelShouldBeAddedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user edits a grade level")
    public void theUserEditsAGradeLevel() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));

        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(gradeName)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-edit-button)[" + i + "]";
                WebElement gEdit = WBA.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                lc.mySendKeys(lc.name, newGradeName);
                lc.myClick(lc.saveButton);
                break;
            }
        }
    }

    @Then("the grade level should be edited successfully")
    public void theGradeLevelShouldBeEditedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user deletes a grade level")
    public void theUserDeletesAGradeLevel() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));

        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(newGradeName)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-delete-button)[" + i + "]";
                WebElement gEdit = WBA.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                lc.myClick(lc.deleteDialogBtn);
                break;
            }
        }
    }

    @Then("the grade level should be deleted successfully")
    public void theGradeLevelShouldBeDeletedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
        quit();
    }

}

