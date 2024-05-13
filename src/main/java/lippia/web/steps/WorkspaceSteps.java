package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.Given;

import lippia.web.services.HomeService;


public class WorkspaceSteps extends PageSteps {
    @Given("Estoy en el area de Usuario")
    public void AreaDeUsuario() {
        HomeService.trackerPage();
    }

    @And("Hago clic en el menu de Workspaces")
    public void MenuDeWorkspaces() {
        HomeService.workspacesMenu();
    }

    @And("Hago clic en Manage Workspaces")
    public void manageWorkspaces() {
        HomeService.manageWorkspaces();
    }

    @Then("ingreso a los Workspaces disponibles")
    public void worskpasesDisponibles() {
        HomeService.workspacesPage();
    }

    @And("Hago clic en Create New Workspace")
    public void creatingWorkspace() {
        HomeService.createWorkspace();
    }

    @And("Completo el campo del modal con el nombre {string}")
    public void nombrandoNuevoWorkspace(String nombreWorkspace) {
        HomeService.namingWorkspace(nombreWorkspace);
    }

    @Then("El espacio se crea y se activa por defecto")
    public void espacioDeTrabajoCreado() {
        HomeService.newCreatedWorkspace();
    }
}


