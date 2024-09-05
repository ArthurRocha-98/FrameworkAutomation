package Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunnerBase {

    static webdriver driver;


    public static WebDriver getDriver() {

        if (driver == null){
            getDriverChrome();
        }
        return driver;
    }

    public static WebDriver getDriverChrome() {

        ChromeOptions options = new ChromeOptions();
 //       options.addArguments("--headless"); //Desconectar essa linha caso queira rodar o chrome em modo minimizado
        driver = new ChromeDriver(options);

        return driver;
    }
}
