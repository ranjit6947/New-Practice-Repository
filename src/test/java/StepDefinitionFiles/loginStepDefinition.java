package StepDefinitionFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {

	public WebDriver driver;
		
	@Given("initialize the web driver")
	public void initialize_the_web_driver() {
		driver = new ChromeDriver();
	}
	
	@And("user navigates the url {string}")
	public void user_navigates_the_url(String string) {
		driver.get(string);
	}
	
	@And("enter <username> and <passowrd> and click on login button")
	public void enter_username_and_passowrd(String Username, String Password) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	
	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		System.out.println("Login Successful");
	}
}
