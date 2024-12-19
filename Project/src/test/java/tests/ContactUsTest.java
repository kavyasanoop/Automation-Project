package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Contact_Us;

public class ContactUsTest {
	
	 WebDriver driver;
	    Contact_Us contactUsPage;

	    @BeforeClass
	    public void setUp() {
	    
	      
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	       
	        contactUsPage = new Contact_Us(driver);

	    
	        contactUsPage.navigateToContactUsPage();
	    }

	    @Test
	    public void testContactUsFormSubmission() {
	      
	        String name = "Niyan";
	        String email = "niyanan@example.com";
	        String city = "kaaz";
	        String mobile = "5678900321";
	        String requirements = "I would like to know more about your skin care services.";
	        
	     
	        contactUsPage.fillContactForm(name, email, city, mobile, requirements);
	        
	        Assert.assertTrue(contactUsPage.isConfirmationMessageDisplayed(), "Form submission failed. Confirmation message not displayed.");
	    }
	}

	      
	       

	        
	   
