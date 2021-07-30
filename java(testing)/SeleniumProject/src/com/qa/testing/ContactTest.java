package com.qa.testing;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.pages.ContactPage;



public class ContactTest {

	private WebDriver driver;

	@Before
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();

	}
	@Test
	public void testContact() throws InterruptedException {
		
	
	ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
	
	String email= "david@gmail.com";
	String fullname= "david b";
	String issuetitle= "test";
	String issuedesc= "testing";
	
	this.driver.get(contactPage.URL);
	
	contactPage.enterContactInfo(email, fullname, issuetitle, issuedesc);
	
	assertTrue(contactPage.checkEmailEntry().contains(email));
	
	}
	@Test
	public void testFooter() throws InterruptedException {
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		String footer = "© Team 1 2021, This work is fictional any resemblence to people living or desceased is purely coincidental";
		this.driver.get(contactPage.URL);
	
	assertTrue(contactPage.checkFooter().contains(footer));
	
	}
	
	@After
	public void teardown() {
		this.driver.quit();
	}
}
