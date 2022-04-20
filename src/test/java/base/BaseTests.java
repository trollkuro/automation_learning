package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        setOS();
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void setOS(){
        String OS = System.getProperty("os.name");
        switch (OS){
            case "Linux":
                System.setProperty("webdriver.chrome.driver", "/home/kegorova/IdeaProjects/automation_learning/resources/chromedriver_linux_100");
                break;
            case "Windows 10":
                System.setProperty("webdriver.chrome.driver", "C:/Kristina/javaprojects/webdriver_java/resources/chromedriver.exe");
                break;
            default:
                System.out.println("can't set webdriver, check folder resources");
        }
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
