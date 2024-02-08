package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

public class BasePage {

	protected final WebDriver DRIVER;

	protected WebDriverWait wait;

	public Actions actions;

	public BasePage() {
		DRIVER = DriverManager.getWebDriver();
		PageFactory.initElements(DRIVER, this);
		DRIVER.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		actions = new Actions(DRIVER);
		wait = new WebDriverWait(DRIVER, Duration.ofSeconds(10));

	}

}
