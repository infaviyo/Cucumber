package org.flipkart.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps {
	static WebDriver driver;
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user Login into flipkart")
	public void user_Login_into_flipkart() {
		try {
			WebElement login = driver.findElement(By.xpath("//button[text()='✕']"));
			login.isDisplayed();
		login.click();}
		catch(Exception e) {
			System.out.println("cancel");}
	}

	@When("user search moblie")
	public void user_search_moblie() {
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("miMobiles",Keys.ENTER);
	}

	@When("user choose the mobile and doing payment")
	
	public void user_choose_the_mobile_and_doing_payment() {
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String mi = driver.getWindowHandle();
		Set<String> mobile = driver.getWindowHandles();
		for(String x :mobile){
			if(!x.equals(mi)){
		driver.switchTo().window(x);
		System.out.println("Window");}}}
	
	

	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() throws IOException {
		
		TakesScreenshot tk=(TakesScreenshot) driver;
	     File b = tk.getScreenshotAs(OutputType.FILE);
	     File d=new File("C:\\Users\\vetrivel\\eclipse-workspace\\FW\\screenshot\\fk.png");
	     FileUtils.copyFile(b,d);
	     driver.quit();
	
	}
	@When("user search moblie by useing one dim list")
	public void user_search_moblie_by_useing_one_dim_list(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	
	search.sendKeys(asList.get(2),Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	String text = search.getText();


	}
	@When("user search moblie by useing one dim Map")
	public void user_search_moblie_by_useing_one_dim_Map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class,String.class);
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		
		search.sendKeys(asMap.get("phone2"),Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String text = search.getText();
	}
	@When("user search moblie{string}")
	public void user_search_moblie(String string) {
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		
		search.sendKeys(string,Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String text = search.getText();
	}  
	}



