package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TareasConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TrackerService extends ActionManager {


    public static void completarCampoTitulo() {

        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formato.format(fechaActual);
        String tituloTareaYFecha = "Tarea Crowdar " + fechaFormateada;

        setInput(TareasConstants.TITLE_INPUT_FIELD, tituloTareaYFecha);

//        return tituloTareaYFecha;

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

    public static void agregarProyecto() {
        WebActionManager.waitPresence(TareasConstants.LINK_NEW_PROJECT);
        click(TareasConstants.LINK_NEW_PROJECT);


    }

//    public static void nombrarProyecto() {
//        WebActionManager.waitPresence(TareasConstants.PROJECT_INPUT);
//
//        Date fechaActual = new Date();
//        SimpleDateFormat formato = new SimpleDateFormat("dd-MM HH:mm:ss");
//        String fechaFormateada = formato.format(fechaActual);
//        String modificacionTareaProyecto = "Modificado " + fechaFormateada;
//
//        setInput(TareasConstants.PROJECT_INPUT, modificacionTareaProyecto);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        click(TareasConstants.CREATE_PROJECT_BUTTON);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void modificarHoraInicio() {
//        click(TareasConstants.START_INPUT);
        WebElement startInputField = WebActionManager.getElement(TareasConstants.START_INPUT);
        startInputField.clear();
        setInput(TareasConstants.START_INPUT, "0010");
//                setInput(TareasConstants.START_INPUT, "0000");
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        WebActionManager.getElement(TareasConstants.START_INPUT).sendKeys("0010");
//        WebActionManager.getElement(TareasConstants.START_INPUT).sendKeys(Keys.TAB);

    }

    public static void modificarHoraFin() {
        click(TareasConstants.STOP_INPUT);
                setInput(TareasConstants.STOP_INPUT, "0021");
        WebActionManager.getElement(TareasConstants.STOP_INPUT).sendKeys(Keys.TAB);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void tareaModificadaOK() {
        WebActionManager.waitPresence(TareasConstants.TASK_TOAST);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}