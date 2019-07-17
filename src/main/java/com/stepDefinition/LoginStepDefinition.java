package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	
	WebDriver driver;
	
	@Given("^User is already available on login page$")
	public void user_is_already_available_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		//driver.close();
	}

	@When("^Title of the login page is FreeCRM$")
	public void title_of_the_login_page_is_FreeCRM() throws Throwable {
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		Assert.assertEquals("CRM", title);
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sudhirchakravarthin@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9959@Sudhir");
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {

		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

		String titleOfPageAfterLogin = driver.getTitle();
		Assert.assertEquals("CRM", titleOfPageAfterLogin);
		driver.close();
	}
}
