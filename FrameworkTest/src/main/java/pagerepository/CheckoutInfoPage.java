package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class CheckoutInfoPage extends BaseClass {
 
	static By firstName = By.name("firstName");
	static By lastName = By.name("lastName");
	static By zipCode = By.name("postalCode");
	static By continueBtn = By.name("continue");
	
	public static void typeFirstName(String FirstName) {
		driver.findElement(firstName).sendKeys(FirstName);
	}
	
	public static void typeLastName(String LastName) {
		driver.findElement(lastName).sendKeys(LastName);
	}
	
	public static void address(String Zip) {
		driver.findElement(zipCode).sendKeys(Zip);
	}
	
	public static void clickContinueBtn() {
		driver.findElement(continueBtn).click();
	}
}
