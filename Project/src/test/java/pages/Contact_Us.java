package pages;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Contact_Us {
	 WebDriver driver;

	   
	    private By nameField = By.xpath("//*[@id=\"name\"]");             
	    private By emailField = By.xpath("//*[@id=\"email\"]");
	    private By cityField = By.xpath("//*[@id=\"city\"]");
	    private By mobileField = By.xpath("//*[@id=\"mobile\"]");         
	    private By requirementsField = By.xpath("//*[@id=\"about_inner\"]/div/div/div[2]/form/div[5]/input"); 
	    private By submitButton = By.xpath("//*[@id=\"button\"]"); 
	    private By successMessage = By.xpath("//*[@id=\"about_inner\"]/div/div/div/div/h2");
	   
	    public Contact_Us(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void navigateToContactUsPage() {
	        driver.get("http://www.evabeautycare.com/index.php"); 
	        driver.findElement(By.linkText("CONTACT US")).click(); 
	    }
	    
	    public void fillContactForm(String name, String email, String city, String mobile, String requirements) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(name);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(cityField)).sendKeys(city);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(mobileField)).sendKeys(mobile);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(requirementsField)).sendKeys(requirements);
	        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	    }
	    public void clickSubmitButton() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	    }
	    
	    public boolean isConfirmationMessageDisplayed() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        try {
	            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
	            return message.isDisplayed();
	        } catch (Exception e) {
	            return false;
	        }
	    }
	}
	

	   
	    

	 

	

	



