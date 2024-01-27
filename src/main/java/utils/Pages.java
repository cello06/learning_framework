package utils;

import pages.HomePage;
import pages.webautomation.WebAutomationPage;
import pages.webautomation.draggable.AutoScrollingPage;
import pages.weborder.WebOrderLoginPage;

public class Pages {

	private HomePage homePage;

	private WebOrderLoginPage webOrderLoginPage;

	private WebAutomationPage webAutomationPage;

	private AutoScrollingPage autoScrollingPage;

	public Pages() {
		homePage = new HomePage();
		webOrderLoginPage = new WebOrderLoginPage();
		webAutomationPage = new WebAutomationPage();
		autoScrollingPage = new AutoScrollingPage();
	}

	public HomePage getHomePage() {
		return homePage;
	}

	public WebOrderLoginPage getWebOrderLoginPage() {
		return webOrderLoginPage;
	}

	public WebAutomationPage getWebAutomationPage() {
		return webAutomationPage;
	}

	public AutoScrollingPage getAutoScrollingPage() {
		return autoScrollingPage;
	}

}
