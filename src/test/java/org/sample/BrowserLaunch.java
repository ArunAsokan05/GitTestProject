package org.sample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	static WebDriver driver;

	@BeforeClass

	public static void beforeClass() {

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Before

	public void beforeMethod() throws IOException {

		System.out.println("We enter into testcase");
	}

	@Test

	public void login() {

		WebElement txtname = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));

		txtname.sendKeys("9943008763");
		System.out.println("Enter The Mobile Number");

		String name = txtname.getDomProperty("value");

		Assert.assertEquals("Verify username", "9943008763", name);

		WebElement txtPassword = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
		txtPassword.sendKeys("Demonking05");
		System.out.println("Enter The Password");

		String pass = txtPassword.getDomProperty("value");

		Assert.assertEquals("Verify password", "Demonking05", pass);

		WebElement btn = driver.findElement(By.xpath("//span[text()='Log in']"));
		btn.click();
		System.out.println("Click The Login Button");

		WebElement  element = driver.findElement(By.xpath("//span[contains(text(),'The password')]"));

		String text = element.getText();
		System.out.println(text);

		boolean contains = text.contains("");

		Assert.assertTrue("Verify after login", contains);
		System.out.println("true");
		

	}

	@After

	public void afterMethod() throws IOException {

		System.out.println("We exit from testcase");

	}

	@AfterClass

	public static void afterClass() {

		//driver.quit();

	}

}
