package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
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

    public static void inicioManual() {
        WebActionManager.waitPresence(LoginConstants.LOGIN_MANUAL_BUTTON);
        click(LoginConstants.LOGIN_MANUAL_BUTTON);
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


}