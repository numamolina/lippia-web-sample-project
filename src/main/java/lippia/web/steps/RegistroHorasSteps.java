package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.AfterService;
import lippia.web.services.TrackerService;

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
        TrackerService.avisoToastSimple();
    }

    @Then("se crea el registro de horas")
    public void registroDeHorasCreado() {
        TrackerService.avisoToastYEliminar();
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
        TrackerService.avisoToastSimple();
    }

    @And("elimino la tarea creada")
    public void eliminoLaTareaCreada() {
        AfterService.eliminarTareaReciente();
    }

    @And("hago clic en el modo manual")
    public void timerModoManual() {
        TrackerService.modoManualTiempo();
    }

    @And("inicio el seguimiento de la tarea haciendo clic en el botón Add")
        public void inicioSeguimientoManual() {
        TrackerService.agregarTareaManual();
    }
}
