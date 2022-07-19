package org.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class tTvPurchaseStepsdefinition {
	
	@When("user search TV")
	public void user_search_TV() {
		MobilePurchaseSteps .driver.findElement(By.xpath("//input[@name='q']")).sendKeys("miTV",Keys.ENTER);
	}
	@When("user choose the TV and doing payment")
	public void user_choose_the_TV_and_doing_payment() {
		MobilePurchaseSteps.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String mi =MobilePurchaseSteps. driver.getWindowHandle();
		Set<String> mobile = MobilePurchaseSteps.driver.getWindowHandles();
		for(String x :mobile){
			if(!x.equals(mi)){
				MobilePurchaseSteps.driver.switchTo().window(x);
	}}}
		
		@When("user search TV by useing one dim list")
		public void user_search_TV_by_useing_one_dim_list(DataTable dataTable) {
			List<String> asList = dataTable.asList();
			WebElement search=MobilePurchaseSteps.driver.findElement(By.xpath("//input[@name='q']"));
			search.sendKeys(asList.get(2),Keys.ENTER);
			MobilePurchaseSteps.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
			String text = search.getText();}
		
		@When("user search TV by useing one dim Map")
		public void user_search_TV_by_useing_one_dim_Map(DataTable dataTable) {
			Map<String, String> asMap = dataTable.asMap(String.class,String.class);
			WebElement search=MobilePurchaseSteps.driver.findElement(By.xpath("//input[@name='q']"));
			
			search.sendKeys(asMap.get("phone2"),Keys.ENTER);
			MobilePurchaseSteps.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
			String text = search.getText();
		}
		@When("user search TV{string}")
		public void user_search_TV(String string) {
			
			WebElement search=MobilePurchaseSteps.driver.findElement(By.xpath("//input[@name='q']"));
			
			search.sendKeys(string,Keys.ENTER);
			MobilePurchaseSteps.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
			String text = search.getText();
		}  

		}