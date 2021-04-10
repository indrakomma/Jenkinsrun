package stedef;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
 public WebDriver driver=null;
	
	@Test
	@Given("^lauching chrome$")
	public void lauching_chrome() throws Throwable {
	
	
		WebDriverManager.chromedriver().version("88.0.4324.27").setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
	@Test
	@When("^going to login page$")
	public void going_to_login_page() throws Throwable {
		
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtUsername']")));
		System.out.println("in login page");
	   
	}
	@Test
	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtUsername']")));
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtPassword']")));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		
		
	}
	@Test
	@Then("^click on logn button$")
	public void click_on_logn_button() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='btnLogin']")));
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}
	
	
	@Test
	@Then("^veify user in home page$")
	public void veify_user_in_home_page() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[contains(text(),'Admin')]")));
		System.out.println("yes login successfull");
		driver.close();
		
	}
	
	@Then("^veify user in pim page$")
	public void veify_user_in_pim_page() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[contains(text(),'PIM')]")));
		System.out.println("PIM ERIFIED");
		driver.close();
	}

}
