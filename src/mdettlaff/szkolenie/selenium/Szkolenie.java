package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Szkolenie {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		try {
			driver.get("http://store.demoqa.com/");
			// WebElement search = driver.findElement(By.name("s"));
			// search.sendKeys("ipad");
			// search.sendKeys(Keys.ENTER);
			// search.submit();
			WebElement productCategory = driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
			Actions actions = new Actions(driver);
			actions.moveToElement(productCategory);
			actions.build().perform();
//			JavascriptExecutor ex = (JavascriptExecutor) driver;
//			ex.executeScript("arguments[0].click();", productCategory);
			Thread.sleep(1000);
		} finally {
			driver.close();
		}
	}
}
