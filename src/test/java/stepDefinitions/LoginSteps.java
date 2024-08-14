package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user lands on the automation exercise signup or login page")
	public void user_lands_on_the_automation_exercise_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given code");
	}
	@When("^user enters email (.+) and password (.+)$")
	public void user_enters_email_and_password(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("email " + email +" and password entered is " + password );
	}
	
	@When("user enters name {string} and email {string}")
	public void user_enter_name_and_email(String name, String email) {
		
		System.out.println("New user " + name + " and email is " + email);
	}
	
	@When("user clicks on signup button")
	public void signup_button() {
		
		System.out.println("User clicks the signup button");
	}
	
	@Then("user is navigated to registration page")
	public void registration_page() {
		
		System.out.println("User is landed in registration page");
	}
	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("login button clicked");
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Navigated to home page");
	}
	
	@When("user enters registration details")
	public void registration_details(List<String> data) {
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		System.out.println(data.get(4));
	}
	
	@When("user clicks on create account button")
	public void create_account() {
		
		System.out.println("User successfully created an account");
	}
	
	@Given("Database is setup for testing")
	public void setup_for_testing() {
		
		System.out.println("************************************************");
		System.out.println("Setup compeleted for testing");
	}
	
	@When("user enter the capabilities of the system")
	public void system_capabilities() {
		
		System.out.println("Capabilities are entered");
	}
	
	@When("launches the given url")
	public void url_launch() {
		
		System.out.println("The url is launched");
	}

}
