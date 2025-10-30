package LocatorTrip;

import org.openqa.selenium.By;

public class locaterClass {
	public By popup=By.xpath("//span[@data-cy=\"closeModal\"][1]");
	public By bus =By.xpath("(//li[@data-cy=\"menu_Buses\"])[1]");
	public By text =By.xpath("(//input[@type=\"text\"])[1]");
	public By pickuplocation = By.xpath("(//div[@class=\"makeFlex flexOne column\"][1]");
	public By droplocation= By.xpath("(//input[@type=\"text\"][1]");
	public By date=By.xpath("(//div[@class=\"makeFlex column\"][1]");
	public By search =By.xpath("//div[@class=\"makeFlex\"][1]");
	public By Filter =By.xpath("//div[@class=\"horiFilterBtn appendRight12 activeSlot\"][1]");
	public By cheapest =By.xpath("//div[@class=\"makeFlex column\"][1]");
	public By seats=By.xpath("//span[@class=\"checkmarkOuter\"][1]");
	public By berth=By.xpath("//div[@class=\"time-filter-option selected\"][1]");
	public By activeitem=By.xpath("//li[@class=\"activeItem\"][1]");
	public By selectseats =By.xpath("//div[@data-test-id=\"select-seats\"][1]");
	public By horizontalseat =By.xpath("//span[@data-testid=\"seat_horizontal_sleeper_available\"][1]");
	public By bookseats=By.xpath("//div[@class=\"cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active\"][1]");
	
		
	
	
}