package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TrackerService;

public class ModificarSteps extends PageSteps {

    @When("modifico el titulo de una tarea creada")
    public void modificarTituloDeTarea() {
        TrackerService.modificarTituloTarea();
    }

    @And("modifico la hora de inicio de tarea")
    public void modificoHoraDeInicioDeTarea() {
        TrackerService.modificarHoraInicio();
    }

    @And("modifico la hora de fin de la tarea")
    public void modificoLaHoraDeFinDeLaTarea() {
        TrackerService.modificarHoraFin();
    }

    @Then("se modifica la tarea satisfactoriamente")
    public void tareaModificadaCorrectamente() {
        TrackerService.tareaModificadaOK();
    }
}