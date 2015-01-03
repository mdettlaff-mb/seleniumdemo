package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	private final WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getSummary() {
		WebElement totalElement = driver.findElement(By.className("yourtotal"));
		return totalElement.getText();
	}
}
