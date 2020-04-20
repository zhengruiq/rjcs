package Selenium.FoxDr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdr {
	
	public int Fweb() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\tools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "E:/CloudMusic/火狐/firefox.exe");
		//System.setProperty("webdriver.firefox.bin", "E:\\tools\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		driver.manage().window().maximize();
		WebElement txtbox=driver.findElement(By.name("wd"));
		txtbox.sendKeys("WebDriver");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		WebElement btn=driver.findElement(By.id("su"));
		btn.click();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		 List<WebElement> buttons = driver.findElements(By.tagName("a"));

         System.out.println(buttons.size());  //打印出a标签的个数
         return buttons.size();

//		WebElement searchBox =  driver.findElement(By.className("buttonStyle"));
//	   searchBox.sendKeys("Hello, wenhua");
		// driver.quit();
//		btn.click();
//		driver.close();
		/*
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https:/www.baidu.com/");
		System.out.println("hello page title:"+driver.getTitle());
		
//		WebElement element =driver.findElement(By.id(""));
//		 element.sendKeys("soft Testing");
//		 element.submit();
//		 Thread.sleep(10000);
//		 driver.quit();
		*/
	
	
	}

	

}
