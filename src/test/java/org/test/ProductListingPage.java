package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListingPage  extends BaseClass{
	
	@FindBy(xpath="(//a[text()='Add'])[1]")
	private WebElement productName;
	

	public void addProductitoCart() {
		
		
	}
	
	

}
