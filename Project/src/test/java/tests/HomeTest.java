package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import pages.Homepage;

public class HomeTest {
	
	WebDriver driver;
    Homepage homePage;

    @BeforeClass
    public void setUp() {
     
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new Homepage(driver);
    }

    @Test
    public void testOpenHomePage() {
      
        homePage.openHomePage();

       
        String expectedUrl = "https://www.evabeautycare.com";
        String actualUrl = driver.getCurrentUrl();

        
        Assert.assertTrue(actualUrl.contains(expectedUrl), 
                "Expected URL: " + expectedUrl + " but got: " + actualUrl);
    }
}


