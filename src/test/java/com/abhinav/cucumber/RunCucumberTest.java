package com.abhinav.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},glue="com.abhinav.cucumber.stepdefinitions",features = "classpath:features/")
public class RunCucumberTest {
}
