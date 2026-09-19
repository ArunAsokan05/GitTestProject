package org.sample;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

	@Test
	public void test1() {
		System.out.println("Start");

		Assert.assertTrue("verify username", true);
		Assert.assertTrue("verify password", false);
		Assert.assertTrue("verify login", true);
		System.out.println("...End...");
	}

	@Test
	public void test2() {
		System.out.println("Test2");

	}

	@Test
	public void test3() {
		System.out.println("Test3");

	}

}
