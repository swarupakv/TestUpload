package com.basicsConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Swarupa\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		System.out.println("Title of main page is " + driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("Title after refresh page is " + driver.getTitle());
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		Thread.sleep(3000);
		System.out.println("Title after get page is " + driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Title of back page is " + driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("Title of forward page is " + driver.getTitle());
		driver.close();
	}
}

