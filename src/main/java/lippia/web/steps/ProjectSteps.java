package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.HomeService;

public class ProjectSteps extends PageSteps {
    @And("Genero un nuevo proyecto haciendo clic en Project")
    public void nuevoProject() {
        HomeService.newProject();
    }

    @And("Hago clic en Create New Project del menu desplegable")
    public void nuevoProyectoClic() {
        HomeService.newProjectClic();
    }

    @Then("El sistema muestra un cuadro de dialogo")
    public void cuadroDialogoNuevoProyecto() {
        HomeService.newProjectModal();
    }

    @And("Ingreso el nombre del proyecto {string}")
    public void nombreDelProyecto(String nombreProyecto) {
        HomeService.namingProjects(nombreProyecto);

    }

    @And("Hago clic en el boton Create")
    public void botonCreate() {
        HomeService.creandoProject();
    }

    @Then("Se crea el proyecto y se selecciona por defecto")
    public void proyectoCreado() {
        HomeService.createdProject();
    }
}
