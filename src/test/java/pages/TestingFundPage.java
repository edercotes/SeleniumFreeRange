package pages;

public class TestingFundPage extends BasePage {

    //private String testingIntroLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";
    private String testingIntroButton ="//a[@href='/introduccion-al-testing-de-software'][normalize-space()='Ver producto']";
    
    public TestingFundPage(){
        super(driver);
    }

    public void clikTestingIntroLink(){
        //clickElement(testingIntroLink);
        clickElement(testingIntroButton);
    }
}
