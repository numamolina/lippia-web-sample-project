package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;


public class LogoutSteps extends PageSteps {

    @Given("Estoy en el area de Tracker")
    public void AreaDeUsuario() {
        HomeService.trackerPage();
    }

    @When("hago clic en el boton {string}")
    public void clickUsuario(String iniciales) {
        HomeService.menuUsuario(iniciales);
    }

    @And("hago clic en el boton Logout")
    public void botonLogout() {
        HomeService.linkLogout();
    }

    @Then("La sesion se cierra correctamente")
    public void sesionOut() {
        HomeService.loggedOut();
    }

}
