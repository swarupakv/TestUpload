package com.basicsConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Swarupa\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println("URL of current page is: " +driver.getCurrentUrl());
		System.out.println("Title of current page is " + driver.getTitle());
		Thread.sleep(5000);
		//System.out.println("Page Source of current page is " + driver.getPageSource());
		driver.close();
	}

}

//URL of current page is: https://www.flipkart.com/womens-footwear/pr?sid=osp%2Ciko&offer=nb%3Amp%3A086cabdc21%2Cnb%3Amp%3A08f5070621&fm=neo%2Fmerchandising&iid=M_13775271-46d6-4708-80d9-9a289e9c8a83_3.DR05QB17BIS8&ssid=8dkfxrgdz40000001600783545789&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_5_3.dealCard.OMU_DR05QB17BIS8_2&otracker1=hp_omu_SECTIONED_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_dealCard_cc_5_NA_view-all_2&cid=DR05QB17BIS8
//Title of current page is Shoes For Women - Buy Ladies Shoes, Women's Footwear Online At Best Prices in India - Flipkart.com


