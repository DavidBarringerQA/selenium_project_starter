package com.qa.test.pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class IndexPage {
		
		public final String url ="http://127.0.0.1:5500/webProject/index.html";
		
		@FindBy(xpath="/html/body/header/div/a[1]")
		private WebElement homeButton;
		
		@FindBy(xpath="/html/body/header/div/a[3]")
		private WebElement searchButton;
		
		@FindBy(xpath="/html/body/header/div/a[2]")
		private WebElement productsButton;
		
		@FindBy(xpath="/html/body/header/div/a[4]")
		private WebElement contactButton;
		
		@FindBy(xpath="/html/body/h1[1]")
		private WebElement title;
		
		@FindBy(xpath="/html/body/footer/small")
		private WebElement footer;
		
		public void clickHome() {
			homeButton.click();
		}
		
		public void clickSearch() {
			searchButton.click();
		}
		
		public void clickProduct() {
			productsButton.click();
		}
		
		public void clickContact() {
			contactButton.click();
		}
	
		public String getTitle() {
		return title.getText();
	
	}
		public String checkFooter() {
			return footer.getText();
		}
	}

