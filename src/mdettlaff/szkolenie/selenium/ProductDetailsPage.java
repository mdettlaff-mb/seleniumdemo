package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage extends PageObject {

	@FindBy(name = "Buy")
	private WebElement addToCartButton;

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void addProductToCart() {
		addToCartButton.click();
	}

	public CheckoutPage goToCheckout() {
		By goToCheckoutLinkLocator = By.linkText("Go to Checkout");
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(goToCheckoutLinkLocator));
		WebElement goToCheckoutLink = driver.findElement(goToCheckoutLinkLocator);
		goToCheckoutLink.click();
		return new CheckoutPage(driver);
	}
}
