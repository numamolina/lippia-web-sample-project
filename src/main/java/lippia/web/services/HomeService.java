package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.TareasConstants;

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

    public static void creandoProject() {
        WebActionManager.click(ProjectConstants.PROJECT_CREATE_BUTTON);
    }

    public static void createdProject() {
        WebActionManager.waitPresence(ProjectConstants.PROJECTS_TITLE);
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