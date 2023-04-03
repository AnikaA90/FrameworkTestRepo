package pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import businessfunctions.BaseClass;

public class CheckoutOverviewPage  extends BaseClass{

	static By finishBtn = By.id("finish");
	
	public static void clickFinish() {
		WebElement element = driver.findElement(finishBtn);
		Actions actions = new Actions(driver);
		actions.scrollToElement(element).click(element).perform();
	}
}
