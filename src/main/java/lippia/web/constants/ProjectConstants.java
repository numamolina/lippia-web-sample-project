package lippia.web.constants;

public class ProjectConstants {
    public static final String PROJECT_LINK = "xpath://div[@class='cl-dropdown cl-dropdown-large cl-d-flex']//a[contains(@class, 'cl-dropdown-toggle')]";
    public static final String NEW_PROJECT_LINK = "xpath://a[@tabindex='0' and contains(span/text(), 'Create new project')]";
    public static final String PROJECT_INPUT = "xpath://input[@placeholder='Enter project name']";
    public static final String PROJECT_CREATE_BUTTON = "xpath://button[@data-cy='create-project']";
    public static final String PROJECTS_TITLE = "xpath://h1[@class='title-project']";
}

