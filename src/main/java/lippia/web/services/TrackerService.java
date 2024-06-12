package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.TareasConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TrackerService extends ActionManager {

    public static void verifyInWebTracker() {
        WebActionManager.waitPresence(LoginConstants.TRACKER_COMMAND);
    }

    public static void tituloDeTarea() {
        click(TareasConstants.TITLE_INPUT_FIELD);
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

    public static void botonStop() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(TareasConstants.STOP_BUTTON);
    }

    public static void opcionesTarea() {
        click(TareasConstants.DOT_MENU);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void comandoDiscard() {
        click(TareasConstants.COMANDO_DISCARD);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void confirmDiscardOption() {
        WebActionManager.waitPresence(TareasConstants.CONFIRM_DISCARD);
        click(TareasConstants.CONFIRM_DISCARD);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void completarCampoTitulo() {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formato.format(fechaActual);
        String tituloTareaYFecha = "Tarea Crowdar " + fechaFormateada;
        setInput(TareasConstants.TITLE_INPUT_FIELD, tituloTareaYFecha);

    }

    public static void modificarTituloTarea() {
        WebActionManager.waitPresence(TareasConstants.TITLE_TASK_FIELD);
        WebActionManager.getElement(TareasConstants.TITLE_TASK_FIELD).sendKeys(" (modificado)");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TareasConstants.TITLE_TASK_FIELD).sendKeys(Keys.TAB);
    }

    public static void modificarHoraInicio() {
        WebElement startInputField = WebActionManager.getElement(TareasConstants.START_INPUT);
        startInputField.clear();
        setInput(TareasConstants.START_INPUT, "0010");

    }

    public static void modificarHoraFin() {
        click(TareasConstants.STOP_INPUT);
        setInput(TareasConstants.STOP_INPUT, "0021");
        WebActionManager.getElement(TareasConstants.STOP_INPUT).sendKeys(Keys.TAB);
    }


    public static void avisoToastSimple() {
        WebActionManager.waitPresence(TareasConstants.TASK_TOAST);
        try {
            Thread.sleep(1000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.waitPresence(TareasConstants.TASK_TEXT_TOAST_SUCCESS);
    }

    public static void avisoToastYEliminar() {
        WebActionManager.waitPresence(TareasConstants.TASK_TOAST);
        WebActionManager.waitPresence(TareasConstants.TASK_TEXT_TOAST_SUCCESS);

        AfterService.eliminarTareaReciente();
    }

    public static void modoManualTiempo() {
        click(TareasConstants.CLOCK_MANUAL_BUTTON);

    }

    public static void agregarTareaManual() {
        click(TareasConstants.ADD_BUTTON);
    }
}
