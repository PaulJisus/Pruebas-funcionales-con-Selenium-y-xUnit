package webseleniumtest;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSeleniumTest {
	
	@Test
	public void testPositives() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("5", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testNegatives() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("-5", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testPositivesDecimals() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50.5");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("5.05", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testNegativesDecimals() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-50.5");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("-5.05", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testPositivesExponentials() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("5.0E+306");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("5.0E+305", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testNegativesExponentials() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-5.0E+306");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("-5.0E+305", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testInvalidPositives() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("5.0E+307");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("INF", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testInvalidNegatives() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-5.0E+307");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("-INF", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testInvalidPositives1() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("5.0E-324");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("0", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
	@Test
	public void testInvalidNegatives1() {
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-5.0E-324");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

	      
	      // ASSERTS
	      assertEquals("-0", result);
	      
	      //Close the Browser.
	      driver.close();
	}
	
   public static void main(String[] args) {
   
      WebDriver driver = new ChromeDriver();
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Launch website
      driver.navigate().to("http://www.calculator.net/");
      
      //Maximize the browser
      driver.manage().window().maximize();
      
      // Click on Math Calculators
      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
      
      // Click on Percent Calculators
      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button
      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

      
      // Get the Result Text based on its xpath
      String result =
         driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

      
      // Print a Log In message to the screen
      System.out.println("The Result is " + result);
      
      //Close the Browser.
      driver.close();
   }
}