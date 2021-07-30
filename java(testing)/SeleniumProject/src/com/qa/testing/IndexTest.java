
package com.qa.testing;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.pages.ContactPage;
import com.qa.test.pages.IndexPage;
import com.qa.test.pages.ProductsPage;
import com.qa.test.pages.SearchPage;

public class IndexTest {

	private WebDriver driver;

	@Before
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();

	}

	@Test
	public void HomeButtonTest() throws InterruptedException {
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

		String home = "Welcome to FrementCat Brewery";

		this.driver.get(searchPage.URL);

		searchPage.goBackHome();
		this.driver.get(indexPage.url);

		assertTrue(indexPage.getTitle().contains(home));
	}

	@Test
	public void SearchButtonTest() throws InterruptedException {

		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);

		this.driver.get(indexPage.url);

		indexPage.clickSearch();

	}

	@Test
	public void ProductButtonTest() throws InterruptedException {

		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		ProductsPage productPage = PageFactory.initElements(driver, ProductsPage.class);

		String products = "Products";

		this.driver.get(indexPage.url);

		indexPage.clickProduct();

		assertTrue(productPage.getTitle().contains(products));

	}

	@Test
	public void ContactButtonTest() throws InterruptedException {

		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);

		String contact = "contact";
		this.driver.get(indexPage.url);
		
		contactPage.contactButton();
			
		this.driver.get(contactPage.URL);

	

		assertTrue(contactPage.checkContact().contains(contact));
	}

	@After
	public void teardown() {
		this.driver.quit();
	}

}