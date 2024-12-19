package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import pages.About_Us;

public class AboutUsTest {
	
	    WebDriver driver;
	    About_Us aboutUsPage;

	    @BeforeClass
	    public void setUp() {
	      
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        aboutUsPage = new About_Us(driver);
	    }

	    @Test
	    public void testOpenAboutUsPage() {
	        aboutUsPage. navigateToAboutUs(); 
	        
	        String expectedUrl = "https://www.evabeautycare.com";
	        String actualUrl = driver.getCurrentUrl();

	        
	        Assert.assertTrue(actualUrl.contains(expectedUrl), 
	                "Expected URL: " + expectedUrl + " but got: " + actualUrl);
	    }
	}
	        
	        
	       