package org.sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
	@Test
	public void getResult() {

		Result res = JUnitCore.runClasses(Login.class, Logout.class);

		System.out.println("Run Count:" + res.getRunCount());
		System.out.println("Ignore Count:" + res.getIgnoreCount());
		System.out.println("Failure Count:" + res.getFailureCount());

		int passCount = res.getRunCount() - res.getFailureCount();
		System.out.println("Pass Count:" + passCount);

		System.out.println("Runtime in millis:" + res.getRunTime());

		List<Failure> failures = res.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}

		System.out.println(res.wasSuccessful());

	}

}



