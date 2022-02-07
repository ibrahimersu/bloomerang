package com.bloomerang.pages;

import com.bloomerang.utilty.ConfigReader;
import com.bloomerang.utilty.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class SubmitPage {


    @FindBy(id = "first-name")
    private WebElement firstNameElm;
    @FindBy(id = "last-name")
    private WebElement lastNameElm;
    @FindBy(id = "email-address")
    private WebElement emailElm;
    @FindBy(id = "phone-number")
    private WebElement phoneElm;
    @FindBy(id = "country")
    private WebElement countryElm;
    @FindBy(id = "street-address")
    private WebElement addressElm;
    @FindBy(id = "city")
    private WebElement cityElm;
    @FindBy(id = "state")
    private WebElement stateElm;
    @FindBy(id = "zip-code")
    private WebElement zipcodeElm;
    @FindBy(xpath = "//input[@placeholder='mm/dd/yyyy']")
    private WebElement volunteerDateElm;
    @FindBy(id = "comment")
    private WebElement commentElm;
    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitBtnElm;
    @FindBy(xpath = "//h2[normalize-space()='Thank you for volunteering!']")
    private WebElement messageElm;
    @FindBy(xpath = "//label[normalize-space()='This field is required.']")
    private WebElement lastNameFieldRequiredElm;
    @FindBy(xpath = "//h2[normalize-space()='Thank you for volunteering!']")
    private List<WebElement> messageElm2;

    public SubmitPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo() {

        Driver.getDriver().get(ConfigReader.read("url"));

    }

    public void fillingInformationFields() {

        Select select1 = new Select(countryElm);
        Select select2 = new Select(stateElm);

        firstNameElm.sendKeys("John");
        lastNameElm.sendKeys("Doe");
        emailElm.sendKeys("john_doe@gmail.com");
        phoneElm.sendKeys("6776065060");
        select1.selectByValue("US");
        addressElm.sendKeys("21 Jump Street");
        cityElm.sendKeys("Metropolis, Evergreen");
        select2.selectByValue("NY");
        zipcodeElm.sendKeys("10036");
        volunteerDateElm.sendKeys("02/06/2022");
        commentElm.sendKeys("Sharing is caring. Caring is sharing. Let's give back to community");

    }

    public void submitBtn() {
        submitBtnElm.submit();
    }

    public WebElement getMessageElm() {
        return messageElm;
    }

    public void fillingInformationWithMissingFields() {

        firstNameElm.sendKeys("Jane");
        lastNameElm.sendKeys("Doe");
        emailElm.sendKeys("jane_doe@gmail.com");


    }

    public WebElement getLastNameFieldRequiredElm() {
        return lastNameFieldRequiredElm;
    }


    public void fillingPartialInformationFields() {
        firstNameElm.sendKeys("Jane");
        lastNameElm.sendKeys("Doe");
        emailElm.sendKeys("jane_doe@gmail.com");
        volunteerDateElm.sendKeys("03/06/2022");

    }
}







