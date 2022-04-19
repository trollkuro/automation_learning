package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage (WebDriver driver){
        this.driver = driver;
    }

    public void moveSliderToValue(String value){
        while (!getSliderValue().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }






}
