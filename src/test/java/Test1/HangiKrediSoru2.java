package Test1;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class HangiKrediSoru2 {
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
    public void hangiKrediSoru2() {
        driver.get("https://www.hangikredi.com/kredi-karti");
        driver.manage().window().setSize(new Dimension(1552, 832));
        driver.findElement(By.cssSelector(".credit-card-hero__header .col-12")).click();
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Kredi Kartı Başvurusu"));
        driver.findElement(By.cssSelector(".col-4:nth-child(1) > a > p")).click();
        {
            WebElement element = driver.findElement(By.cssSelector("#creditCardDetailName-61 > b"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector("#creditCardAddToCard-61 > span")).click();
        driver.findElement(By.cssSelector(".navbar")).click();
        assertTrue(driver.findElement(By.id("logo")).isSelected());
        driver.findElement(By.cssSelector(".col-4:nth-child(2) > a > p")).click();
        driver.findElement(By.cssSelector("#creditCardAddToCard-73 > span")).click();
        {
            WebElement element = driver.findElement(By.linkText("Mil Veren Kartlar"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".col-4:nth-child(3) > a > p")).click();
        driver.findElement(By.id("creditCardAddToCard-3")).click();
        {
            WebElement element = driver.findElement(By.cssSelector("#creditCardAddToCard-2 > span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector("#creditCardAddToCard-2 > span")).click();
        driver.findElement(By.cssSelector(".enpara-apply-header-top")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".navigation > ul > li:nth-child(5) > a"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".col-4:nth-child(4) > a > p")).click();
        driver.findElement(By.cssSelector("#creditCardAddToCard-54 > span")).click();
        driver.findElement(By.cssSelector(".content")).click();
        driver.findElement(By.cssSelector(".navbar")).click();
        assertTrue(driver.findElement(By.id("logo")).isSelected());
        {
            WebElement element = driver.findElement(By.cssSelector(".col-4:nth-child(2) > a > p"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".col-4:nth-child(5) p")).click();
        driver.findElement(By.cssSelector("#creditCardAddToCard-37 > span")).click();
        driver.findElement(By.id("title")).click();
        assertTrue(driver.findElement(By.id("title")).isSelected());
        {
            WebElement element = driver.findElement(By.linkText("buraya tıklayınız."));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("Ticari Kartlar"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector("a b")).click();
        driver.findElement(By.cssSelector("#creditCardAddToCard-61 > span")).click();
        driver.findElement(By.cssSelector(".navbar")).click();
        assertTrue(driver.findElement(By.id("logo")).isSelected());
    }
}