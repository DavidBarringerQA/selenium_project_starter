package com.qa.testing;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.pages.SearchPage;

public class SearchTest {

	private WebDriver driver;

	@Before
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();

	}

	@Test
	public void testSearchPage() throws InterruptedException {

		String testString = "hello";

		SearchPage search = PageFactory.initElements(driver, SearchPage.class);

		this.driver.get(search.URL);

		search.search(testString);

	
	}
	
	@Test
	public void testFooter() throws InterruptedException  {
		SearchPage search = PageFactory.initElements(driver, SearchPage.class);
				
		String footer = "© Team 1 2021, This work is fictional any resemblence to people living or desceased is purely coincidental";

		this.driver.get(search.URL);
		
		assertTrue(search.checkFooter().contains(footer));
	
	}

	@After
	public void tearDown() {
		this.driver.quit();

}
}