package webautomation_test.draggable_test;

import base_test.Hooks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page 2. click on the draggable button 3. click
 * on the auto scrolling button 4. Drag the first draggable element by 215 pixels to the
 * right 5. Drag the third draggable element by -215 pixels to the left 6. Verify that the
 * elements are ordered as "Three", "Two", "One"
 */
public class Draggable_AutoScrolling_Test extends Hooks {
	private static final Logger LOGGER = LogManager.getLogger(Draggable_AutoScrolling_Test.class);

	@Test
	void testAutoScrolling() {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickWebAutomationLink();
		LOGGER.debug("Open the browser and navigate to the page");

		// 2. click on the draggable button
		pages.getWebAutomationPage().clickOnDraggableLink();
		LOGGER.debug("Click on the draggable button");

		// 3. click on the auto scrolling button
		pages.getWebAutomationPage().clickOnAutoScrollingLink();
		LOGGER.debug("Click on the auto scrolling button");

		// 4. Drag the first draggable element by 215 pixels to the right
		pages.getAutoScrollingPage().dragFirstDraggableByXOffset(215);
		LOGGER.debug("Drag the first draggable element by 215 pixels to the right");

		// 5. Drag the third draggable element by -215 pixels to the left
		pages.getAutoScrollingPage().dragThirdDraggableByXOffset(-215);
		LOGGER.debug("Drag the third draggable element by -215 pixels to the left");

		// 6. Verify that the elements are ordered as "Three", "Two", "One"
		int finalX1 = pages.getAutoScrollingPage().getLocationOfFirstDraggableX();
		int finalX2 = pages.getAutoScrollingPage().getLocationOfSecondDraggableX();
		int finalX3 = pages.getAutoScrollingPage().getLocationOfThirdDraggableX();

		Assertions.assertThat(finalX3).isLessThan(finalX2);
		Assertions.assertThat(finalX2).isLessThan(finalX1);
		LOGGER.debug("Verify that the elements are ordered as \"Three\", \"Two\", \"One\"");

	}

}
