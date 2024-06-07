package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.HomeService;

public class RegistroHorasSteps extends PageSteps {

    @When("hago clic en el campo de titulo de la nueva tarea")
    public void tituloDeLaNuevaTarea() {
        HomeService.tituloDeTarea();
    }

    @And("completo el título de la tarea con la fecha y hora actual")
    public void tituloFechaYHoraActual() {
        HomeService.completarCampoTitulo();
    }

    @And("hago clic en el modo timer")
    public void hagoClicEnElModoTimer() {
        HomeService.modoTimer();
    }

    @And("inicio el seguimiento del tiempo haciendo clic en el botón Start")
    public void inicioBotonStart() {
        HomeService.botonStart();
    }

    @And("detengo el seguimiento del tiempo haciendo clic en el botón Stop")
    public void detengoBotonStop() {
        HomeService.botonStop();
    }


    @Then("se crea la tarea satisfactoriamente")
    public void tareaCreada() {
        HomeService.avisoToast();
    }
}
