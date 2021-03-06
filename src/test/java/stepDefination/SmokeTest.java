package stepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest 
{

	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
	    
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_and_valid(String uname, String pass) throws Throwable {
	    driver.findElement(By.id("email")).sendKeys(uname);
	    driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    driver.findElement(By.id("u_0_b")).click();
	}
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    driver.quit();
	}

}
