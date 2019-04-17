package tnm.com.co.steps;

import com.google.inject.Inject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import tnm.com.co.ui.PortalLoginPage;

public class NavigationUser {

     @Inject
     private PortalLoginPage portalLoginPage;

     @Step
     public void navigateTo(){
        portalLoginPage.open();
         System.out.println("fin");
     }
    @Step
    public void accessTechAndManager() {
        portalLoginPage.accessTechAndManager();
     }

    @Step
    public void enterCredentials(String email) {
        portalLoginPage.enterCredentials(email);
     }

    @Step
     public void buttonNext() {
        portalLoginPage.buttonNext();
     }
     @Step
     public void password(String psw) {
        portalLoginPage.password(psw);
     }

    @Step
    public void nextLogin() {
      portalLoginPage.nextLogin();
    }

    @Step
    public void loginSuccesfull() {
        Assert.assertEquals("Tech and Manager", portalLoginPage.getApplicationTitle());
    }
    @Step
    public void buttonVacation() {
        portalLoginPage.buttonVacation();
    }

    public void buttonHistory() {
        portalLoginPage.buttonHistory();
     }

    public void getHolidays() {
        portalLoginPage.getHolidays();
     }
}

