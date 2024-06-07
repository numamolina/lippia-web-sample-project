package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class TareasConstants {
    public static final String TITLE_INPUT_FIELD = "xpath://input[@name='autocomplete-input']";
    public static final String CLOCK_BUTTON = "xpath://a[@data-cy='timer-mode' and @class='cl-timetracker-switch']";
    public static final String START_BUTTON = "xpath://button[contains(text(), 'Start')]";
    public static final String STOP_BUTTON = "xpath://button[contains(text(), 'Stop')]";
    public static final String TASK_TOAST = "xpath://*[@id='toast-container' and contains(@class, 'toast-bottom-right')]";
}
