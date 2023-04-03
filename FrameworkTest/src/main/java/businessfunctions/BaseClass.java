package businessfunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pagerepository.CheckoutCompletePage;
import pagerepository.CheckoutInfoPage;
import pagerepository.CheckoutOverviewPage;
import pagerepository.LoginPage;
import pagerepository.ProductsPage;
import pagerepository.YourCartPage;

public class BaseClass {

	public static WebDriver driver = null;
	public static String baseUrl = "https://www.saucedemo.com/";
	
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Opening Chrome Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grn_a\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Closing Chrome Browser");
		driver.close();
		driver.quit();
	}
	
	
	public static void loginToApp(String Username, String Password) {
		LoginPage.enterUsername(Username);
		LoginPage.enterPassword(Password);
		LoginPage.clickLoginBtn();
	}
	
	public static void logoutFromApp() {
		ProductsPage.clickMenuBtn();
		ProductsPage.clickLogoutBtn();
	}
	
	public static void addToCart() {
		ProductsPage.addBackpack();
		ProductsPage.addFleeceJacket();
		ProductsPage.cartBtn();
	}
	
	public static void checkoutClick() {
		YourCartPage.clickCheckoutBtn();
	}
	
	public static void checkoutInfo(String NameOne, String NameTwo, String ZipCode) {
		CheckoutInfoPage.typeFirstName(NameOne);
		CheckoutInfoPage.typeLastName(NameTwo);
		CheckoutInfoPage.address(ZipCode);
		CheckoutInfoPage.clickContinueBtn();
	}
	
	public static void checkoutFinish() {
		CheckoutOverviewPage.clickFinish();
		CheckoutCompletePage.menuClick();
		CheckoutCompletePage.logoutClick();
	}
	
	public static void testingTwoUsernames() {
		LoginPage.backspaceUsername();
	}
	
	public static void reEnterUsername(String Username2) {
		LoginPage.enterUsername(Username2);
		LoginPage.clickLoginBtn();
	}
}


