package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;

    private By link_Example1 = By.xpath(".//a[contains(@href, 'dynamic_loading/1')]");
    private By link_Example2 = By.xpath(".//a[contains(@href, 'dynamic_loading/2')]");

    public DynamicLoadingPage (WebDriver driver){
         this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page (driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
      driver.findElement(link_Example2).click();
      return new DynamicLoadingExample2Page (driver);
    }

    public DynamicLoadingExample2Page openInNewTabDynamicLoadingExample2Page(){
        driver.findElement(link_Example2).sendKeys(Keys.LEFT_CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page (driver);
    }


}
