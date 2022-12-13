package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newparameters {
	@Parameters({"username","password"})
	@Test
	public void gamil(@Optional("kamal@gamil.com") String s1 , String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s1);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(s2);
	}
	
	
}
