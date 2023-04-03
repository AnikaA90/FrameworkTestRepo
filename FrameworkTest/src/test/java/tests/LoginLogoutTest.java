package tests;

import org.testng.annotations.Test;

import businessfunctions.BaseClass;

public class LoginLogoutTest extends BaseClass {
	
	@Test
	public void signInAndOutTest() {
		BaseClass.loginToApp("standard_user", "secret_sauce");
		BaseClass.logoutFromApp();
	}

}
