package StepDefinitions;

import Pages.Locator;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Utilities.WBA.quit;

public class _02_CertificationManagmentAttestation {

    Locator lc=new Locator();
    Faker an = new Faker();
    String newAttestation = an.job().keySkills();

    @Given("Navigate to Attestations")
    public void navigateToAttestations() {
        lc.myClick(lc.humanResources1);
        lc.myClick(lc.setup2);
        lc.myClick(lc.attestations);
    }

    @When("Create a new attestation")
    public void createANewAttestation() throws AWTException {

        lc.myClick(lc.addAttestationButton);
        lc.mySendKeys(lc.pcInput,newAttestation);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //a.myClick(a.saveButton);
    }

    @And("user edit and delete attestation")
    public void userEditandDeleteAttestation() throws AWTException {
        lc.editandDeleteAttestation(newAttestation);
        quit();

    }
}


