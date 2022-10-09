package com.qa.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/com/qa/features",glue ="com/qa/stepDefinitions"
,monochrome=true , plugin= {"pretty","html:target/Pom.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunnertestng extends AbstractTestNGCucumberTests{


}
