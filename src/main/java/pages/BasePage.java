package pages;

import driver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import until.WaitUntil;

public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public static String startPage = "https://www.automationexercise.com/";
    public static String signUpPageURL = "https://www.automationexercise.com/login";
    public WebDriver driver;

    public void setDriver(WebDriver driver) {
        driver.manage().window().maximize();
        this.driver = driver;
    }

    public BasePage() {
        this.driver = DriverManager.getDriver();
    }

    public WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));

    }

    public WebElement findByCss(String css) {
        return driver.findElement(By.cssSelector(css));
    }

    public WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    public void clickOnWebElement(By by) {
        WaitUntil.waitElementLocatedBecomeClickable(driver, by);
        getWebElement(by).click();
    }

    public StartPage goToStartPage() {
        DriverManager.getDriver().get(startPage);
        return new StartPage();
    }


}
