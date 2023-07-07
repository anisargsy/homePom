import driver_manager.DriverManager;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.RegisterUserPage;

public class RegisterUserTest extends BasePage {

    public static String userName = "John";
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getDriver();
        RegisterUserPage registerPage = new RegisterUserPage(driver);
        registerPage.goToStartPage();

        //Verify that home page is visible successfully
        boolean equalsUrl = registerPage.equalsCurrentURL(startPage);
        if (equalsUrl) {
            System.out.println("Home page is visible");
        } else {
            System.out.println("Home page is not visible");
        }

        //Click on 'Signup / Login' button
        registerPage.clickOnSignupLoginButton();

        //Verify 'New User Signup!' is visible
        boolean equalsSignUpUrl = registerPage.equalsCurrentURL(signUpPageURL);
        if (equalsSignUpUrl) {
            System.out.println("New User Signup! is visible");
        } else {
            System.out.println("New User Signup! is not visible");
        }

        //Enter name and email address
        registerPage.setName(userName);
        registerPage.setEmailAddress("joomijnuijdsjniklopoip@gmail.com");

        //Click 'Signup' button
        registerPage.clickOnSignupButton();
        Thread.sleep(1000);
        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (registerPage.enterAccountInformationIsVisible()) {
            System.out.println("ENTER ACCOUNT INFORMATION is visible");
        } else {
            System.out.println("ENTER ACCOUNT INFORMATION is not visible");
        }
        Thread.sleep(1000);
        //Fill details: Title, Name, Email, Password, Date of birth
        registerPage.radioButton();
        registerPage.enterPassword("1234");
        registerPage.daysOptions("12");
        registerPage.monthOptions("May");
        registerPage.yearsOptions("2000");


        //Select checkbox 'Sign up for our newsletter!'
        registerPage.checkboxSignUp();

        //Select checkbox 'Receive special offers from our partners!'
        registerPage.checkboxReceiveSpecial();
        //details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        registerPage.firstName("Ani");
        registerPage.lastName("Sargsyan");
        registerPage.companyName("Company Name");
        registerPage.addressNameFirst("New York, NY 54321");
        registerPage.addressNameSecond("New York, NY 54321");
        registerPage.countryName("Country Name");
        registerPage.stateName("State Name");
        registerPage.city("City Name");
        registerPage.zipcode("12/23");
        registerPage.mobile_number("8141234567");
        Thread.sleep(3000);

        //Click 'Create Account button'
        registerPage.createAccountButton();


        //Verify that 'ACCOUNT CREATED!' is visible
        if (registerPage.accountCreatedIsVisible()) {
            System.out.println("ACCOUNT CREATED!");
        } else {
            System.out.println("ACCOUNT CREATED! is not visible");
        }

        //Click 'Continue' button
        registerPage.clickContinueButton();

        //Verify that 'Logged in as username' is visible
        registerPage.loggedUsernameIsVisible();


        //Click 'Delete Account' button
        registerPage.deleteAccount();

        //Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        if (registerPage.accountDeletedText()) {
            System.out.println("ACCOUNT DELETED!");

        } else System.out.println("ACCOUNT DELETED! is not deleted");
        registerPage.closeDriver();
    }

}
