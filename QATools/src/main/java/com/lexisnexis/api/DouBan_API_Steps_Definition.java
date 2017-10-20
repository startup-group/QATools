package com.lexisnexis.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class DouBan_API_Steps_Definition extends CucumberRunner{

    @Given("^book id$")
    public void setp1() throws Throwable {
    	System.out.println("given 123");;
    }

    @When("^request book api with book id (\\d+)$")
    public void setp2(String text) throws Throwable {
    	System.setProperty("webdriver.gecko.driver", "res//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	
    	driver.get("http://baidu.com");
    	driver.findElement(By.id("kw")).sendKeys("this is a test phrase");
    	driver.findElement(By.id("su")).click();
    	System.out.println(driver.getTitle());
    }

    @Then("^get the book information$")
    public void setp3() throws Throwable {
    	System.out.println("then 123");;
    }
}