package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass{
	

		@FindBy(id = "email")

		private WebElement txtEmailId;



		@FindBy(id = "pass")

		private WebElement txtPassword;



		@FindBy(xpath = "//button[@value='login']")

		private WebElement btnLogin;



		public WebElement getTxtEmailId() {
			return txtEmailId;
		}



		public WebElement getTxtPassword() {
			return txtPassword;
		}



		public WebElement getBtnLogin() {
			return btnLogin;
		}
		public void login(String emailid,String password) {
			
			

				sendKeysElement(txtEmailId, emailid);

				sendKeysElement(txtPassword, password);

				clickElement(btnLogin);

		}
		

}
