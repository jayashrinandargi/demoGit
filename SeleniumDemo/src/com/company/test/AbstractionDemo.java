package com.company.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstractionDemo {
	
	WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//create object of the class using new operator.
		//Abstraction
		
		AbstractionDemo abstractdemo= new AbstractionDemo();
		abstractdemo.login();	
		abstractdemo.goToAdminTab();
		abstractdemo.selectUserRole();
		abstractdemo.SearchButton();
		
	
	System.out.println("Login is sucessful");
	  
	//abstractdemo.logout();
	

	}
	
	
	
	public void login() {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\OneDrive\\Documents\\SeleniumJavaProjects\\workspace\\SeleniumDemo\\src\\driver\\chromedriver.exe");
		
	 driver= new ChromeDriver();
	
	
	driver.manage().window().maximize();  //maximize browser.
		
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		System.out.println("Css Selector worked perferctly fine.");
		
		
		
	}

	public void logout() {
		
		driver.findElement(By.linkText("Welcome Paul")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		System.out.println("Logout is suecssful.");
		
		
		
	}
	
	public void goToAdminTab() {
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//Xpath //b[text()='Admin']
		
	}
	
	public void selectUserRole() {
		
		//handling dropdowns
		Select dropdown= new Select(driver.findElement(By.id("searchSystemUser_userType")));
		
		//dropdown.selectByVisibleText("ESS");
		dropdown.selectByIndex(2);
		
		
	}
	
	public void SearchButton() {
		
		driver.findElement(By.id("searchBtn")).click();
		
	}
	
}




