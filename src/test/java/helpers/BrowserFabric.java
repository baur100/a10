package helpers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFabric {
    public static WebDriver getDriver(BrowserType type){
        return type==BrowserType.CHROME ? getChromeDriver() : getFirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("window-size=1400,1000");
//        return new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver","chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        System.setProperty("webdriver.chrome.args", "--disable-logging");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("window-size=1024,768"); // Bypass OS security model
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
//        FirefoxOptions options = new FirefoxOptions();
//        options.addArguments("--headless");
//        options.addArguments("--width=1400");
//        options.addArguments("--height=1000");
//        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        System.setProperty("webdriver.gecko.driver","geckodriver");
        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        System.setProperty("webdriver.gecko.args", "--disable-logging");
//        System.setProperty("webdriver.gecko.silentOutput", "true");
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
//        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--width=1920"); // Bypass OS security model
        options.addArguments("--height=1080");
        return new FirefoxDriver(options);
    }

    private static WebDriver getOperaDriver() {
        WebDriverManager.operadriver().setup();
        return new OperaDriver();
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
