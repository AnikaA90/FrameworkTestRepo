package pagerepository;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import businessfunctions.BaseClass;

public class LoginPage extends BaseClass {
	
	static By txtUsername = By.name("user-name");
	static By txtPassword = By.name("password");
	static By loginBtn = By.name("login-button");
	
	public static void enterUsername(String UName) {
		driver.findElement(txtUsername).sendKeys(UName);
	}
	
	static public void enterPassword(String Pwd) {
		driver.findElement(txtPassword).sendKeys(Pwd);
	}

	public static void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public static void backspaceUsername() {
		driver.findElement(txtUsername).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
	}
}
