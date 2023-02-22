package com.sample.SystemTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class GoogleTest {
@Test
public void login() {
System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).click();
driver.findElement(By.name("q")).sendKeys("hello world");
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
{
  WebElement element = driver.findElement(By.linkText("Maps"));
  Actions builder = new Actions(driver);
  builder.moveToElement(element).perform();
}
driver.findElement(By.cssSelector(".ExCKkf > svg")).click();

driver.close();

}
}
