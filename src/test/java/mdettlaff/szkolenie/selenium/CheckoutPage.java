package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

	@FindBy(className = "yourtotal")
	private WebElement total;

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	public String getSummary() {
		return total.getText();
	}
}
