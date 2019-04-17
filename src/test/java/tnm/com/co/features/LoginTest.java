package tnm.com.co.features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import tnm.com.co.steps.NavigationUser;

public class LoginTest {

    @Steps
    NavigationUser navigationUser;

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver browser;


    @Given("^ingreso a la url del aplicativo Tech And Manager$")
    public void navigateTo() {
        navigationUser.navigateTo();
    }

    @And("^selecciono la opcion 'Acceder a Tech an Manager'$")
    public void accessTechAndManager() {
        navigationUser.accessTechAndManager();
    }

    @And("^ingreso el correo electronico '(.*)'$")
    public void enterCredentials(String email) {
        navigationUser.enterCredentials(email);
    }
    @And("^selecciono la opcion 'Siguiente'$")
    public void buttonNext() {
        navigationUser.buttonNext();
    }
    @And("^ingreso la contraseña \"(.*)\"$")
    public void Password(String psw) {
        navigationUser.password(psw);
    }
    @When("^selecciono la opcion 'Siguiente en el Logueo'$")
    public void nextLogin() {
        navigationUser.nextLogin();
    }

    @Then("^se abre la ventana de tech and manager$")
    public void loginSuccesfull() {
        navigationUser.loginSuccesfull();
    }

    @Given("^selecciono la opcion 'vacaciones'$")
    public void buttonVacation() {
        navigationUser.buttonVacation();
    }
    @When("^selecciono la opcion 'Historial'$")
    public void buttonHistory() {
        navigationUser.buttonHistory();
    }
    @Then("^mostrar el numero de dias disponibles de vacaciones$")
    public void getHolidays() {
        navigationUser.getHolidays();
    }




}



