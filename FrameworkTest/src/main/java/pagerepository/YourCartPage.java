package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class YourCartPage extends BaseClass {

	static By checkoutBtn = By.id("checkout");
	
	public static void clickCheckoutBtn() {
		driver.findElement(checkoutBtn).click();
	}
}
