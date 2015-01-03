package mdettlaff.szkolenie.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Szkolenie {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		Thread.sleep(3000);
		driver.close();
	}
}
