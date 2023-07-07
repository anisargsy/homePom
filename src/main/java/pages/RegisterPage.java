package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//h2[contains(., 'Enter Account Information')]")
    private WebElement enterAccountInformationIsVisibleElement;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement loginSignUpButton;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement setEmailAddressButton;
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement clickOnSignupLoginButton;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement clickOnSignupButton;
    @FindBy(id = "id_gender1")
    private WebElement radioButton;
    @FindBy(id = "password")
    private WebElement enterPassword;
    @FindBy(id = "days")
    private WebElement SelectDays;

    @FindBy(id = "months")
    private WebElement SelectMonths;

    @FindBy(id = "years")
    private WebElement SelectYears;

    @FindBy(xpath = "//input[@type='checkbox' and @id='newsletter']")
    private WebElement checkboxSignUp;

    @FindBy(xpath = "//input[@type='checkbox' and @id='optin']")
    private WebElement checkboxReceiveSpecial;

    @FindBy(id = "first_name")
    private WebElement first_name;

    @FindBy(id = "last_name")
    private WebElement last_name;

    @FindBy(id = "company")
    private WebElement company_name;

    @FindBy(id = "address1")
    private WebElement enterAddressName1;

    @FindBy(id = "address2")
    private WebElement enterAddressName2;

    @FindBy(id = "country")
    private WebElement countryName;

    @FindBy(id = "state")
    private WebElement stateName;

    @FindBy(id = "city")
    private WebElement cityName;

    @FindBy(id = "zipcode")
    private WebElement enterZipcode;

    @FindBy(id = "mobile_number")
    private WebElement mobile_number;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement clickOnCreateAccountButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static String getWebElementText(By by, WebDriver driver) {
        return driver.findElement(by).getText();
    }

    public void createAccountButton() {
        clickOnCreateAccountButton.click();
    }

    public RegisterPage city(String city) {
        cityName.sendKeys(city);
        return this;
    }

    public RegisterPage zipcode(String zipcode) {
        enterZipcode.sendKeys(zipcode);
        return this;
    }

    public RegisterPage mobile_number(String mobile) {
        mobile_number.sendKeys(mobile);
        return this;
    }

    public RegisterPage countryName(String country) {
        countryName.sendKeys(country);
        return this;
    }

    public RegisterPage stateName(String state) {
        stateName.sendKeys(state);
        return this;
    }

    public RegisterPage addressNameSecond(String address2) {
        enterAddressName2.sendKeys(address2);
        return this;
    }

    public RegisterPage addressNameFirst(String address1) {
        enterAddressName1.sendKeys(address1);
        return this;
    }

    public RegisterPage companyName(String company) {
        company_name.sendKeys(company);
        return this;
    }

    public RegisterPage lastName(String name) {
        last_name.sendKeys(name);
        return this;
    }

    public RegisterPage firstName(String name) {
        first_name.sendKeys(name);
        return this;
    }

    public RegisterPage checkboxReceiveSpecial() {
        checkboxReceiveSpecial.click();
        return this;
    }

    public RegisterPage checkboxSignUp() {
        checkboxSignUp.click();
        return this;
    }

    public RegisterPage yearsOptions(String year) {
        Select daysOptions = new Select(SelectYears);
        daysOptions.selectByVisibleText(year);
        return this;
    }

    public RegisterPage monthOptions(String month) {
        Select daysOptions = new Select(SelectMonths);
        daysOptions.selectByVisibleText(month);
        return this;
    }

    public RegisterPage daysOptions(String days) {
        Select daysOptions = new Select(SelectDays);
        daysOptions.selectByVisibleText(days);
        return this;
    }

    public RegisterPage enterPassword(String password) {
        enterPassword.sendKeys(password);
        return this;
    }

    public RegisterPage radioButton() {
        radioButton.click();
        return this;
    }

    public boolean enterAccountInformationIsVisible() {
        return enterAccountInformationIsVisibleElement.isDisplayed();
    }

    public RegisterPage setName(String login) {
        loginSignUpButton.sendKeys(login);
        return this;
    }

    public RegisterPage setEmailAddress(String mail) {
        setEmailAddressButton.sendKeys(mail);
        return this;
    }

    public RegisterPage clickOnSignupLoginButton() {
        clickOnSignupLoginButton.click();
        return this;
    }

    public RegisterPage clickOnSignupButton() {
        clickOnSignupButton.click();
        return this;
    }

    public boolean equalsCurrentURL(String url) {
        String actualURL = driver.getCurrentUrl();
        return url.equals(actualURL);
    }

}
