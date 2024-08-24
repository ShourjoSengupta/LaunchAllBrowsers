package com.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeBrowser {

//	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\SeleniumPractice\\Launch AllBrowser\\ChromeDriverJars\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.leafground.com/pages/Dropdown.html");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
//		driver.quit();
		WebDriver driver;
		@Test(priority =1)
		public void ChromeBrowserLaunch() throws Exception{
			System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.hollandandbarrett.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.quit();
		}
		@Test(priority =2)
		public void FirefoxBrowserLaunch() throws Exception{
			System.setProperty("webdriver.gecko.driver", "./FirefoxDriverJars/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.hollandandbarrett.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.quit();
		}
		@Test(priority =3)
		public void EdgeLaunch() throws Exception{
			System.setProperty("webdriver.edge.driver", "./EdgeDriverJars/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.hollandandbarrett.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.quit();
		}
		

//	}

}
