package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

    public static void main (String[] args){
        //System.getProperties().list(System.out);

        String OS;
        OS = System.getProperty("os.name");
        System.out.println(OS);


        /*WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider = driver.findElement(By.cssSelector(".sliderContainer input"));
        WebElement value = driver.findElement(By.id("range"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider);*/

    }

}
