package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Gallery;

public class GalleryTest {
	
	 WebDriver driver;
	    Gallery galleryPage;

	    @BeforeClass
	    public void setUp() {
	      
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        galleryPage = new Gallery(driver);
	    }

	    @Test
	    public void testOpenGalleryPage() {
	        galleryPage.navigateToGallery(); 
	        String expectedUrl = "https://www.evabeautycare.com/album";
	        String actualUrl = driver.getCurrentUrl();
	        Assert.assertTrue(actualUrl.contains(expectedUrl), "Gallery page URL is incorrect.");

	      
	        boolean imagesExist = galleryPage.areImagesDisplayed();
	        Assert.assertTrue(imagesExist, "Gallery images are not displayed.");
	    }


}
