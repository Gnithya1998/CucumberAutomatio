package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookSteps {
	
	@Before("@loginDataBase")
	public void loginData() {
		
		System.out.println("******************************");
		System.out.println("User connected with login data base");
	}
	
	@Before("@signUpDataBase")
	public void signUpData() {
		
		System.out.println("******************************");
		System.out.println("User connected with signup data base");
	}
	
	@After
	public void tearDown() {
		
		System.out.println("clearing the setup");
	}

}
