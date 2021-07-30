package com.qa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {

	public final String URL = "http://127.0.0.1:5500/webProject/html/products.html";

	@FindBy(xpath = "/html/body/ul/li[1]/a")
	public WebElement casino;

	@FindBy(xpath = "/html/body/h1")
	public WebElement casinoHeader;

	@FindBy(xpath = "/html/body/ul/li[2]/a")
	public WebElement misspent;

	@FindBy(xpath = "/html/body/h1")
	public WebElement misspentHeader;

	@FindBy(xpath = "/html/body/ul/li[3]/a")
	public WebElement manic;

	@FindBy(xpath = "/html/body/h1")
	public WebElement manicHeader;

	@FindBy(xpath = "/html/body/ul/li[4]/a")
	public WebElement mashtag;

	@FindBy(xpath = "/html/body/h1")
	public WebElement mashtagHeader;
	
	@FindBy(xpath="/html/body/h1")
	private WebElement title;
	
	@FindBy(xpath="/html/body/footer/div[2]")
	private WebElement footer;

	public void casinoProduct() {

		casino.click();

	}
	
	public String checkFooter() {
		return footer.getText();
	}

	public void misspentProduct() {
		misspent.click();
	}

	public void manicProduct() {
		manic.click();
	}

	public void mashProduct() {
		mashtag.click();
	}
	
	public String getTitle() {
		return title.getText();
		

	}

	public String checkCasino() {
		return casinoHeader.getText().toLowerCase();

	}

	public String checkMisspent() {
		return misspentHeader.getText().toLowerCase();
	}

	public String checkManic() {
		return manicHeader.getText().toLowerCase();
	}

	public String checkMash() {
		return mashtagHeader.getText().toLowerCase();
	}
}