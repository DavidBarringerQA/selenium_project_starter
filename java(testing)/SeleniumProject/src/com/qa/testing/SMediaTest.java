package com.qa.testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import org.junit.Test;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.PageFactory;

import com.qa.test.pages.ContactPage;
import com.qa.test.pages.SearchPage;

public class SMediaTest {

	private WebDriver driver;

	@Before
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();

	}

	@Test
	public void testFacebook() throws InterruptedException {

		SearchPage search = PageFactory.initElements(driver, SearchPage.class);

		this.driver.get(search.URL);

		search.goFacebook();

	}

	@Test
	public void testTwitter() throws InterruptedException {

		SearchPage search = PageFactory.initElements(driver, SearchPage.class);

		this.driver.get(search.URL);

		search.goTwitter();
	}

	@Test
	public void testYoutube() throws InterruptedException {

		SearchPage search = PageFactory.initElements(driver, SearchPage.class);

		this.driver.get(search.URL);

		search.goYoutube();
	}

	@Test
	public void testInstagram() throws InterruptedException {

		SearchPage search = PageFactory.initElements(driver, SearchPage.class);

		this.driver.get(search.URL);

		search.goInstagram();
	}
	@Test
	public void testFooter() throws InterruptedException {
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		String footer = "© Team 1 2021, This work is fictional any resemblence to people living or desceased is purely coincidental";
		this.driver.get(contactPage.URL);
	
	assertTrue(contactPage.checkFooter().contains(footer));
}
}
