package shouty;

import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static java.util.Collections.emptyList;
import static org.junit.Assert.*;


public class ShoutSteps {
    private final ShoutyServiceWrapper shouty;
    private List<Shout> shouts;

    public ShoutSteps(ShoutyServiceWrapper shouty_){
        shouty = shouty_;
    }

    @Given("{word} is at {int}, {int}")
    public void person_is_at(String person, Integer x, Integer y) {
    }

    @When("{word} shouts")
    public void person_shouts(String shouter) {
    }

    @Then("{word} should hear {word}")
    public void listener_should_hear_shouter(String listener, String shouter) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
