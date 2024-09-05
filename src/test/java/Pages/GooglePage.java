package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Runners.RunnerBase.getDriver;
import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class GooglePage extends RunCucumberTest {

    @FindBy(id = "input")
    private WebElement barraDeBusca;

    @FindBy(css = "div.bg_Bd.bd_eb.gb_qd > div:nth-child(1) > div > div:nth-child(1) a")
    private WebElement btnGmail;

    @FindBy(xpath = "//*[@id='gb']/div[2]/div[3]/div[1]/div/div[2]/a")
    private WebElement btnImagens;

    public void GooglePage(){
        pageFactory.initElements(getDriver(). page this);
    }

    public void digitarNaBarraDeBusca() {
        digitar(barraDeBusca,"teste de velociade");
    }

}
