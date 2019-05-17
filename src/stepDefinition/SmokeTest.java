package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
		WebDriver driver;
	
		@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
		   System.setProperty("webdriver.chrome.driver", "D:/Kuliah/Private/Semester7/PUPL/week13/W13_Cucumber Jars/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://kasirpintar.co.id/");
		}

		@When("^I click Careers$")
		public void I_click_careers() throws Throwable {
			driver.get("https://kasirpintar.co.id/careers");
		}

		@When("^I enter Quality Assurance$")
		public void I_enter_quality_assurance() throws Throwable {
		    driver.findElement(By.id("posisi")).sendKeys("Quality Assurance");
		}
		
		@When("^I choose division$")
		public void I_choose_division() throws Throwable {
			driver.findElement(By.id("divisi")).click();
			driver.findElement(By.xpath("//option[contains(text(),'Technology')]")).click();;
		}
		
		@Then("^I search successfully$")
		public void I_search_successfully() throws Throwable {
		   driver.findElement(By.id("cari")).click();
		}
}
