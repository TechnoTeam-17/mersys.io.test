package Pages;

import Utilities.Events;
import Utilities.WBA;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class Locator extends Events {

    public Locator() {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    //US00 Locater

    @FindBy(id="mat-input-0")
    public WebElement username;
    @FindBy(id="mat-input-1")
    public WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "(//span[text()='Techno Study Intern School'])")
    private WebElement txtTechnoStudy;


    //US01 Locater
    @FindBy(xpath="(//span[text()='Setup'])[3]")
    public WebElement setup2;
    @FindBy(xpath="(//span[text()='Human Resources'])[1]")
    public WebElement humanResources1;
    @FindBy(xpath="(//span[text()='Position Categories'])[1]")
    public WebElement positionCategories;
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'POSITION_CATEGORY')]")
    public WebElement addPositionCategoryButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement pcInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath="//ms-edit-button[contains(@tooltip,'POSITION_CATEGORY')]")
    public WebElement editPositionCategory;
    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;
    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;
    @FindBy(xpath="(//ms-edit-button//button)[1]")
    public WebElement editCategoryButton1;
    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;
    @FindBy(xpath="//button [@type='submit']")
    public WebElement deleteDialogButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']")
    private WebElement editTypebar;

    Faker fk = new Faker();
    String categoryfaker2=fk.commerce().department();
    public void editandDeleteItem(String searchText) {
        mySendKeys(searchInput,searchText);
        myClick(searchButton);

        WebDriverWait wait=new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(10));
        myClick(editCategoryButton1);
        mySendKeys(pcInput, categoryfaker2);
        myClick(saveButton);
        myClick(deleteImageButton);
        myClick(deleteDialogButton);
    }

    //US02 Locater
    @FindBy(xpath="(//ms-edit-button//button)[1]")
    public WebElement editCategoryButton2;
    Faker faker = new Faker();
    String categoryfakerattestation=faker.job().keySkills();

    @FindBy(xpath="(//span[text()='Attestations'])[1]")
    public WebElement attestations;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ATTESTATION')]")
    public WebElement addAttestationButton;

    public void editandDeleteAttestation(String searchText) throws AWTException {
        mySendKeys(searchInput,searchText);
        myClick(searchButton);

        myClick(editCategoryButton2);
        mySendKeys(pcInput, categoryfakerattestation);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // myClick(saveButton);
        myClick(deleteImageButton);
        WebDriverWait wait=new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(10));
        myClick(deleteDialogButton);
    }

    //US03 Locater

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement Setup;
    @FindBy (xpath = "//*[text()='Parameters']")
    public WebElement Parameters;
    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement DocumentTypes;
    @FindBy(css = "ms-add-button")
    public WebElement addBtn;
    @FindBy(css = "ms-dialog-content input[data-placeholder='Name']")
    public WebElement Name;
    @FindBy(xpath="(//*[@role='combobox'])[3]")
    public WebElement StageBtn;
    @FindBy(xpath="(//*[@role='option'])[1]")
    public WebElement StudentRegistrationBtn;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement SaveBtn;
    @FindBy(css = "ms-edit-button[class='ng-star-inserted']")
    public WebElement EditBtn;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    public void deleteItem(String searchText) {
        mySendKeys(searchInput, searchText);
        myClick(searchButton);
        myClick(deleteImageBtn);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        myClick(deleteDialogBtn);
        // bu kodlar bir sitede belirlenen birseyi silmeyi sagliyor. once search yapiyor
        // sonra bulduktan sonra delete yapiyor.

    }

    //US04 Locater


    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement Fields;
    @FindBy(css = "ms-add-button")
    public WebElement addBtn1;
    @FindBy(css = "ms-dialog-content input[data-placeholder='Code']")
    public WebElement Code;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchNameBtn;

    @FindBy(xpath = "//div[contains(text(),'Field successfully deleted')]")
    public WebElement successMessage1;




    //US05 Locater
    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResource;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupUnderHR;

    @FindBy(xpath = "//span[text()='Positions']")
    public WebElement positionUnderHR;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortName;

    //US06 Locater
    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupUnderEducation;
    @FindBy(xpath = "//span[text()='Subject Categories']")
    public WebElement subjectCategories;
    @FindBy(css = "ms-dialog-content input[data-placeholder='Code']")
    public WebElement code;

    //US07 Locater

    @FindBy(xpath = "(//span[text()='School Setup'])[1]")
    public WebElement School_Setup;
    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement Locations;

    @FindBy(css="[data-placeholder='Name']")
    public WebElement name;
    @FindBy(css="[data-placeholder='Short Name']")
    public WebElement sname;
    @FindBy(xpath="(//span[text()='Classroom'])")
    public WebElement location_type;
    @FindBy(xpath="(//span[text()=' Laboratory '])")
    public WebElement location_type1;
    @FindBy(css="[data-placeholder='Capacity']")
    public WebElement capacity;
    @FindBy(xpath="(//span[text()='Save'])")
    public WebElement Save;
    @FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[11]")
    public WebElement Edit;
    @FindBy(xpath="(//span[@class='mat-ripple mat-mdc-button-ripple'])[3]")
    public WebElement Save2;
    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement delete;
    @FindBy(xpath="(//strong[text()='Delete'])")
    public WebElement dialogdel;
    @FindBy(xpath="(//button[@type='submit'])")
    public WebElement delete2;
    @FindBy(xpath="(//div[@class='mdc-switch__handle'])[1]")
    public WebElement activate;


    //US08 Locater
    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement Departments;
    //  @FindBy(xpath="//*[@id='ms-table-0_buttons']/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    //  public WebElement addButton;

    // @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")

    @FindBy(css="[formcontrolname='name']")
    public WebElement name2;
   // @FindBy(css="[data-placeholder='Code']")
    //public WebElement code;

    @FindBy(xpath="(//span[text()='Section'])")
    public WebElement Section;

    @FindBy(css="[data-placeholder='Short Name']")
    public WebElement Shortname;

    @FindBy(xpath="//span[text()='Add']")
    public WebElement addButton1;
    @FindBy(xpath="(//span[text()='Add'])")
    public WebElement addButton2;

    @FindBy(xpath="//span[text()='Department Parameters']")
    public WebElement DepartmantsP;

    @FindBy(css="[data-placeholder='Key']")
    public WebElement key;

    @FindBy(css="[data-placeholder='Value']")
    public WebElement value;


    //********************
    //US09 Locater
    @FindBy(css = "[class='nav-link-title ng-tns-c2089661534-6 ng-star-inserted']")
    public WebElement setup;
    @FindBy (css = "[class='ng-tns-c2089661534-7 ng-tns-c2089661534-6 nav-collapsable nav-item ng-star-inserted']")
    public WebElement parameters;
    @FindBy(css = "div > fuse-nav-vertical-item:nth-child(11) > a > span")
    public  WebElement bankAccounts;
    @FindBy(css = "ms-add-button > div > button > span.mat-mdc-button-touch-target")
    public WebElement create;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/bank-account-dialog/ms-dialog/ms-dialog-content/div/mat-form-field[1]/div/div[1]/div/ms-text-field/input")
    public  WebElement name1;
    @FindBy(css = "[data-placeholder=\"IBAN\"]")
    public WebElement iban;
    @FindBy(xpath = "(//span[text()='Currency'])[3]")
    public WebElement currency;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span")
    public  WebElement currencyEUR;
    @FindBy (css = "[data-placeholder='Integration Code']")
    public WebElement code1;
    @FindBy (css = "ms-save-button > button > span.mdc-button__label > fa-icon > svg")
    public WebElement save;
    @FindBy(xpath = "//*[@class='mdc-data-table__content']/tr[1]")
    public WebElement update;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div/bank-account-dialog/ms-dialog/ms-dialog-content/div/mat-slide-toggle/div/label")
    public WebElement inActive;
    @FindBy(xpath = "//*[@id='cdk-drop-list-0']/tbody/tr[1]/td[7]/div[1]/ms-delete-button/button/span[3]")
    public WebElement delete1;
    @FindBy(css = "[class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-accent mat-mdc-button-base']>[class='mdc-button__label']")
    public WebElement deleteEnd;

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public WebDriverWait myWait = new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(20));

    //US10 Locater

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password1;
    @FindBy(css = "input[data-placeholder='Name']")
    public WebElement name3;
    @FindBy(css = "input[type='number']")
    public WebElement order;
    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;
    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement shortName1;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;



    //US11 Locater
    @FindBy(css = "input[data-placeholder='Priority']")
    public WebElement priority;
    @FindBy(css = "[data-placeholder='Description']")
    public WebElement descriptionSearch;
    @FindBy(xpath = "(//input[@data-placeholder='Integration Code'])[2]")
    public WebElement integrationCode;
    @FindBy(xpath = "(//input[@data-placeholder='Description'])[2]")
    public WebElement descriptionName;
    @FindBy(xpath = "//ms-edit-button")
    public WebElement editButton;
    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersSetup;
    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    public WebElement discounts;
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup1;

    //US12 Locater
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement sendName;
    @FindBy(css = "[data-placeholder='Name']")
    public WebElement searchBox;
    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr/td)[2]")
    public WebElement positionNameText;
    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;








    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "loginButton":
                return this.loginButton;
            case "txtTechnoStudy":
                return this.txtTechnoStudy;
            case "humanResource":
                return this.humanResource;
            case "setupUnderHR":
                return this.setupUnderHR;
            case "positionUnderHR":
                return this.positionUnderHR;
            case "shortName":
                return this.shortName;
            case "setup":
                return this.setup;
            case "ditPositionCategory":
                return this.editPositionCategory;
            case "School_Setup":
                return this.School_Setup;
            case "Locations":
                return this.Locations;
            case "name":
                return this.name;
            case "sname":
                return this.sname;
            case "location Type":
                return this.location_type;
            case "capacity":
                return this.capacity;
            case "location_type1":
                return this.location_type1;
            case "Save":
                return this.Save;
            case "Edit":
                return this.Edit;
            case "Save2":
                return this.Save2;
            case "delete":
                return this.delete;
            case "delete1":
                return this.delete1;
            case "delete2":
                return this.delete2;
            case "dialogdel":
                return this.dialogdel;
            case "activate":
                return this.activate;
            case "Departments":
                return this.Departments;
            case "code1":
                return this.code1;
            case "Shortname":
                return this.Shortname;
            case "key":
                return this.key;
            case "value":
                return this.value;
            case "parameters":
                return this.parameters;
                case "grade levels":
                return this.gradeLevels;
             case "education":
                return this.education;
             case "setupUnderEducation":
                return this.setupUnderEducation;
             case "subjectCategories":
                return this.subjectCategories;
            case "addButton":
                return this.addButton;
            case "nameInput":
                return this.nameInput;
            case "code":
                return this.code;
            case "saveButton":
                return this.saveButton;
            case "successMessage":
                return this.successMessage;
            case "priority":
                return this.priority;
            case "descriptionSearch":
                return this.descriptionSearch;
            case "integrationCode":
                return this.integrationCode;
            case "descriptionName":
                return this.descriptionName;
            case "editButton":
                return this.editButton;
            case "parametersSetup":
                return this.parametersSetup;
            case "discounts":
                return this.discounts;
            case "setup1":
                return this.setup1;
            case "nationalities":
                return this.nationalities;

        }
        return null;
    }
}