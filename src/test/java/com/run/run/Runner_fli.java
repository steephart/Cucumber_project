package com.run.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\alexs\\eclipse-workspace\\Cucumber_project\\src\\"
		+ "test\\java\\com\\fli\\feature\\flipkart.feature",glue="stepDefinition",dryRun=false,monochrome=true,publish=true,tags="@laptop")
public class Runner_fli {

}
