package com.lexisnexis.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true, monochrome = true, features = "/lexisnexis/src/main/features", 
glue = "testcase", 
plugin = {"pretty", "html:target/cucumber-html-report;","json:target/cucumber.json" }, 
tags = { "@TestngScenario" })
public class CucumberRunner extends AbstractTestNGCucumberTests {
    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        System.out.println("before suite text");
    }

    @AfterSuite(alwaysRun = true)
    public void quit() throws InterruptedException {
        System.out.println("after suite text");
    }
}