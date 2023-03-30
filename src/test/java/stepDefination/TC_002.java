package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_002 {

	WebDriver driver;
	
	@Given("^User Launch Chrome browser$")
	public void user_launch_browser(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Webdrivers\\chromedriver.exe");
		System.out.println("Launch Browser");
		driver = new ChromeDriver();
	}
	
	@When("^User Open URl$")
	public void user_Open_URL() {
		
		driver.navigate().to("https://admin-demo.nopcommerce.com/login");
		System.out.println("Open URL");
	}
	
	@When("^User Enter Email and Password$")
	public void user_Enter_Email_and_Password() {
		
		//driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		//driver.findElement(By.name("Password")).sendKeys("admin");
		System.out.println("Enter Email and Password ");
	}
	
	@When("^Click on Login$")
	public void click_on_login() {
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		System.out.println("Login Successfull");
	}
	
	@When("^To Verify Title$")
	public void to_Verify_Title() {
		
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Your store. Login";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title Match");
	}
	
	@When("^User click on Logout Link$")
	public void user_click_Logout() {
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Application");
	}
	@Then("^Page Title Should be--Your store. Login$")
	public void page_Title() {
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Dashboard / nopCommerce administration";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title Match");
	}
	@Then("^Close browser$")
	public void close_Browser() {
		driver.close();
		System.out.println("Close Application");
	}
}
