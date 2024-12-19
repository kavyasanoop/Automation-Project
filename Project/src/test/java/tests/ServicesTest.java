package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Services;

public class ServicesTest {
	
	WebDriver driver;
    Services servicesPage;

    @BeforeClass
    public void setUp() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        servicesPage = new Services(driver);
    }

    @Test
    public void testOpenServicesPage() {
        servicesPage. navigateToServices();
        String expectedUrl = "https://www.evabeautycare.com";
        String actualUrl = driver.getCurrentUrl();

        
        Assert.assertTrue(actualUrl.contains(expectedUrl), 
                "Expected URL: " + expectedUrl + " but got: " + actualUrl);
    }
}




