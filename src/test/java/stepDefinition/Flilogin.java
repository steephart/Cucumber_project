package stepDefinition;

import com.base.one.Base;
import com.fli.pageexe.Flipageexe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flilogin extends Flipageexe {
	
	@Given("Enter the url")
	public void enter_the_url() {
	  Base.url("https://www.flipkart.com/");
	}
	@Given("close the popup")
	public void close_the_popup() {
	  close();
	}
	@When("move to electronics")
	public void move_to_electronics() {
	  electronics();
	}
	@When("move to Laptop and Desktops")
	public void move_to_laptop_and_desktops() {
	  laptop();
	}
	@Then("validate the laptop")
	public void validate_the_laptop() {
	   System.out.println("laptops");
	}



}
