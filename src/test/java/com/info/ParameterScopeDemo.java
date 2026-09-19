package com.info;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterScopeDemo {

	// 1. Catches Test Level Parameters
	@Parameters({ "testUser" })
	@Test
	public void testLevelRun(String username) {
		System.out.println("[Test Level] Processing: " + username);
	}

	// 2. Catches Suite Level Parameters
	@Parameters({ "suiteEnvironment" })
	@Test
	public void suiteLevelRun(String environment) {
		System.out.println("[Suite Level] Executing on Environment: " + environment);
	}

	// 3. Catches Class Level Parameters
	@Parameters({ "classConfig" })
	@Test
	public void classLevelRun(String config) {
		System.out.println("[Class Level] Loaded Config Strategy: " + config);
	}

	// 4. Catches Method Level Parameters
	@Parameters({ "methodSpecificToken" })
	@Test
	public void methodLevelRun(String token) {
		System.out.println("[Method Level] Operational Token Key: " + token);
	}
}
