package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchPage extends BaseClass{
@FindBy(id="search")
private WebElement txtsearchBox;

public WebElement getTxtsearchBox() {
	return txtsearchBox;
}

private void searchProductName(String ProductName) {
	sendKeysElement(txtsearchBox, ProductName);

}
}
