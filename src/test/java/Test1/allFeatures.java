package Test1;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.DriverManager;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

public class allFeatures  extends DriverManager {
    @Parameters("browser")

    @BeforeClass(groups = {"hook"})
    void beforeClass(@Optional("browser") String browser) throws MalformedURLException{


        setDriver(browser);
    }
    @AfterClass(groups = {"hook"})
   void teadown(){driver.quit();}


    @Test(groups = {"version"})
    void allFeatures(){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }



    @Test(groups = {"version"})
    public void ScreenshotTest() throws Exception{
        driver.close();
        ChromeDriver chrome= new ChromeDriver();
        chrome.get(baserUrl);
        Thread.sleep(200);
        File SrcFile=((ChromeDriver)chrome).getFullPageScreenshotAs(OutputType.FILE);
        File Destfile=new File("src/resources/screenshots/testss");
        FileUtils.copyFile(SrcFile,Destfile);
        chrome.quit();

    }


}
