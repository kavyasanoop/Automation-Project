package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gallery {
	
	 WebDriver driver;
	private By galleryImages;

	    public Gallery(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void navigateToGallery() {
	    	driver.get("https://www.evabeautycare.com/");
	        driver.findElement(By.linkText("GALLERY")).click();

}
	    public boolean areImagesDisplayed() {
	        try {
	       
				WebElement image = driver.findElement(galleryImages);
	            return image.isDisplayed();
	        } catch (Exception e) {
	            return false; 
	        }
	    }
	}

