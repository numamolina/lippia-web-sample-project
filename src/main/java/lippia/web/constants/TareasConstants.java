package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class TareasConstants {
    public static final String TITLE_INPUT_FIELD = "xpath://input[@name='autocomplete-input']";
    public static final String CLOCK_BUTTON = "xpath://a[@data-cy='timer-mode' and @class='cl-timetracker-switch']";
    public static final String START_BUTTON = "xpath://button[contains(text(), 'Start')]";
    public static final String STOP_BUTTON = "xpath://button[contains(text(), 'Stop')]";
    public static final String TASK_TOAST = "xpath://*[@id='toast-container' and contains(@class, 'toast-bottom-right')]";



    public static final String DOT_MENU = "xpath://div[@class='cl-stopwatch-discard-wrapper ng-star-inserted']//img[@src='assets/ui-icons/menu-dots-vertical.svg' and @class='cl-px-2']";
            //div[@class='cl-stopwatch-discard-wrapper ng-star-inserted']//img[contains(@src, 'menu-dots-vertical.svg')]\n";



    public static final String COMANDO_DISCARD = "xpath://a[@class='cl-dropdown-item cl-text-red']";
    public static final String CONFIRM_DISCARD = "xpath://div[@class='cl-dropdown-menu cl-dropdown-menu-right']//button[contains(text(), 'Discard')]";
    //button[@tabindex='0' and @ngbautofocus='false' and contains(@class, 'cl-btn') and contains(@class, 'cl-btn-primary') and text()='Discard']";
    public static final String CONTEO_TIEMPO = "xpath://span[@class='cl-form-control cl-input-time-picker-sum ng-star-inserted']";
}
