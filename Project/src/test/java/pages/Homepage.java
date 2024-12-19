package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
    WebDriver driver;
    private By homeLink = By.linkText("HOME");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://www.evabeautycare.com"); 
        driver.findElement(homeLink).click(); 
        
    }

}
