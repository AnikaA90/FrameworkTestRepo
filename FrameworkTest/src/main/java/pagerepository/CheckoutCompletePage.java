package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class CheckoutCompletePage extends BaseClass {

	static By menu = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	static By logout = By.linkText("Logout");
	
	public static void menuClick() {
		driver.findElement(menu).click();
	}
	
	public static void logoutClick() {
		driver.findElement(logout).click();
	}
}
