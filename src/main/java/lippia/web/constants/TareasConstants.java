package lippia.web.constants;

public class TareasConstants {
    public static final String TITLE_INPUT_FIELD = "xpath://input[@name='autocomplete-input']";
    public static final String CLOCK_BUTTON = "xpath://a[@data-cy='timer-mode' and @class='cl-timetracker-switch']";
    public static final String START_BUTTON = "xpath://button[contains(text(), 'Start')]";
    public static final String STOP_BUTTON = "xpath://button[contains(text(), 'Stop')]";
    public static final String TASK_TOAST = "xpath://*[@id='toast-container' and contains(@class, 'toast-bottom-right')]";
    //    OPCIONES DE TAREA
    public static final String DOT_MENU = "xpath://div[@class='cl-stopwatch-discard-wrapper ng-star-inserted']//img[@src='assets/ui-icons/menu-dots-vertical.svg' and @class='cl-px-2']";
    public static final String COMANDO_DISCARD = "xpath://a[@class='cl-dropdown-item cl-text-red']";
    public static final String CONFIRM_DISCARD = "xpath://div[@class='cl-dropdown-menu cl-dropdown-menu-right']//button[contains(text(), 'Discard')]";
    public static final String CONTEO_TIEMPO = "xpath://span[@class='cl-form-control cl-input-time-picker-sum ng-star-inserted']";
    //     MODIFICAR TAREA:
    public static final String TITLE_TASK_FIELD = "xpath://div[@class='cl-fake-input-wrapper cl-cut-text cl-w-100']/input[@type='text' and @placeholder='Add description'][1]";
    public static final String PROJECT_PICKER = "xpath://div[@class='cl-component-divided-left cl-no-divider-border cl-pl-0 cl-dropdown-toggle cl-no-arrow cl-max-width-100'][2]";
    public static final String LINK_NEW_PROJECT = "xpath://a[@data-cy='new-project']";
    public static final String PROJECT_INPUT = "xpath://input[@data-cy='project-name']";
    public static final String CREATE_PROJECT_BUTTON = "xpath://button[@data-cy='create-project']";
    public static final String START_INPUT = "xpath://div[@class='cl-component-divided-left cl-single-date-picker ng-star-inserted']/input-time-ampm[1]/input";
    public static final String STOP_INPUT = "xpath://div[@class='cl-component-divided-left cl-single-date-picker ng-star-inserted']/input-time-ampm[2]/input";




}
