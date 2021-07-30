package com.qa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SearchPage {
	
	
	public final String URL = "http://127.0.0.1:5500/webProject/html/search.html";
	
	

	@FindBy(id = "search-button") 
	private WebElement searchButton;
	 
	@FindBy(xpath = "/html/body/form/input")
	public WebElement searchList;
	
	@FindBy(xpath = "/html/body/footer/div[2]")
	public WebElement footer;
	
	@FindBy(xpath = "/html/body/header/div/a[1]")
	public WebElement homeButton;
	
	@FindBy(xpath = "/html/body/footer/div[1]/ul/li[1]/a")
	public WebElement facebook;
	
	@FindBy(xpath = "/html/body/footer/div[1]/ul/li[2]/a")
	public WebElement twitter;
	
	@FindBy(xpath = "/html/body/footer/div[1]/ul/li[3]/a")
	public WebElement youtube;
	
	@FindBy(xpath = "/html/body/footer/div[1]/ul/li[4]/a")
	public WebElement instagram;
	
	public String checkFooter() {
		return footer.getText();
	}
	
	
	public void search(String searchTerm) {
		searchList.sendKeys(searchTerm);
		searchButton.click();
	}
	
	public void goBackHome() {
		homeButton.click();
	}

	public void goFacebook() {
		facebook.click();
	}
	
	public void goTwitter() {
		twitter.click();
			
		}
	public void goYoutube() {
		youtube.click();
	}

	public void goInstagram() {
		instagram.click();
	}
	
	}

	
	