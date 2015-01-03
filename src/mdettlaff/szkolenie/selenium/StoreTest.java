package mdettlaff.szkolenie.selenium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StoreTest {

	private static final int DEFAULT_TIMEOUT = 30;

	private WebDriver driver;

	private HomePage homePage;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
		homePage = new HomePage(driver);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void searchForProductAndAddItToCart() {
		homePage.navigate();
		SearchResultsPage resultsPage = homePage.searchProduct("ipad");
		ProductDetailsPage productPage = resultsPage.selectResult("Apple iPad 6 32GB (White, 3D)");
		productPage.addProductToCart();
		CheckoutPage checkoutPage = productPage.goToCheckout();
		assertThat(checkoutPage.getSummary(), is("Sub-Total:$680.00"));
	}
}
