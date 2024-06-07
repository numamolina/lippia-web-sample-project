package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.HomeService;


public class LoginSteps extends PageSteps {


    @Given("estoy en la pagina de inicio de Clockify")
    public void homePageClockify() {
        HomeService.navegarWeb();
    }

    @When("hago clic en el enlace Inicia la sesion")
    public void LinkLogIn() {
        HomeService.iniciarSesion();
    }

    @And("el sistema muestra las opciones de login")
    public void verificarOpcionesLogin() {
        HomeService.verifyLoginOptionsIsDisplayed();
    }

    @And("selecciono Log in manually")
    public void loginManually() {
        HomeService.inicioManual();
    }

    @And("el sistema muestra el formulario de login")
    public void verificarFormularioDeLogin() {
        HomeService.VerifyLoginFormIsDisplayed();
    }

    @And("hago clic en el boton LOG IN")
    public void botonLogIn() {
        HomeService.formLoginButton();
    }

    @And("ingreso el usuario {}")
    public void ingresoElUsuario(String user) {
        HomeService.userInput(user);
    }
    @And("ingreso la contrasena {}")
    public void ingresoLaContrasena(String pass) {
        HomeService.passInput(pass);
    }

    @Then("se muestra la pagina del Tracker")
    public void trackerPage() {
        HomeService.verifyInWebTracker();
    }


}
