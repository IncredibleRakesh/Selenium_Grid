package Selenium_Grid.Selenium_Grid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test_Grid {

	public RemoteWebDriver driver;
	
	@Test
	public void Test1() {
		String url1="https://www.cognizant.com/";
		System.out.println("Test 1 With Chrome Started....");
		String Node = "http://localhost:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		try {
			driver = new RemoteWebDriver(new URL(Node), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get(url1);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test 1 With Chrome Endeded....");
		driver.quit();
	}

	@Test
	public void Test2() {
		String url2 = "https://www.facebook.com/";
		System.out.println("Test 2 With Chrome Started....");
		String Node = "http://localhost:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		try {
			driver = new RemoteWebDriver(new URL(Node), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get(url2);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test 2 With Chrome Endeded....");
		driver.quit();
	}
	@Test
	public void Test3() {
		String url3 = "https://twitter.com/";
		System.out.println("Test 3 With Chrome Started....");
		String Node = "http://localhost:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome"); 
		try {
			driver = new RemoteWebDriver(new URL(Node), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get(url3);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test 3 With Chrome Endeded....");
		driver.quit();
	}
}
