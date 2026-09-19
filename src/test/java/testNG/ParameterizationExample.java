package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	 @Parameters({ "userName" })
	    @Test
	public void printName(String name) {
		System.out.println("Name is " + name);

	}



}