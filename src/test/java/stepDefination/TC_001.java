package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_001 {
	WebDriver driver;

	@Given("^Open Application$")
	public void open_application() {
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("Application opened");
	}

	@When("^Verify Title$")
	public void verify_title() {
		System.out.println("Title");
	}

	@Then("^Close Application$")
	public void close_application() {
		driver.close();
		System.out.println("Close Application");
	}

	@When("^Login into application$")
	public void login_into_application() {
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login AppliCation");
	}

	@When("^Logout from application$")
	public void logout_from_application() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfull");
	}
}
