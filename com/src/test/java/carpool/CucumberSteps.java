package carpool;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase{
	
	Ride r = new Ride();
	
	String actionButton;
	
	@Given("^employee \"([^\"]*)\" enter details like \"([^\"]*)\" as source, \"([^\"]*)\" as destination and time is \"([^\"]*)\"$")
	public void InputData(String name, String source, String destination, String time) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		r.setName(name);
		r.setSource(source);
		r.setDestination(destination);
		r.setTime(time);
		
	    //throw new PendingException();
	    
	    
	}

	@Given("^his email is \"([^\"]*)\" and phone is \"([^\"]*)\"$")
	public void MoreInputData(String email, String phone) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		r.setPhone(phone);
		r.setEmail(email);
	}

	@When("^click on \"([^\"]*)\"$")
	public void UserAction(String actionbutton) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		this.actionButton = actionbutton;
	}

	@Then("^data get saved and message \"([^\"]*)\" get dispplayed with \"([^\"]*)\" button$")
	public void expectedResult(String message, String buttonName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		RideBLL rideBll = new RideBLL();
		assertEquals(message,rideBll.SaveRide(r));
		
	}

	@Then("^clicking on \"([^\"]*)\" will take him to \"([^\"]*)\" page\\.$")
	public void moreExpectedResult(String buttonName, String pageName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		this.actionButton = buttonName;
	}

	
}
