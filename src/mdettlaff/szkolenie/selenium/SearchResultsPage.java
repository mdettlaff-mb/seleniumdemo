package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

	private final WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public ProductDetailsPage selectResult(String resultName) {
		WebElement ipadLink = driver.findElement(By.linkText(resultName));
		ipadLink.click();
		return new ProductDetailsPage(driver);
	}
}
