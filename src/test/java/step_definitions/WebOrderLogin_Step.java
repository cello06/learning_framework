package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class WebOrderLogin_Step extends BaseStep {

	private static final Logger LOGGER = LogManager.getLogger(WebOrderLogin_Step.class);

	@Given("The user is on the weborder login page")
	public void the_user_is_on_the_weborder_login_page() {
		PAGES.getHomePage().clickWebOrderLink();
		LOGGER.info("The user is on the weborder login page");
	}

	@When("the user enters {string},{string}")
	public void the_user_enters(String username, String password) {
		PAGES.getWebOrderLoginPage().loginWithCredentials(username, password);
		LOGGER.info("The user enter username and password and click Login button");
	}

	@Then("the user face with {string}")
	public void the_user_face_with(String expectedErrorMessage) {
		List<String> errorMessages = PAGES.getWebOrderLoginPage().getErrorMessages();
		then(errorMessages.contains(expectedErrorMessage)).withFailMessage("Error message is not correctly displayed!")
			.isTrue();
	}

}
