package checkOutPageSectionTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Checkout_page_Blank_fields extends resources.Base {
	@Test
	public void Test_And_Verify_All_Checkout_Page_Blank_field_pass_value_and_clear_Test() throws InterruptedException {
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[@id='btn-submit']//span[contains(text(),'Login')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//img[@alt='shopping bag']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// driver.findElement(By.xpath("//a[@title='Remove This Item']")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/div/div[1]/div/div[2]/ul/li/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[normalize-space()='+ New Address']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//input[@id='shipping[first_name]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//input[@id='shipping[last_name]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//input[@id='shipping[phone]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[company_name]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping_address_0'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping_address_1'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[city]'])[1]")).clear();
		Thread.sleep(1000);
		WebElement drpco = driver.findElement(By.id("shipping_country"));
		Select sel = new Select(drpco);
		sel.selectByValue("United Kingdom");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement drpst = driver.findElement(By.id("shipping_state"));
		Select selsta = new Select(drpst);
		selsta.selectByValue("Antrim");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//input[@id='shipping[postcode]'])[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
	}

}