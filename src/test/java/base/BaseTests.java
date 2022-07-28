package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private EventFiringWebDriver driver; //listener for events
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        setOS();
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.register(new EventReporter());
        goHome();
        getCookieManager();
        //setCookie();
    }

    @BeforeMethod
    public void setOS(){
        String OS = System.getProperty("os.name");
        switch (OS){
            case "Linux":
                System.setProperty("webdriver.chrome.driver", "/home/kegorova/IdeaProjects/automation_learning/resources/linux/chromedriver_102");
                break;
            case "Windows 10":
                System.setProperty("webdriver.chrome.driver", "C:/Kristina/javaprojects/webdriver_java/resources/windows/chromedriver 103.0.5060.134.exe");
                break;
            default:
                System.out.println("can't set webdriver, check folder resources");
        }
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            //System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    public CookieManager getCookieManager(){
        return new CookieManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"} );
        //options.setHeadless(true);
        return options;
    }

    /* private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }
     */
}
