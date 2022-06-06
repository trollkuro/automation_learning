package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

    public static void main (String[] args){

        /* WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/entry_ad");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("modal")));
        String modalTitle = driver.findElement(By.xpath(".//div[@class='modal-title']")).getText();
        var modalClose = driver.findElement(By.xpath(".//div[@class='modal-footer']"));
        System.out.println(modalTitle + '\n' + modalClose.getText());
        modalClose.click(); */

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        String text = driver.switchTo().frame("frame-top").switchTo().frame("frame-left").findElement(By.tagName("body")).getText();
        System.out.println(text);




    }

}
