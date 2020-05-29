package com.pages;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.TestBase;

public class HomePage extends TestBase {
public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

public void search() throws InterruptedException {
	Thread.sleep(100);
	
	driver.findElement(By.xpath("//input[@class='search-input geo_autocomplete']")).sendKeys("London");
	driver.findElement(By.xpath("//button[@id=\"search-submit\"]")).click();
	
}
public void click() {
	driver.findElement(By.xpath("//button[text()='Save my preferences']")).click();
}
public void sorting() throws InterruptedException {
	List<WebElement> list=driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
	int size=list.size();
	System.out.println(size);
	Iterator<WebElement> itr=list.iterator();
	List<String> lt=new ArrayList<String>();
	while(itr.hasNext()) {
		System.out.println(itr.next().getText());
		String element=itr.next().getText();
		element=element.replaceAll(" ", "");
		element=element.replaceAll("[^0-9]", "");
		element=element.replaceAll("£", "");
		lt.add(element);
		
	}
	Collections.sort(lt);
	
	System.out.println("Inside list"+lt);
	System.out.println("5th element: "+lt.get(5));
	String number=lt.get(5);
	 NumberFormat myFormat = NumberFormat.getInstance();
     myFormat.setGroupingUsed(true);
     int inter=Integer.parseInt(number);
    System.out.println(myFormat.format(inter));
	String forma=myFormat.format(inter);
	driver.findElement(By.xpath("//a[contains(text(),' £"+forma+"')]")).click();
	driver.findElement(By.xpath("(//div[@class='ui-agent__logo'])[1]")).click();
	Thread.sleep(10);
	if(driver.findElement(By.xpath("//a[contains(text(),' £"+forma+"')]")).isDisplayed()){
		System.out.println("same property");
	}
	else
		System.out.println("mismatch");
	
}

private WebElement get(int i) {
	// TODO Auto-generated method stub
	return null;
}

}
