package pages;

public class MainPage extends BasePage{

    //private String viewCourseButton = "//a[@href='/introduccion-al-testing-de-software'][normalize-space()='Ver curso']";
    //private String preview = "//a[normalize-space()='Vista previa']";
    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String chooseAPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public MainPage(){
        super(driver);
    }

    // Method to navigate to the page
    public void navigateToPage(){
        navigateTo("https://www.freerangetesters.com");
        //clickElement(viewCourseButton);
        //clickElement(preview);
    }

    public void clickOnNavigationBar(String section){
        //Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnChooseAPlanButton(){
        clickElement(chooseAPlanButton);
    }
    
}
