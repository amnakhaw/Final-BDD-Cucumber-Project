package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosPage extends BasePage {
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public TechfiosPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set SkyBlue Background')]")
	WebElement SetSkyBlueColorButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set White Background')]")
	WebElement SetWhiteColorButton;
	@FindBy(how = How.XPATH, using = "//body[@style = 'background-color: skyblue;']")
	WebElement SkyBlueBackGroundColor;
	@FindBy(how = How.XPATH, using = "//body[@style = 'background-color: white;']")
	WebElement WhiteBackGroundColor;
		

	// Methods to interact with the elements
	public void clickBackgroundColorToSkyBlueButton() {
		SetSkyBlueColorButton.click();
	}

	// Assertion for sky blue button is enabled
	public boolean isSkyBlueButtonEnabled() {
		return SetSkyBlueColorButton.isEnabled();
	}

	// Methods to interact with the elements
	public void clickBackgroundColorToWhiteButton() {
		SetWhiteColorButton.click();
	}

	// Assertion if white button is enabled
	public boolean isWhiteButtonEnabled() {
		return SetWhiteColorButton.isEnabled();
	}
	
	//validate sky blue color
	public String getSkyBlueBackgroundColor() {
		return SkyBlueBackGroundColor.getAttribute("style");
		
	}
	//validate white color
		public String getWhiteBackgroundColor() {
			return WhiteBackGroundColor.getAttribute("style");
			
		}
		
		public void closeandquit() {
			driver.close();
			driver.quit();
		}

	

}
