package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	  @Given("^User is on Login Page$")
	  public void user_is_on_login_page() {
	  System.out.println("Inside Step: User is on Login Page"); }
	 
	 @When("^User Enter username and password$") public void
	  user_enter_username_and_password() {
	  System.out.println("User Enter UserName and Password"); }
	 
	  @When("^Click on Login button$") public void click_on_login_button() {
	  System.out.println("Inside Step: User is Click on Login button"); }
	
	  @Then("^User is navigated to the home page$") public void
	 user_is_navigated_to_the_home_page() {
	  System.out.println("Inside Step: User is NAvigate to home page"); }
	  
	 
	 
}
