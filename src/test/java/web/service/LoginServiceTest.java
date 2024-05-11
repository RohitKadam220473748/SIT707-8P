package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");
		
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("10-12-1997");
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		
		// Get the response body
		String responseBody = driver.findElement(By.tagName("body")).getText();
		System.out.println(responseBody);
		// Check if the response body contains the expected login status message
		Assert.assertTrue(responseBody.contains("Login status: success"));
		
		driver.close();
	}
	
	
	@Test
	public void testLoginFailInvalidusernameandInvalidpasswordInvaliddob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("rihan");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("rihan123");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("11-11-1997");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	
	@Test
	public void testLoginFailblankusernameandblankpasswordblankldob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	
	@Test
	public void testLoginFailwrongusernameandwrongpasswordblankdob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("abc");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("123cbf");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	
	@Test
	public void testLoginFailcorrectusernameandcorrectpasswordblankdob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("ahsan");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("ahsan_pass");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	@Test
	public void testLoginFailcorrectusernameandcorrectpasswordwrongdob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("ahsan");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("ahsan_pass");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("11-12-1997");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	@Test
	public void testLoginFailcorrectusernameandwrongpasswordcorrectdob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("ahsan");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("ahsan_123");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("10-12-1997");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	@Test
	public void testLoginFailwrongusernameandcorrectpasswordcorrectdob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("ahan");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("ahsan_pass");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("10-12-1997");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	@Test
	public void testLoginFailcorrectusernameandblankpasswordcorrectdob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("ahsan");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("10-12-1997");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}
	
	@Test
	public void testLoginFailblankusernameandcorrectpasswordcorrectdob() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);

	    // Full path where login.html is located.
	    // You can click on html file and copy the path shown in your browser.
	    //
	    driver.navigate().to(
	            "D:/ASSESMENT SEM 3/Software testing/Java projects/webservice2/src/main/java/web/login.html");
	    sleep(5);

	    // Find username element
	    //
	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("");

	    // Find password element
	    //
	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("ahsan_pass");

	    // Find dob element
	    //
	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("10-12-1997");

	    // Find Submit button, and click on button.
	    //
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(5);

	    // Get the response body
	    String responseBody = driver.findElement(By.tagName("body")).getText();
	    System.out.println(responseBody);
	    // Check if the response body contains the expected login status message
	    Assert.assertTrue(responseBody.contains("Login status: fail"));

	    driver.close();
	}

	
	
	
}
