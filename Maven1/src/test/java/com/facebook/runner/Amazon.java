package com.facebook.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\eclipse_workspace\\Maven1\\src\\test\\java\\com\\facebook\\feature\\abc.feature",
glue = "com.facebook.stepdefinition" )
public class Amazon {

}
