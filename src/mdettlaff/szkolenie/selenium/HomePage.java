package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

	@FindBy(name = "s")
	private WebElement searchBox;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void navigate() {
		driver.get("http://store.demoqa.com");
	}

	public SearchResultsPage searchProduct(String query) {
		searchBox.sendKeys(query);
		searchBox.submit();
		return new SearchResultsPage(driver);
	}
}
