package tnm.com.co.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://tnm.techandsolve.com")
public class  PortalLoginPage extends PageObject {

    private String winHandleBefore;

    public void accessTechAndManager() {
       getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       getDriver().findElement(By.id("googleLog")).click();
       changeToWindow();
    }

    private void changeToWindow(){
        winHandleBefore = getDriver().getWindowHandle();
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
    }

    public void enterCredentials(String email){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().findElement(By.id("identifierId")).sendKeys(email);

    }

    public void buttonNext() {
        getDriver().findElement(By.className("RveJvd")).click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void password(String psw) {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().findElement(By.name("password")).sendKeys(psw);

    }


    public void nextLogin() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().findElement(By.className("RveJvd")).click();
    }
    public String getApplicationTitle() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().switchTo().window(winHandleBefore);
        return getDriver().getTitle();
    }
    public void buttonVacation() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(By.id("Vacaciones")).click();
    }

    public void buttonHistory() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(By.id("Historial")).click();
    }

    public void getHolidays() {
        WebElement webElement =
                getDriver().findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/table/tbody/tr[5]/td[3]/strong"));
        System.out.println("Vacaciones disponibles: ".concat(webElement.getText()).concat(" días"));
    }
}

