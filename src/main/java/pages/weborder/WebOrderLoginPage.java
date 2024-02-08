package pages.weborder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class WebOrderLoginPage extends BasePage {

	@FindBy(xpath = "//h2[text()='Login']")
	private WebElement loginHeaderElement;

	@FindBy(id = "login-username-input")
	private WebElement usernameTextField;

	@FindBy(id = "login-password-input")
	private WebElement passwordTextField;

	@FindBy(id = "login-button")
	private WebElement loginButtonElement;

	@FindBy(id = "username-error-alert")
	private WebElement invalidUsernameMessage;

	@FindBy(id = "password-error-alert")
	private WebElement invalidPasswordMessage;

	public void enterUsername(String username) {
		usernameTextField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButtonElement.click();
	}

	public void loginWithCredentials(String userName, String password) {
		enterUsername(userName);
		enterPassword(password);
		clickLoginButton();
	}

	public String getUsernameErrorMessage() {
		return invalidUsernameMessage.getText();
	}

	public String getPasswordErrorMessage() {
		return invalidPasswordMessage.getText();
	}

	public List<String> getErrorMessages() {
		List<String> result = new ArrayList<>();
		result.add(invalidUsernameMessage.getText());
		result.add(invalidPasswordMessage.getText());

		return result;
	}

}
