package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Services {
	
	WebDriver driver;

    public Services(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToServices() {
    	driver.get("https://www.evabeautycare.com/");
        driver.findElement(By.linkText("SERVICES")).click(); 
        
    }

}
