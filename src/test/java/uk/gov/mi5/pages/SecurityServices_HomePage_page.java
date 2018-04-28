package uk.gov.mi5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecurityServices_HomePage_page {

	public WebDriver localDriver=null;
	
	
	
	public SecurityServices_HomePage_page(WebDriver driver){
		localDriver = driver;
	}
	
	
	
	
	public void whatWeDo(){
	Actions whatWeDoMenu_actions = new Actions(localDriver);
	WebElement whatWeDoMenu_element = localDriver.findElement(By.xpath(".//a[@class='what-we-do']"));
	
	whatWeDoMenu_actions.moveToElement(whatWeDoMenu_element).build().perform();
	
	WebDriverWait WebDriverWait_instance = new WebDriverWait(localDriver, 10);
	WebElement espionage_element = WebDriverWait_instance.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@href='/espionage']")));	
	espionage_element.click();
	}
}
