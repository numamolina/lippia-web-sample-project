package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.HomeService;
import lippia.web.services.TrackerService;

public class RegistroHorasSteps extends PageSteps {

    @When("hago clic en el campo de titulo de la nueva tarea")
    public void tituloDeLaNuevaTarea() {
        HomeService.tituloDeTarea();
    }

    @And("completo el título de la tarea con la fecha y hora actual")
    public void tituloFechaYHoraActual() {
        TrackerService.completarCampoTitulo();
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


    @And("despliego las opciones de tarea")
    public void despliegoOpcionesDeTarea() {
        HomeService.opcionesTarea();
    }

    @And("descarto el seguimiento del tiempo con en el botón Discard")
    public void descartarBotonDiscard() {
        HomeService.comandoDiscard();
    }

    @And("confirmo la cancelacion del descarte")
    public void confirmarDescarte() {
        HomeService.confirmDiscardOption();
    }

    @Then("el titulo y el contador se reinician")
    public void elTituloYElContadorCero() {
        HomeService.avisoToast();
    }
}
