package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {

    public static void main (String[] args){


        WebDriver driver = new ChromeDriver();
        By dropdown = By.id("dropdown");

        driver.get("http://the-internet.herokuapp.com/dropdown");

        WebElement dropdownElement = driver.findElement(dropdown);
        String script = "arguments[0].setAttribute('multiple', '')";
        ((JavascriptExecutor)driver).executeScript(script, dropdownElement);


        /*
         WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.presenceOfElementLocated(finish));
        System.out.println(driver.findElement(finish).getText());
         */






    }

}
