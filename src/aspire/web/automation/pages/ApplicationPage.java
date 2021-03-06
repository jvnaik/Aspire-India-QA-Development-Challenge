package aspire.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import aspire.web.automation.utilities.Utilities;

public class ApplicationPage {

	WebDriver driver;
	
	public ApplicationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Navigate to Inventory from Main page
	public void inventory() throws IOException
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("inventory_button"))).click();
	}
	
	//Navigate to Manufacturing from Main page
	public void manufacturing() throws IOException 
	{
		driver.findElement(By.xpath(Utilities.FetchElementLocators("manufacturing_button"))).click();
	}
	
	
	
}
