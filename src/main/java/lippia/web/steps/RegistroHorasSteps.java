package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import jdk.internal.net.http.common.OperationTrackers;
import lippia.web.services.HomeService;
import lippia.web.services.TrackerService;

import javax.sound.midi.Track;

public class RegistroHorasSteps extends PageSteps {

    @When("hago clic en el campo de titulo de la nueva tarea")
    public void tituloDeLaNuevaTarea() {
        TrackerService.tituloDeTarea();
    }

    @And("completo el título de la tarea con la fecha y hora actual")
    public void tituloFechaYHoraActual() {
        TrackerService.completarCampoTitulo();
    }

    @And("hago clic en el modo timer")
    public void hagoClicEnElModoTimer() {
        TrackerService.modoTimer();
    }

    @And("inicio el seguimiento del tiempo haciendo clic en el botón Start")
    public void inicioBotonStart() {
        TrackerService.botonStart();
    }

    @And("detengo el seguimiento del tiempo haciendo clic en el botón Stop")
    public void detengoBotonStop() {
        TrackerService.botonStop();
    }

    @Then("se crea la tarea satisfactoriamente")
    public void tareaCreada() {
        TrackerService.avisoToast();
    }

    @And("despliego las opciones de tarea")
    public void despliegoOpcionesDeTarea() {
        TrackerService.opcionesTarea();
    }

    @And("descarto el seguimiento del tiempo con en el botón Discard")
    public void descartarBotonDiscard() {
        TrackerService.comandoDiscard();
    }

    @And("confirmo la cancelacion del descarte")
    public void confirmarDescarte() {
        TrackerService.confirmDiscardOption();
    }

    @Then("el titulo y el contador se reinician")
    public void elTituloYElContadorCero() {
        TrackerService.avisoToast();
    }

    @And("elimino la tarea creada")
    public void eliminoLaTareaCreada() {
        TrackerService.eliminarTareaReciente();
    }
}
