package com.todo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public static WebDriver driver;
	public static Properties prop;

	public BasePage() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/com/todo/config/config.properties");
		prop.load(fis);

	}

	public static void initialization(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	}

}
