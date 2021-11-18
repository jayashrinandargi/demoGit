package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//headless testing
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		
		//chromeOptions.setHeadless(true);
		
				
		//WebDriver driver= new ChromeDriver(chromeOptions);
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize browser.
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.getTitle(); //title of  the page
		
		System.out.println("Webpage loaded sucessfully");
		
		System.out.println("Title is  " +driver.getTitle());
		
		
		//driver.close();
		
		
		
		
		//Xpath For Login  //tagname[attribute='value']/abc/xyz
		
		
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	//	driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		//Elements using CSSSelector
		
		//id= #
		//Class . operator
		
		//driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		//driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input.button")).click();
		//System.out.println("Css Selector worked perferctly fine.");
		
		//abstraction is a process of hiding the implementation details from the user.
		
		
		

	}

}
