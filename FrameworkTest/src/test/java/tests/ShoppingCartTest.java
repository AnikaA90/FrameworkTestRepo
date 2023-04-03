package tests;

import org.testng.annotations.Test;

import businessfunctions.BaseClass;

public class ShoppingCartTest extends BaseClass{

	@Test
	public void buyAndCheckout() {
		BaseClass.loginToApp("standard_user", "secret_sauce");
		BaseClass.addToCart();
		BaseClass.checkoutClick();
		BaseClass.checkoutInfo("John", "Doe", "11024");
		BaseClass.checkoutFinish();
	}
}
