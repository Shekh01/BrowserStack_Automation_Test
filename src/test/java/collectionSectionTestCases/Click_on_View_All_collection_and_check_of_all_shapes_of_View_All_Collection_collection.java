package collectionSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.Base;

public class Click_on_View_All_collection_and_check_of_all_shapes_of_View_All_Collection_collection extends Base{

	
	@Test
	public void Click_on_View_All_collection_link_and_check_of_all_shapes_of_View_All_Collection_collection() throws InterruptedException {
		WebElement mouseover = driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseover).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[2]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Square']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Round']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Oval']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Runner']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Halfmoon']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Hexagon']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Diamond']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@id='container']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Capsule']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@id='container']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Drop']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@id='container']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Splash']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@id='container']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Eight']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@id='container']//div[@class='owl-nav']//button[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Oblong']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Ogee']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[normalize-space()='Arch']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(300);
	}

}
