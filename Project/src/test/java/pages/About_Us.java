package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About_Us {
	
	 WebDriver driver;
	 private By aboutUsLink = By.linkText("ABOUT US");

	    public About_Us(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void navigateToAboutUs() {
	    	driver.get("https://www.evabeautycare.com/");
	    	driver.findElement(aboutUsLink).click(); 
	    }
	}


