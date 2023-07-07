package driver_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverConfig {
    public static ChromeOptions configChrome() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

  /*      options.setCapability(CapabilityType.BROWSER_NAME, Browser.CHROME);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);*/

        return options;

    }
}
