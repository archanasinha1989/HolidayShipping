package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	public String Black_Checkbox="//span[@id='SPAN__checkmark__107']";
	public String Filter_Button="//button[@id='filterBtn']";
	public String Appli_Air_x_Night="//h3[contains(text(),'Appli Air x Night')]";
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	
	
	
}
