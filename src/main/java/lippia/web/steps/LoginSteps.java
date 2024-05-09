package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import lippia.web.services.HomeService;



public class LoginSteps extends PageSteps {

    @Given("^estoy en la landing page de Clockify$")
    public void home() {
        HomeService.navegarWeb();
    }

    @When("hago clic en el link inicia la sesion")
    public void LinkLogIn() {
        HomeService.iniciarSesion();
    }

    @And("hago clic en Login manually")
    public void loginManually() {
        HomeService.inicioManual();
    }

    @Then("el sistema muestra el formulario de login")
    public void verificarFormulario() {
        HomeService.verifyFormIsDisplayed();
        }

    @Given("el sistema muestra el formulario especifico de ingreso manual")
    public void VerificarFormularioManual() {
        HomeService.verifyFormManually();
    }

    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String user) {
    HomeService.userInput(user);
    }

    @And("ingreso la contrasena {string}")
    public void ingresoLaContrasena(String pass) {
        HomeService.passInput(pass);
    }

    @And("hago clic en el boton Log in")
    public void botonLogIn() {
        HomeService.formLoginButton();
    }

    @Then("Ingreso al area de Dashboard")
    public void AreaDeDashboard() {
        HomeService.dashboardPage();
    }


//
//
//    @When("^hago clic en el boton 'Iniciar sesión'$")
//    public void click() {
//        HomeService.iniciarSesion();
//    }
//
//
//    @When("completo el campo de correo electrónico con {string} y el campo de contrasena con {string}")
//    public void completeLoginFields(String email, String password) {
//        WebElement emailField = driver.findElement(By.id("email"));
//        WebElement passwordField = driver.findElement(By.id("password")); // Reemplaza "password" con el ID del campo de contraseña
//
//        emailField.sendKeys(email);
//        passwordField.sendKeys(password);
//    }
//
//    @When("^The client search for word (.*)$")
//    public void search(String criteria) {
//        GoogleHomeService.enterSearchCriteria(criteria);
//        GoogleHomeService.clickSearchButton();
//    }
//
//    @Then("The client verify that results are shown properly")
//    public void statVerification() {
//        GoogleSearchResultService.verifyResults();
//    }


}
