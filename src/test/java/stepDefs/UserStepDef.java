package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStepDef {
	WebDriver driver;

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/login");
		
	}
	
	//@When("User enters credentials")
		//public void user_enters_credentials() {
		//	driver.findElement(By.id("username")).sendKeys("tomsmith");
		//	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.className("radius")).click();
				   
		//}

	
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUser, String strPwd) {
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//		}

//	Using datatable as Lists
//	@When("User enters login credentials")
//	public void user_enters_login_credentials(io.cucumber.datatable.DataTable userCred) {
//	    List<List<String>> data = userCred.asLists();
//		String strUser = data.get(0).get(0);
//		String strPwd = data.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}
	
	
	//using datatable as Maps	
	@When("User enters login credentials")
	public void user_enters_login_credentials(io.cucumber.datatable.DataTable userCred) {
	    List<Map<String, String>> data = userCred.asMaps();
	   String strUser = data.get(0).get("username");
	   String strPwd = data.get(0).get("password");
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.className("radius")).click();
	}

//	@Then("Should display Error page")
//	public void should_display_error_page() {
//	   boolean isError = driver.findElement(By.cssSelector("div.flash.error")).isDisplayed();
//	   Assert.assertTrue(isError);
//	}
	
	@Then("Should display Home page")
	public void should_display_home_page() {
	   boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	   Assert.assertTrue(isDisp);
	}




}
