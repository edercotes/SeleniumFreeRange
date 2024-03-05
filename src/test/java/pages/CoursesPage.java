package pages;

public class CoursesPage extends BasePage {

    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";
    
    public CoursesPage(){
        super(driver);
    }

    public void clickFundamentosTestingLink(){
        clickElement(fundamentosTestingLink);
    }
}
