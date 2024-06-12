package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TareasConstants;

public class AfterService extends ActionManager {

    public static void eliminarTareaReciente() {
        try {
            Thread.sleep(3500);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.waitClickable(TareasConstants.DOT_DELETE_MENU);
        click(TareasConstants.DOT_DELETE_MENU);

        try {
            Thread.sleep(1500);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.waitClickable(TareasConstants.COMANDO_DELETE);
        click(TareasConstants.COMANDO_DELETE);
        try {
            Thread.sleep(1000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebActionManager.waitClickable(TareasConstants.CONFIRM_DELETE);
        click(TareasConstants.CONFIRM_DELETE);
        try {
            Thread.sleep(2000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
