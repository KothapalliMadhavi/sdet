package stepDefinations;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertTestSteps {
	
	WebDriver  driver;	
	 WebDriverWait wait;
	String ChromePath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\chromedriver_win32\\chromedriver.exe";

	
    Alert alert;
	
 
	
    @Given("^User is on the page$")
	
    public void openPage() {
	
        //Create Instances
	
    	System.setProperty("webdriver.chrome.driver", ChromePath);
		driver = new ChromeDriver();	
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
	
 
	
        //Open browser
	
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
	
    }
	
 
	
    @When("^User clicks the Simple Alert button$")
	
    public void openSimpleAlert() {
	
        driver.findElement(By.cssSelector("#simple")).click();
	
    }
	
 
	
    @When("^User clicks the Confirm Alert button$")
	
    public void openConfirmAlert() {
	
        driver.findElement(By.cssSelector("#confirm")).click();
	
    }
	
 
	
    @When("^User clicks the Prompt Alert button$")
	
    public void openPromptAlert() {
	
        driver.findElement(By.cssSelector("#prompt")).click();
	
    }
	
 
	
    @Then("^Alert opens$")
	
    public void switchFocus() {
	
        alert = driver.switchTo().alert();
	
    }
	
 
	
    @And("^Read the text from it and print it$")
	
    public void readAlert() {
	
        System.out.println("Alert says: " + alert.getText());
	
    }
	
 
	
    @And("^Write a custom message in it$")
	
    public void writeToPrompt() throws Exception {
    	 Thread.sleep(5000);
        alert.sendKeys("Custom Message");
        Thread.sleep(2000);
	
    }
	
 
	
    @And("^Close the alert$")
	
    public void closeAlert() {
	
        alert.accept();
	
    }
	
 
	
    @And("^Close the alert with Cancel$")
	
    public void closeAlertWithCAncel() {
	
        alert.dismiss();
	
    }
	
 
	
    @And("^Close Browser$")
	
    public void closeBrowser() {
	
        driver.close();
	
    }

}