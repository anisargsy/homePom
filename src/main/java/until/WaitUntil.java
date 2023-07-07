package until;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUntil {
    static Duration TIMEOUT = Duration.ofSeconds(10);

    public static void waitElementLocatedBecomeVisible(WebDriver driver, By by, Boolean exceptionOnFail) {
        Wait<WebDriver> wait = null;
        if (exceptionOnFail) {
            wait = new WebDriverWait(driver, TIMEOUT);
        } else {
            wait = new FluentWait<>(driver).withTimeout(TIMEOUT).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchWindowException.class);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitElementLocatedBecomeClickable(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitElementLocatedBecomeInvisible(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void waitFrameToBecomeVisibleAndSwitchToIt(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }
}

