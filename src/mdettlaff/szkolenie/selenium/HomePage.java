package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private final WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigate() {
		driver.get("http://store.demoqa.com");
	}

	public SearchResultsPage searchProduct(String query) {
		WebElement search = driver.findElement(By.name("s"));
		search.sendKeys(query);
		search.submit();
		return new SearchResultsPage(driver);
	}
}
