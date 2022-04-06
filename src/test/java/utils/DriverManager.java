package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

  public WebDriver driver;
  public WebDriverWait wait;
  public JavascriptExecutor js;
  public String baserUrl;


  public void setDriver(String TestBrowser)  throws MalformedURLException {

      switch (TestBrowser){

          case "Chrome":{
              ChromeOptions chrome =new ChromeOptions();
              driver=new RemoteWebDriver(new URL("https://www.hepsiburada.com/cozummerkezi"),chrome);
              chrome.addArguments("start-maximized");
              driver=new ChromeDriver(chrome);
              System.out.println("chrome ile acıldı");
              break;
          }
          case "Firefox":{
              FirefoxOptions firefox =new FirefoxOptions();
              driver=new RemoteWebDriver(new URL("https://www.hepsiburada.com/cozummerkezi"),firefox);
              firefox.addArguments("start-maximized");
              driver=new FirefoxDriver(firefox);
              System.out.println("firefox ile acıldı");
          }



      }

      WebDriverManager.chromedriver().setup();
      driver =new ChromeDriver();
      System.out.println("chrome acıldı");

      baserUrl="https://www.hepsiburada.com/cozummerkezi";
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


  }
}
