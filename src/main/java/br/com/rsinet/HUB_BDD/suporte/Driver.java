package br.com.rsinet.HUB_BDD.suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	static WebDriver driver;

	private Driver() {

	}

	public static WebDriver createChrome() {
		if (driver == null) {

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://advantageonlineshopping.com/");
		}
		return driver;

	}

	public static void fecharDriver() {
		if (driver != null)
			driver.quit();
		driver = null;
	}
}
