package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends PageObject {

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	public ProductDetailsPage selectResult(String resultName) {
		WebElement ipadLink = driver.findElement(By.linkText(resultName));
		ipadLink.click();
		return new ProductDetailsPage(driver);
	}
}
