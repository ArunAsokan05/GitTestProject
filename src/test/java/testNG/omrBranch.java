package testNG;

import org.testng.annotations.Test;

public class omrBranch {
	//priority for order execution
	@Test    (priority=0)
	public void userName() {
		System.out.println("Enter the Username");
	}
	//enable to skip testcase
	@Test   (priority=1,enabled = false)
	public void password() {
		System.out.println("Enter the Pasword");
	}
	@Test  (priority=2)
	public void loginBtn() {
		System.out.println("Click the Login Button");
	}

}
