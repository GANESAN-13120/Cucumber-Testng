package com.Runner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Samplefeature.feature",glue = "com.stepdefinitions"
,tags="~@Google,@Yahoo",monochrome=true,dryrun=true,strict=true)

public class Runner_Class {  
	
} 
  