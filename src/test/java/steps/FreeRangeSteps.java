package steps;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import io.cucumber.java.en.*;
import pages.CheckoutPage;
import pages.CoursesPage;
import pages.MainPage;
import pages.TestingFundPage;

public class FreeRangeSteps {

    SoftAssert soft = new SoftAssert();
    MainPage landingPage = new MainPage();
    CoursesPage cursosPage = new CoursesPage();
    TestingFundPage testingFundPage = new TestingFundPage();
    CheckoutPage checkout = new CheckoutPage();
    
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToPage();
    }

    @When("I go to {word} using the navigation bar") 
    public void navigationBarUse(String section){
        landingPage.clickOnNavigationBar(section);
    }

    @And("^(?:I|The user|The client) selects? Introduction to Testing$")
    public void navigateToIntro(){
        cursosPage.clickFundamentosTestingLink();
        testingFundPage.clikTestingIntroLink();
    }

    @When("^(?:I|The user|The client) selects? Choose Plan$")
    public void selectChoosePlan(){
        landingPage.clickOnChooseAPlanButton();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans(){
        List<String> lista = checkout.returnPlanDropdownValues();
        List<String> expectedList = Arrays.asList("Academia: $16.99 / mes • 12 productos","Academia: $176 / año • 12 productos","Free: Gratis • 1 producto");

        Assert.assertEquals(expectedList, lista);
    }

    public void Example() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";

        Integer crazyNumber = 1;
        Integer crazyNumber2 = 2;

        Assert.assertEquals(crazyNumber, crazyNumber2);

        //Verificar que dos valores son iguales
        Assert.assertEquals(palabraEsperada, palabraEncontrada);

        //Verificar que dos valores no son iguales
        Assert.assertNotEquals(palabraEsperada, palabraEncontrada);

        //Verificar que una condición es verdadera
        Assert.assertTrue(palabraEncontrada.contains(palabraEsperada));

        //Verificar que una condición es falsa
        Assert.assertFalse(palabraEncontrada.contains(palabraEsperada));

        //Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada, palabraEsperada);

        soft.assertAll();
    }

}
