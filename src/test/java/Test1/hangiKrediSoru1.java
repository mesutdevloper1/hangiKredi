
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class hangiKrediSoru1{
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void hepsiKredi1() {
        driver.get("https://www.hangikredi.com/kredi/ihtiyac-kredisi");
        driver.manage().window().setSize(new Dimension(1552, 832));
        assertTrue(driver.findElement(By.cssSelector("h1")).isSelected());
        driver.findElement(By.id("HouseCredit")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".change_text"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".\\_hj-102w7__styles__openStateToggleIcon")).click();
        {
            WebElement element = driver.findElement(By.id("CalculateCta"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("amount"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".col-6 .input-prefix"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".col-6:nth-child(1) > .input-wrapper")).click();
        driver.findElement(By.id("maturity")).click();
        driver.findElement(By.cssSelector("#CalculateCta > span")).click();
        assertTrue(driver.findElement(By.id("consumerLoanAddToCard-1214")).isSelected());
        driver.findElement(By.id("consumerLoanAddToCard-1214")).click();
        assertTrue(driver.findElement(By.cssSelector(".sp-custom-205-1574689726:nth-child(1)")).isSelected());
        driver.findElement(By.cssSelector(".page-title")).click();
        assertTrue(driver.findElement(By.cssSelector(".sp-custom-205-1574689726:nth-child(1)")).isSelected());
    }
}
