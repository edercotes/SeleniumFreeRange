package pages;

import java.util.List;

public class CheckoutPage extends BasePage{

    private String planDropDown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";

    public CheckoutPage(){
        super(driver);
    }

    public List<String> returnPlanDropdownValues(){
       return getDropDownValues(planDropDown);         
    }
    
}
