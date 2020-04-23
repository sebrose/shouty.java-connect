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

}
