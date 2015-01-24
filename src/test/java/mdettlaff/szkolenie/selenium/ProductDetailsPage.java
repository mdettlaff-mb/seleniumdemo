package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageObject {

	@FindBy(name = "Buy")
	private WebElement addToCartButton;

	@FindBy(linkText = "Go to Checkout")
	private WebElement goToCheckoutLink;

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void addProductToCart() {
		addToCartButton.click();
	}

	public CheckoutPage goToCheckout() {
		goToCheckoutLink.click();
		return new CheckoutPage(driver);
	}
}
