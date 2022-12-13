package testNG;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.internal.Systematiser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngtask {
	@Test
	private void ngtest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Thineshkamal34");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("THINESH34");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		WebElement selectloc = driver.findElement(By.name("location"));
		Select s = new Select(selectloc);
		s.selectByValue("New York");
		WebElement selecthotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(selecthotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement selectroom = driver.findElement(By.id("room_type"));
		Select s2 = new Select(selectroom);
		s2.selectByVisibleText("Double");
		WebElement selectnum = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(selectnum);
		s3.selectByIndex(3);
		WebElement selectdatein = driver.findElement(By.name("datepick_in"));
		selectdatein.sendKeys("11/10/2022");
		WebElement selectdateout = driver.findElement(By.name("datepick_out"));
		selectdateout.sendKeys("13/10/2022");
		WebElement Adults  = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(Adults);
		s4.selectByIndex(2);
		WebElement Children   = driver.findElement(By.id("child_room"));
		Select s5 = new Select(Children );
		s5.selectByValue("0");
		WebElement btnsearch = driver.findElement(By.name("Submit"));
		btnsearch.click();
		

	}

	@Test
	public void sample() {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.adactin.com/HotelApp/");
	}

	
	
	@Test
	private void sample2() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println("11");
		System.out.println("12");
	}
	public void demo() {
        System.out.println("i");
        System.out.println("l");
        System.out.println("o");
        System.out.println("v");
        System.out.println("e");
        
	}


}
