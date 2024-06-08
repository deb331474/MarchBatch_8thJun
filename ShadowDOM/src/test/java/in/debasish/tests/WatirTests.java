package in.debasish.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static in.debasish.setUp.DriverManager.getDriver;
import org.testng.annotations.Test;

import in.debasish.pages.WatirPages;

public class WatirTests extends BaseTest {

	@Test
	public void testShadowDomWatir() {
		getDriver().get("http://watir.com/examples/shadow_dom.html");
		final WatirPages homePage = new WatirPages();
		// assertEquals (homePage.getSomeText(), "some text");
		AssertJUnit.assertEquals(homePage.getSomeText(), "some text");
		AssertJUnit.assertEquals(homePage.getNestedShadowText(), "nested text");
		AssertJUnit.assertEquals(homePage.getNestedText(), "nested text");
		AssertJUnit.assertEquals(homePage.getNestedTextUsingJSExecutor(), "nested text");
	}

}
