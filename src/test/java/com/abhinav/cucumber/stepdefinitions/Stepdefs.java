package com.abhinav.cucumber.stepdefinitions;

import com.abhinav.cucumber.Person;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

    Person lucy=new Person();
    Person sean=new Person();

    String messageShouted;

    @Given("^(?:\\w+) is at a distance of (\\d+)m from (?:\\w+)$")
    public void lucy_is_at_a_distance_of_m_from_Sean(Integer distance) {
        sean.setDistance(0);
        lucy.setDistance(distance);
    }

    @When("^(?:\\w+) shouts (.+)$")
    public void sean_shouts(String message) {
       sean.shout(message);
       messageShouted=message;
    }

    @Then("^(?:\\w+) hears the shouted message$")
    public void lucy_hears_the_same_message() {
        Assert.assertEquals(messageShouted,lucy.getLastMessageHeard(sean));
    }

    @Then("^(?:\\w+) cannot hear anything$")
    public void lucy_cannot_hear_anything() {
        Assert.assertNull(lucy.getLastMessageHeard(sean));
    }

}
