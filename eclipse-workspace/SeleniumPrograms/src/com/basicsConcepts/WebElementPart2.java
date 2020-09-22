package com.basicsConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPart2 {
	static WebDriver driver;
	
	public static void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Swarupa\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("http://omayo.blogspot.com/");
	}

	public static void closeBrowser()
	{
		driver.close();
	}

		public static void main(String[] args) throws InterruptedException
		{
			launchApplication();
			
			WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
			if(checkbox1.isSelected())
			{
				System.out.println("Checkbox is selected");
			}
			else
			{
				System.out.println("Checkbox is not selected");
			}
			
			WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
			if(checkbox2.isSelected())
			{
				System.out.println("Checkbox is selected");
			}
			else
			{
				System.out.println("Checkbox is not selected");
			}
			System.out.println("--------------------------------------------------------------------");
			
			
			WebElement textArea = driver.findElement(By.id("HTML11"));
			if(textArea.isDisplayed())
			{
				System.out.println("TextArea is displayed");	
			}
			else
			{
				System.out.println("TextArea is not selected");
			}
			System.out.println("--------------------------------------------------------------------");
			
			
			WebElement enabledButton1 = driver.findElement(By.id("but2"));
			if(enabledButton1.isEnabled())
			{
				System.out.println("Button is enabled");
			}
			else
			{
				System.out.println("Button is not enabled");
			}
			
			WebElement enabledButton2 = driver.findElement(By.id("but1"));
			if(enabledButton2.isEnabled())
			{
				System.out.println("Button is enabled");
			}
			else
			{
				System.out.println("Button is not enabled");
			}
			System.out.println("--------------------------------------------------------------------");
			
			
			closeBrowser();
		}
	}


/*
Checkbox is selected
Checkbox is not selected
--------------------------------------------------------------------
TextArea is selected
--------------------------------------------------------------------
Button is enabled
Button is not enabled
--------------------------------------------------------------------
 */
