package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.TareasConstants;
import lippia.web.constants.WorkspacesConstants;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class HomeService extends ActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void iniciarSesion() {
        click(LoginConstants.LOGIN_LINK);
    }

    public static void verifyLoginOptionsIsDisplayed() {
        WebActionManager.waitPresence(LoginConstants.LOGIN_FORM);
    }

    public static void VerifyLoginFormIsDisplayed() {
        WebActionManager.waitPresence(LoginConstants.INPUT_EMAIL);
        WebActionManager.waitPresence(LoginConstants.INPUT_PASS);
    }


    public static void verifyFormIsDisplayed() {
        WebActionManager.waitPresence(LoginConstants.LOGIN_MANUAL_BUTTON);
    }

    public static void inicioManual() {
        click(LoginConstants.LOGIN_MANUAL_BUTTON);
    }

    public static void verifyInWebTracker() {
        WebActionManager.waitPresence(LoginConstants.TRACKER_COMMAND);
    }


    public static void userInput(String text) {
        setInput(LoginConstants.INPUT_EMAIL, text);
    }

    public static void passInput(String text) {
        setInput(LoginConstants.INPUT_PASS, text);
    }

    public static void formLoginButton() {
        click(LoginConstants.LOGIN_IN_BUTTON);
    }

    public static void tituloDeTarea() {
        click(TareasConstants.TITLE_INPUT_FIELD);
    }


    public static void menuUsuario(String text) {
        click(LoginConstants.AVATAR_BUTTON);
    }

    public static void linkLogout() {
        WebActionManager.waitPresence(LoginConstants.LOGOUT_LINK);
        click(LoginConstants.LOGOUT_LINK);
    }

    public static void loggedOut() {
        WebActionManager.waitPresence(LoginConstants.LOGOUT_TEXT);
    }

    public static void workspacesMenu() {
        WebActionManager.click(WorkspacesConstants.MENU_WORKSPACES);
    }

    public static void manageWorkspaces() {
        WebActionManager.click(WorkspacesConstants.MANAGE_COMMAND);
    }

    public static void workspacesPage() {
        WebActionManager.waitPresence(WorkspacesConstants.WORKSPACES_TITLE);
    }

    public static void createWorkspace() {
        WebActionManager.click(WorkspacesConstants.CREATE_WORKSPACES_BUTTON);
    }

    public static void namingWorkspace(String text) {
        WebActionManager.waitPresence(WorkspacesConstants.WORKSPACES_INPUT);
        Random rand = new Random();
        int randomNumber = rand.nextInt(900) + 100; // Número aleatorio entre 100 y 999
//        Agregar el número aleatorio al nombre del workspace
        String uniqueName = text + "_" + randomNumber;
//        Establecer el nombre del workspace en el campo de entrada
        setInput(WorkspacesConstants.WORKSPACES_INPUT, uniqueName);
    }

    public static void newProject() {
        WebActionManager.waitPresence(ProjectConstants.PROJECT_LINK);
        WebActionManager.click(ProjectConstants.PROJECT_LINK);

    }

    public static void newProjectClic() {
        WebActionManager.click(ProjectConstants.NEW_PROJECT_LINK);
    }

    public static void newProjectModal() {
        WebActionManager.waitPresence(ProjectConstants.PROJECT_INPUT);

    }

    public static void namingProjects(String nombreProyecto) {
        Random rand2 = new Random();
        int randomNumber2 = rand2.nextInt(900) + 100; // Número aleatorio entre 100 y 999
//        Agregar el número aleatorio al nombre del Proyecto
        String uniqueName2 = nombreProyecto + "_" + randomNumber2;
//        Establecer el nombre del proyecto en el campo de entrada
        setInput(ProjectConstants.PROJECT_INPUT, uniqueName2);
    }

    public static void creandoProject() {
        WebActionManager.click(ProjectConstants.PROJECT_CREATE_BUTTON);
    }


    public static void createdProject() {
        WebActionManager.waitPresence(ProjectConstants.PROJECTS_TITLE);
    }

    public static void newCreatedWorkspace() {
        WebActionManager.waitPresence(WorkspacesConstants.WORKSPACES_TITLE);
    }



    public static void modoTimer() {
        click(TareasConstants.CLOCK_BUTTON);
    }

    public static void botonStart() {
        WebActionManager.waitPresence(TareasConstants.START_BUTTON);
        click(TareasConstants.START_BUTTON);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void opcionesTarea() {
        click(TareasConstants.DOT_MENU);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void comandoDiscard() {
        click(TareasConstants.COMANDO_DISCARD);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void confirmDiscardOption() {
        WebActionManager.waitPresence(TareasConstants.CONFIRM_DISCARD);
        click(TareasConstants.CONFIRM_DISCARD);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void botonStop() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(TareasConstants.STOP_BUTTON);
    }

    public static void avisoToast() {
        WebActionManager.waitPresence(TareasConstants.TASK_TOAST);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}