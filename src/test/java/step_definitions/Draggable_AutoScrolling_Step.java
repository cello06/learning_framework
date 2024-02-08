package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 1. Open the browser and navigate to the page 2. click on the draggable button 3. click
 * on the auto scrolling button 4. Drag the first draggable element by 215 pixels to the
 * right 5. Drag the third draggable element by -215 pixels to the left 6. Verify that the
 * elements are ordered as "Three", "Two", "One"
 */
public class Draggable_AutoScrolling_Step extends BaseStep {

	private static final Logger LOGGER = LogManager.getLogger(Draggable_AutoScrolling_Step.class);

	@Given("The user is on the webautomation page")
	public void theUserIsOnTheWebAutomationPage() {
		PAGES.getHomePage().clickWebAutomationLink();
		LOGGER.info("Open the browser and navigate to the webautomation page");
	}

	@And("the user clicked to Draggable tab")
	public void theUserClickedToDraggableTab() {
		PAGES.getWebAutomationPage().clickOnDraggableLink();
		LOGGER.info("Click on the draggable button");
	}

	@And("the user clicked to Auto Scrolling link")
	public void theUserClickedToAutoScrollingLink() {
		PAGES.getWebAutomationPage().clickOnAutoScrollingLink();
		LOGGER.info("Click on the auto scrolling button");
	}

	@When("the user Drag the first draggable element by 215 pixels to the right")
	public void theUserDragFirstDraggableElement() {
		PAGES.getAutoScrollingPage().dragFirstDraggableByXOffset(215);
		LOGGER.info("Drag the first draggable element by 215 pixels to the right");
	}

	@And("the user Drag the third draggable element by -215 pixels to the left")
	public void theUserDragThirdDraggableElement() {
		PAGES.getAutoScrollingPage().dragThirdDraggableByXOffset(-215);
		LOGGER.info("Drag the third draggable element by -215 pixels to the left");
	}

	@Then("the elements are ordered as Three, Two, One")
	public void verifyOrderOfElements() {
		int finalX1 = PAGES.getAutoScrollingPage().getLocationOfFirstDraggableX();
		int finalX2 = PAGES.getAutoScrollingPage().getLocationOfSecondDraggableX();
		int finalX3 = PAGES.getAutoScrollingPage().getLocationOfThirdDraggableX();

		Assertions.assertThat(finalX3).isLessThan(finalX2);
		Assertions.assertThat(finalX2).isLessThan(finalX1);
		LOGGER.debug("Verify that the elements are ordered as \"Three\", \"Two\", \"One\"");
	}

}
