package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class ProductsPage extends BaseClass {
	
	static By menuBtn = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	static By logoutBtn = By.linkText("Logout");
	static By backpack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	static By fleeceJacket = By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
	static By cartIcon = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
	
	public static void clickMenuBtn() {
		driver.findElement(menuBtn).click();
	}

	public static void clickLogoutBtn() {
		driver.findElement(logoutBtn).click();
	}
	
	public static void addBackpack() {
		driver.findElement(backpack).click();
	}
	
	public static void addFleeceJacket() {
		driver.findElement(fleeceJacket).click();;
	}
	
	public static void cartBtn() {
		driver.findElement(cartIcon).click();
	}
}
