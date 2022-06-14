package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {

    public static void main (String[] args){


        WebDriver driver = new ChromeDriver();
        By start = By.cssSelector("#start button");
        By finish = By.id("finish");

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(start).click();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(finish));
        System.out.println(driver.findElement(finish).getText());

        /*
         WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.presenceOfElementLocated(finish));
        System.out.println(driver.findElement(finish).getText());
         */






    }

}
