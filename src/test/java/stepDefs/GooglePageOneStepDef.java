package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageOneStepDef {
	WebDriver driver;
	
	@When("User search Cypress Tutorial")
	public void user_search_Cypress_tutorial() {
		WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("Cypress Tutorial");
	    searchBox.submit();
	}
	@Then("Should display Cypress result page")
	public void should_display_Cypress_result_page() {
		 String strTitle = driver.getTitle();
		   Assert.assertEquals("Cypress Tutorial - Google Search", strTitle);
	}

}
