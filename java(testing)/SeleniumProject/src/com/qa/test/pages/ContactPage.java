package com.qa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	public final String URL = "http://127.0.0.1:5500/webProject/html/contact.html";

	@FindBy(xpath = "/html/body/header/div/a[4]")
	private WebElement contactButton;

	@FindBy(xpath = "/html/body/h1")
	public WebElement contactHeader;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "fullname")
	public WebElement name;

	@FindBy(id = "issuetitle")
	public WebElement issue;

	@FindBy(id = "issuedesc")
	public WebElement desc;

	@FindBy(id = "submitBtn")
	public WebElement submitBtn;
	
	@FindBy(xpath = "/html/body/footer/div[2]")
	public WebElement footer;

	@FindBy(xpath = "/html/body/div/p[1]")
	public WebElement emailEntry;

	public void contactButton() {
		contactButton.click();
	}

	public String checkFooter() {
		return footer.getText();
	}

	public String checkContact() {
		return contactHeader.getText().toLowerCase();

	}

	public void enterContactInfo(String emailText, String fullnameText, String issuetitleText, String issudescText) {
		email.sendKeys(emailText);
		name.sendKeys(fullnameText);
		issue.sendKeys(issuetitleText);
		desc.sendKeys(issudescText);
		submitBtn.click();

	}

	public String checkEmailEntry() {
		return emailEntry.getText();
	}

}
