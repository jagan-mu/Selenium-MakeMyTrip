package stepTrip;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseTrip.BaseClass;
import LocatorTrip.locaterClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepClass extends BaseClass  {

	locaterClass pathLocater= new locaterClass();
	
	
	@Given("User enter the Makemytrip Url")
	public void user_enter_the_url() throws InterruptedException {
		geturl("https://www.makemytrip.com/flights/");
		implicitWait();
		try {
			driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		} catch (Exception e) {}
	}

	@Then("User click the bus")
	public void user_click_the_bus() throws InterruptedException {
		
		driver.findElement(pathLocater.bus).click();
	}

	@Then("User click the text")
	public void user_click_the_text()  throws InterruptedException{
		driver.findElement(pathLocater.text).click();
	   
	}

	@Then("User select pickuplocation")
	public void user_select_pickuplocation() {
		driver.findElement(pathLocater.pickuplocation).click();
		
	}

	@Then("User select droplocation")
	public void user_select_droplocation() {
		driver.findElement(pathLocater.droplocation).click();

	    
	}

	@Then("User select the date")
	public void user_select_the_date() {
		driver.findElement(pathLocater.date).click();
	    
	}

	@Then("User click search")
	public void user_click_search() {
		
	   driver.findElement(pathLocater.search).click();
	    
	}

	@Then("User click filter")
	public void user_click_filter() {
		
		driver.findElement(pathLocater.Filter).click();
	    
	}

	@Then("User click Cheapest")
	public void user_click_cheapest() {
		
		driver.findElement(pathLocater.cheapest).click();
	   
	}

	@Then("USer click Berth")
	public void u_ser_click_berth() {
		driver.findElement(pathLocater.berth).click();
		
	}

	@Then("User click activeitem")
	public void user_click_continue() {
		driver.findElement(pathLocater.activeitem).click();
	   
	}

	@Then("User selectseats")
	public void user_selectseats() {
		driver.findElement(pathLocater.selectseats).click();
	}

	@Then("User select horizontalseats")
	public void user_select_horizontalseats() {
		driver.findElement(pathLocater.horizontalseat).click();
	    
	}

	@Then("User select bookseats")
	public void user_select_bookseats() {
		driver.findElement(pathLocater.bookseats).click();
	   
	}
	

}
