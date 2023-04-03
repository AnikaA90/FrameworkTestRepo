package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import businessfunctions.BaseClass;
import configuration.ConfigInfo;

public class TestProperties extends BaseClass{
	
	@Test
	public void loginWithProperties() throws IOException {
		BaseClass.loginToApp(ConfigInfo.readProperty("username1"), ConfigInfo.readProperty("password"));
		BaseClass.testingTwoUsernames();
		BaseClass.reEnterUsername(ConfigInfo.readProperty("username2"));
		BaseClass.logoutFromApp();
	}

}
