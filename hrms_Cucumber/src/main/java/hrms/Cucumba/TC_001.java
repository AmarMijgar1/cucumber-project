package hrms.Cucumba;



public class TC_001 {
	
	    public WebDriver driver;
	    @Given("^Open Application$")
	    public void openApplication(){
	        System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
	        driver = new FirefoxDriver();
	        driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login");
	        System.out.println("Application opened");
	    }
	    @When("^Verify Title$")
	    public void verifyTitle()    {
	        System.out.println("Verifying the Title");
	    }
	   
	    @Then("^Close Application$")
	    public void closeApplication()    {
	        driver.quit();
	        System.out.println("Login page should be shown");
	    }
	    @When("^Login into application$")
	    public void login() {
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    driver.findElement(By.name("Submit")).click();
	    System.out.println("Login completed");
	    }
	    @When("^Logout from application$")
	    public void logout() {
	    driver.findElement(By.linkText("Logout")).click();
	    }

}
