package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public File file=new File("C:\\Users\\Muthukumar\\Downloads\\Test_chromedriver\\chrome\\chromedriver.exe");
	
	public TestBase() throws IOException{
	//prop=new Properties();
	
	try {
		prop=new Properties();
		FileInputStream fs;
		fs = new FileInputStream("C:\\Users\\Muthukumar\\eclipse-workspace\\SampleBDD\\src\\main\\java\\com\\config\\configuration.properties");
		prop.load(fs);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	public void Initialization() {
		//log.info("Entering application");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\Downloads\\Test_chromedriver\\chrome\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	//driver.get("https://www.selenium.dev/downloads/");
	driver.manage().timeouts().pageLoadTimeout(12000,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
}
