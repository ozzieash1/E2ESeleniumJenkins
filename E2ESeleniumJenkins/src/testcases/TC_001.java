package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;

//import Com.pracselenium.Exercise4BasePage;
//import junit.framework.Assert;

public class TC_001 {
	

	private WebDriver driver;
	/*private WebElement email;
	private WebElement name;
	private WebElement address;
	// private WebElement card_type;
	private WebElement card_number;
	private WebElement cardholder_name;
	private WebElement verification_code;
	private String btn = ".//button[@class='btn btn-primary']";
	private String url = " http://www.practiceselenium.com/check-out.html";*/

	//Exercise4BasePage exercise4BasePage = new Exercise4BasePage();
	
	private String url = " http://www.practiceselenium.com/check-out.html";
	
	
	@Test
	public void testcase1(){
		//constructor

			System.setProperty("webdriver.chrome.driver", "C:/WS/chromedriver.exe");
			driver = new ChromeDriver();
			//PageFactory.initElements(driver, this);
	
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys("uash@gmail.com");
	driver.findElement(By.id("name")).sendKeys("uash");
	driver.findElement(By.id("address")).sendKeys("1 Main St");
	Select card_type = new Select(driver.findElement(By.id("card_type")));
	card_type.selectByVisibleText("Visa");
	driver.findElement(By.id("card_number")).sendKeys("2345345645675678");
	driver.findElement(By.id("cardholder_name")).sendKeys("Uash Ash");
	driver.findElement(By.id("verification_code")).sendKeys("001");
	driver.findElement(By.ByXPath.xpath(".//button[@class='btn btn-primary']")).click();
	driver.quit();
/*	card_number.sendKeys(card_number1);
	cardholder_name.sendKeys(cardholder_name1);
	verification_code.sendKeys(verification_code1);*/
	
	
	}

	/*@Test
	public void load() {
		this.driver.get(url);

	}*/


/*	@Test
	public void isLoaded(Object title) {
	this.driver.get(url);
Assert.assertTrue(driver.getTitle().equals(title));
}
	*/
	
	
	
}
