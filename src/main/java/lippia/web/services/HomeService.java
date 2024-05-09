package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class HomeService extends ActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void iniciarSesion() {
        click(LoginConstants.LOGIN_LINK);
    }

    public static void inicioManual() {
        click(LoginConstants.LOGIN_MANUAL_BUTTON);
    }

    public static void verifyFormIsDisplayed() {
        WebActionManager.waitPresence(LoginConstants.LOGIN_MANUAL_BUTTON);
    }


//    public static void clickSearchButton() {
//        click(LoginConstants.SEARCH_BUTTON);
//    }

}
