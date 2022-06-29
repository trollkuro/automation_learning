package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "/home/kegorova/IdeaProjects/automation_learning/resources/linux/chromedriver_102");


        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading");
        By example2 = By.xpath(".//a[contains(@href, 'dynamic_loading/2')]");
        driver.findElement(example2).sendKeys(Keys.LEFT_CONTROL, Keys.RETURN);
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);


        /*By dropdown = By.id("dropdown");


        driver.get("http://the-internet.herokuapp.com/dropdown");

        WebElement dropdownElement = driver.findElement(dropdown);
        String script = "arguments[0].setAttribute('multiple', '')";
        ((JavascriptExecutor)driver).executeScript(script, dropdownElement);
        Select selectDropdown = new Select(driver.findElement(dropdown));
        selectDropdown.selectByVisibleText("Option 1");
        selectDropdown.selectByVisibleText("Option 2"); */


        /*
         WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.presenceOfElementLocated(finish));
        System.out.println(driver.findElement(finish).getText());
         */

        /*

         */






    }

}
