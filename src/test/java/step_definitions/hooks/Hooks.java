package step_definitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.ConfigManager;
import utils.DriverManager;

public class Hooks {

	private static final Logger LOGGER = LogManager.getLogger(Hooks.class);

	@Before
	public void setUpTestEnvironment(Scenario scenario) {
		LOGGER.info("-------------Test Automation is started-------------");
		LOGGER.info("Test Scenario : " + scenario.getName());
		LOGGER.info("Browser Type  : " + ConfigManager.getProperty("browser"));

		DriverManager.getWebDriver();
	}

	@After
	public void tearDownTestEnvironment(Scenario scenario) {
		if (scenario.isFailed()) {
			LOGGER.error("Test Scenario ->>> ->>>>> FAILED! " + scenario.getName());
		}
		else {
			LOGGER.info("Test Scenario ->>> ->>>>> PASSED! " + scenario.getName());
		}
		DriverManager.closeDriver();
	}

}
