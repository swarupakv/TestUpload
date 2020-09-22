package com.basicsConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands 
{
	static WebDriver driver;
	
public static void launchApplication()
{
	System.setProperty("webdriver.chrome.driver","F:\\Swarupa\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	driver.navigate().to("https://www.flipkart.com/");
}

public static void closeBrowser()
{
	driver.close();
}

	public static void main(String[] args) throws InterruptedException
	{
		launchApplication();
		
		WebElement captureText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/p/span"));
		System.out.println(captureText.getText());
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		System.out.println(username.getTagName());
		username.sendKeys("test1");
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("XXXXXXXX");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.sendKeys("XXXXXXXX");
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		loginButton.click();
		System.out.println(loginButton.getTagName());
		Thread.sleep(1000);
		closeBrowser();
	}
}

/*
Get access to your Orders, Wishlist and Recommendations
input
button
 */
