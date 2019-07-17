package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C://Users//Gnanadhir//Ruby//FreeCRMBDD//src//main//java//com//features//login.feature",
		glue={"com.stepDefinition"},
		format={"pretty","html:test-outout"}
		)
public class TestRunner {

}
