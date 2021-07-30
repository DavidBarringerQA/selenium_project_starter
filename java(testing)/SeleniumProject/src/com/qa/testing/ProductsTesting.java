package com.qa.testing;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;


import com.qa.test.pages.ProductsPage;


public class ProductsTesting {

	private WebDriver driver;

	@Before
	public void setup() {
		
		ChromeOptions options = new ChromeOptions(); options.setHeadless(true);
		 
		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();

	}


	@Test
	public void testCasino() throws InterruptedException {

		ProductsPage products = PageFactory.initElements(driver, ProductsPage.class);

		String casino = "casino rye ale";

		this.driver.get(products.URL);

		products.casinoProduct();

		assertTrue(products.checkCasino().contains(casino));

	}

	@Test
	public void testMisspent() throws InterruptedException {

		ProductsPage products = PageFactory.initElements(driver, ProductsPage.class);

		String misspent = "misspent youth";
		
		this.driver.get(products.URL);

		products.misspentProduct();

		assertTrue(products.checkMisspent().contains(misspent));
	}
	
	@Test
	public void testManic() throws InterruptedException {

		ProductsPage products = PageFactory.initElements(driver, ProductsPage.class);

		String manic = "manic mango";
		
		this.driver.get(products.URL);

		products.manicProduct();

		assertTrue(products.checkManic().contains(manic));
	}

	@Test
	public void testMashtag() throws InterruptedException {

		ProductsPage products = PageFactory.initElements(driver, ProductsPage.class);

		String mashtag = "#mashtag 2015";
		
		this.driver.get(products.URL);

		products.mashProduct();

		assertTrue(products.checkMash().contains(mashtag));
	}
	@Test
	public void testFooter() throws InterruptedException {
		ProductsPage products = PageFactory.initElements(driver, ProductsPage.class);

		
		String footer = "© Team 1 2021, This work is fictional any resemblence to people living or desceased is purely coincidental";
		this.driver.get(products.URL);
	
		assertTrue(products.checkFooter().contains(footer));
	}
	
	

	@After
	public void tearDown() {
		this.driver.quit();
	}
}
