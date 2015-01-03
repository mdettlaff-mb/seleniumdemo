package mdettlaff.szkolenie.selenium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Szkolenie {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testStore() {
		driver.get("http://store.demoqa.com/");
		WebElement search = driver.findElement(By.name("s"));
		search.sendKeys("ipad");
		search.submit();
		// WebElement productCategory =
		// driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
		// Actions actions = new Actions(driver);
		// actions.moveToElement(productCategory);
		// actions.build().perform();
		// JavascriptExecutor ex = (JavascriptExecutor) driver;
		// ex.executeScript("arguments[0].click();", productCategory);
		WebElement ipadLink = driver.findElement(By.linkText("Apple iPad 6 32GB (White, 3D)"));
		ipadLink.click();
		WebElement addToCartButton = driver.findElement(By.name("Buy"));
		addToCartButton.click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		By goToCheckoutLinkLocator = By.linkText("Go to Checkout");
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(goToCheckoutLinkLocator));
		WebElement goToCheckoutLink = driver.findElement(goToCheckoutLinkLocator);
		goToCheckoutLink.click();
		WebElement totalElement = driver.findElement(By.className("yourtotal"));
		assertThat(totalElement.getText().startsWith("Sub-Total:"), is(true));
	}
}
