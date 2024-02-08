package utils;

import pages.HomePage;
import pages.webautomation.WebAutomationPage;
import pages.webautomation.draggable.AutoScrollingPage;
import pages.weborder.WebOrderHomePage;
import pages.weborder.WebOrderLoginPage;

public class Pages {

	private HomePage homePage;

	// WEB_ORDER
	private WebOrderLoginPage webOrderLoginPage;

	private WebOrderHomePage webOrderHomePage;

	private WebAutomationPage webAutomationPage;

	private AutoScrollingPage autoScrollingPage;

	public Pages() {
		homePage = new HomePage();
		// WEB_ORDER
		webOrderLoginPage = new WebOrderLoginPage();
		webOrderHomePage = new WebOrderHomePage();

		webAutomationPage = new WebAutomationPage();
		autoScrollingPage = new AutoScrollingPage();
	}

	public HomePage getHomePage() {
		return homePage;
	}

	public WebOrderLoginPage getWebOrderLoginPage() {
		return webOrderLoginPage;
	}

	public WebOrderHomePage getWebOrderHomePage() {
		return webOrderHomePage;
	}

	public WebAutomationPage getWebAutomationPage() {
		return webAutomationPage;
	}

	public AutoScrollingPage getAutoScrollingPage() {
		return autoScrollingPage;
	}

}
