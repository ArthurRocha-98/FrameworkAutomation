package Utils;

import Runners.RunCucumberTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Runners.RunnerBase.getDriver;

public class Utils extends RunCucumberTest {

    public static void clicar(WebElement elemento) {
        elemento.click();
    }

    public static void digitar(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

    public static void esperarElementoAparecer(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public static void esperarElementoDesaparecer(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(elemento));
    }

    public static void  selecionarComboBox(WebElement elemento, String texto) {
        select listaSuspensa = new Select(elemento);
        listaSuspensa.selectByVisibleText(texto);
    }

    public static void validarPopUp() throws InterruptedException {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
}
