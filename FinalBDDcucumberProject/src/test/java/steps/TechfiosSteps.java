package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.TechfiosPage;
import util.BrowserFactory;

public class TechfiosSteps {
	WebDriver driver;
	TechfiosPage techfiosPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		techfiosPage = PageFactory.initElements(driver, TechfiosPage.class);

	}

	@Given("^SkyBlue Background button exists;$")
	public void skyblue_Background_button_exists() {
		// techfiosPage.isSkyBlueButtonEnabled();
		assertTrue("Sky Blue Background does not exist!", techfiosPage.isSkyBlueButtonEnabled());
	}

	@When("^I click on SkyBlue the button$")
	public void i_click_on_SkyBlue_the_button() {
		techfiosPage.clickBackgroundColorToSkyBlueButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		System.out.println("The Background color is changed to Blue" + techfiosPage.getSkyBlueBackgroundColor());
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		assertTrue("White Background does not exist!", techfiosPage.isWhiteButtonEnabled());

	}

	@When("^I click on WhiteBackground the button$")
	public void i_click_on_WhiteBackground_the_button() {
		techfiosPage.clickBackgroundColorToWhiteButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		System.out.println("The Background color is changed to Blue" + techfiosPage.getWhiteBackgroundColor());
	}
//	@After
//	public void afterRun() {
//		techfiosPage.closeandquit();
//	}

}
