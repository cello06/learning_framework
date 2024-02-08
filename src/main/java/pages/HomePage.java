package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(css = "a > img")
	private WebElement inarAcademyLogo;

	@FindBy(xpath = "(//input[@role='switch']/../div)[2]")
	private WebElement backgroundChangerElement;

	@FindBy(linkText = "Weborder")
	private WebElement webOrderLink;

	@FindBy(linkText = "Webautomation")
	private WebElement webAutomationLink;

	@FindBy(linkText = "Target Market")
	private WebElement targetMarketLink;

	@FindBy(linkText = "Booking")
	private WebElement bookingLink;

	@FindBy(linkText = "Handling Certifications")
	private WebElement handlingCertificationsLink;

	@FindBy(linkText = "File Uploading")
	private WebElement fileUploadingLink;

	public void clickInarAcademyLogo() {
		inarAcademyLogo.click();
	}

	public void changeBackground() {
		backgroundChangerElement.click();
	}

	public void clickWebOrderLink() {
		webOrderLink.click();
	}

	public void clickWebAutomationLink() {
		webAutomationLink.click();
	}

	public void clickTargetMarketLink() {
		targetMarketLink.click();
	}

	public void clickHandlingCertificationsLink() {
		handlingCertificationsLink.click();
	}

	public void clickFileUploadingLink() {
		fileUploadingLink.click();
	}

}
