package base_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import utils.DriverManager;
import utils.Pages;

public class Hooks {

	protected Pages pages;

	public SoftAssert softAssert = new SoftAssert();

	private static final Logger LOGGER = LogManager.getLogger(Hooks.class);

	// @Parameters("browser")
	@BeforeClass
	public void setUpTestEnvironment() {
		String browserType = "chrome";
		DriverManager.getWebDriver(browserType);
		pages = new Pages();
		LOGGER.info("Test started!");
	}

	@AfterClass
	public void tearDownTestEnvironment() {
		DriverManager.closeDriver();
		LOGGER.info("Test finished!");
	}

}
