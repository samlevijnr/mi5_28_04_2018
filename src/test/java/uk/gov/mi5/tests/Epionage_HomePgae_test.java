package uk.gov.mi5.tests;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import uk.gov.mi5.pages.SecurityServices_HomePage_page;

public class Epionage_HomePgae_test {

	public WebDriver driver = null;
	
	
	@BeforeTest()
	public void initiate(){
		System.setProperty("webdriver.gecko.driver", "D:/Selenium/gecko19/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.mi5.gov.uk/");
	}
	
	@Test()
	public void epionage_HomePage(){
		SecurityServices_HomePage_page SecurityServices_HomePage_page_instance = new SecurityServices_HomePage_page(driver);
		SecurityServices_HomePage_page_instance.whatWeDo();
	}
	
	@AfterMethod()
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
	}
	
	@AfterTest()
	public void notification(){
		JOptionPane.showMessageDialog(null, "Final completion successfull");
	}
	
}
