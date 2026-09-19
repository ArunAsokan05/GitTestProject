package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {

	@Test(priority=-5)
	public void login() {
		System.out.println("Login");

	}

	@Test(dependsOnMethods = "login")
	public void searchProduct() {

		System.out.println("SearchProduct");

	}

	@Test(dependsOnMethods ="searchProduct")
	public void addToCart() {

		System.out.println("Add To Cart");

	}

	@Test(dependsOnMethods = "addToCart")
	public void payment() {

		System.out.println("Payment");

	}

}
