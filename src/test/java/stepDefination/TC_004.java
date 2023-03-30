package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_004 {

	WebDriver drive;

@Given("^open Application$")
public void open_application() {
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\Webdrivers\\chromedriver.exe");	// 1. Open Application
	System.out.println("Open Appication");
	
	 drive = new ChromeDriver();	
}

@When("^open Google URL$")
public void open_google_url() {
	drive.navigate().to("https://www.google.com/");	
}

@When("^retrieve all the Links from Google Page$")
public void retrieve_all_the_links_from_google_page() {
	List<WebElement> gglink = drive.findElements(By.tagName("a"));		// a is Anchor tag
	for(WebElement link:gglink) 
	{
		System.out.println(link.getText());
	}
}

@Then("^close Application$")
public void close_application() {
   drive.close();
}

}
