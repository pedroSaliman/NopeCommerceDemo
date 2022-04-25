package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver;
    public static Properties prop;

    @BeforeClass
    void setup() throws IOException {
        prop=new Properties();  
        FileInputStream fi = new FileInputStream("E:\\seleniumprojects\\DemoSelenium\\src\\test\\java\\config\\config.properties");
        prop.load(fi);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DOMConfigurator.configure("log4g.xml");

    }

    @AfterMethod
    void screen(ITestResult result) throws IOException {
        if (ITestResult.FAILURE==result.getStatus()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            String destination = System.getProperty("user.dir") + "\\screenshot\\"+ result.getName()+ ".png";
            FileUtils.copyFile(source, new File(destination));
        }
    }
    @AfterClass
    Void after()
    {
        driver.quit();
        return null;
    }
}