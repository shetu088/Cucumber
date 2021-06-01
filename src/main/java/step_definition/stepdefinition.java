package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefinition {
	
	
	WebDriver driver ;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\cucumber\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	    String s = driver.getCurrentUrl();
	    System.out.println(s);
	}

	

@Then("^user clicked on the Home link$")
public void user_clicked_on_the_Home_link()  {
	
	
	driver.findElement(By.linkText("Home")).click();
   
}

@Then("^user search for particular name$")
public void user_search_for_particular_name() {
	
	
	driver.findElement(By.id("Search_Data")).sendKeys("akhil");
    
}

@Then("^user clicked on Find$")
public void user_clicked_on_Find()  {
  
	
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
}
}
