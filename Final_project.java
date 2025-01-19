package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Final_project {

	public static void main(String[] args) throws InterruptedException {
	//TODO Auto-generated method stub

	System.setProperty("Webdriver.chrome", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();

	// Navigate to the Home page

			String originalTab = Driver.getWindowHandle();

			Driver.get("https://compendiumdev.co.uk/");

			Thread.sleep(1000);		

			

			//***********  First Hyperlink  ************
			Driver.findElement(By.xpath("/html/body/div[1]/main/article/div[1]/div/ul/li[1]/a")).click();
			Thread.sleep(1000);	
			//Redirect to the home page
			Driver.get("https://compendiumdev.co.uk/");
			Driver.switchTo().window(originalTab);
		 	Thread.sleep(2000);
 			

		 	//************ Second Hyperlink ************

		 	Driver.findElement(By.xpath("/html/body/div[1]/main/article/div[1]/div/ul/li[2]/a")).click();
		 	Thread.sleep(1000);	
			//Redirect to the home page
			Driver.get("https://compendiumdev.co.uk/");
			Driver.switchTo().window(originalTab); 
		 	Thread.sleep(2000);

		 	//Published Book - Dear Devil Tester
 			Driver.findElement(By.xpath("/html/body/div[1]/main/article/div[2]/a[2]/img")).click();
			Thread.sleep(1000);	

			//Redirect to the home page
			Driver.get("https://compendiumdev.co.uk/");

			Driver.switchTo().window(originalTab);
		 	Thread.sleep(2000);

		 	//Online Training - Selenium Webdrive with java
			Driver.findElement(By.xpath("/html/body/div[1]/main/article/div[4]/a[1]/img")).click();
			Thread.sleep(1000);	

			//Redirect to the home page
			Driver.get("https://compendiumdev.co.uk/");
 			Driver.switchTo().window(originalTab);
		 	Thread.sleep(2000);
		 	
		 	// Featured Application Portifolio - Chatterscan.com
		 	Driver.findElement(By.xpath("/html/body/div[1]/main/article/ul[1]/li[1]/a")).click();
		 	Thread.sleep(1000);	

		 	//Redirect to the home page
		 	Driver.get("https://compendiumdev.co.uk/");
		 	Driver.switchTo().window(originalTab);
		 	Thread.sleep(2000);

		 	//More digital marketing tool 
		 	Driver.findElement(By.xpath("/html/body/div[1]/main/article/ul[2]/li[1]/p/a")).click();
		 	Thread.sleep(1000);	

			//Redirect to the home page
			Driver.get("https://compendiumdev.co.uk/");
  			Driver.switchTo().window(originalTab);
		 	Thread.sleep(3000);
		 	
		 	
		 	/*************** Nav menu *************/

		 	/***************** Hover effect ******************/

			// About
			Thread.sleep(1000);
			WebElement ele1 = Driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a"));
			Actions action1 = new Actions(Driver);
			action1.moveToElement(ele1).perform();
			Thread.sleep(1000);

		 	

			// Contact
			Thread.sleep(1000);
			WebElement ele2 = Driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/a"));
			Actions action2 = new Actions(Driver);
			action2.moveToElement(ele2).perform();
			Thread.sleep(1000);

			//Join email-list
			Driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[3]/a")).click();
			Thread.sleep(4000);

			//Subscription mail
			Driver.get("https://www.eviltester.com/page/contact/");
			Driver.switchTo().window(originalTab);
			Thread.sleep(4000);		

			
			/*************** Fill the details *****************/
			/**********************  FRAMES *******************/
//			WebElement frameElement = Driver.findElement(By.xpath("//*[@id=\"b_yqt8enl7_14\"]"));
//		    Driver.switchTo().frame(frameElement);
//		    Thread.sleep(2000);
//
//		    //Fill the deatils - Name 
//		    WebElement firstNameInput = Driver.findElement(By.xpath("//*[@id=\\\"111input\\\"]"));
//		    firstNameInput.sendKeys("Fathima");
//
//			//Email
//			Driver.findElement(By.name("email")).sendKeys("fathima@gmail.com");
//			Thread.sleep(2000);
//
//			//Message
//			Driver.findElement(By.name("message")).sendKeys("Have a nice day");
//			Thread.sleep(2000);

			Driver.switchTo().defaultContent();

			//Software blog
			Driver.get("https://www.eviltester.com/blog/");
			Thread.sleep(2000);
			

		

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

