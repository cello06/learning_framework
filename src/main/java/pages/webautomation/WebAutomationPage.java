package pages.webautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class WebAutomationPage extends BasePage {

	@FindBy(linkText = "Draggable")
	private WebElement draggableLink;

	@FindBy(linkText = "Default Functionality")
	private WebElement defaultFunctionalityLink;

	@FindBy(linkText = "Auto Scrolling")
	private WebElement autoScrollingLink;

	@FindBy(linkText = "Droppable")
	private WebElement droppableLink;

	@FindBy(linkText = "Resizable")
	private WebElement resizableLink;

	@FindBy(linkText = "Selectable")
	private WebElement selectableLink;

	@FindBy(linkText = "Iframe")
	private WebElement iframeLink;

	@FindBy(linkText = "Nested Iframe")
	private WebElement nestedIframeLink;

	public void clickOnDraggableLink() {
		draggableLink.click();
	}

	public void clickOnDraggableDefaultFunctionalityLink() {
		defaultFunctionalityLink.click();
	}

	public void clickOnDroppableDefaultFunctionalityLink() {
		defaultFunctionalityLink.click();
	}

	public void clickOnDroppableLink() {
		droppableLink.click();
	}

	public void clickOnAutoScrollingLink() {
		autoScrollingLink.click();
	}

	public void clickOnResizableLink() {
		resizableLink.click();
	}

	public void clickOnResizableDefaultFuncLink() {
		defaultFunctionalityLink.click();
	}

	public void clickOnSelectableLink() {
		selectableLink.click();
	}

	public void clickOnDefaultFunctionality() {
		defaultFunctionalityLink.click();
	}

	public void clickOnIframeLink() {
		iframeLink.click();
	}

	public void clickOnNestedIframe() {
		nestedIframeLink.click();
	}

}
