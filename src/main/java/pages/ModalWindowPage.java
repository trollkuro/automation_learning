package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalWindowPage {

    private WebDriver driver;
    private By modalWindow = By.className("modal");
    private By modalWidowTitle = By.xpath(".//div[@class='modal-title']");
    private By modalWindowClose = By.xpath(".//div[@class='modal-footer']");
    private By pageContent = By.xpath("//*[@class=\"example\"]//p[contains(text(),'Displays')]");

    public ModalWindowPage (WebDriver driver){
        this.driver = driver;
    }

    public void modalWindowIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(modalWindow));
    }

    public String modalWindowHeader(){
        return driver.findElement(modalWidowTitle).getText();
    }

    public void closeModalWindow(){
        driver.findElement(modalWindowClose).click();
    }

    public String modalWindowIsClosed(){ return driver.findElement(pageContent).getText(); }

}
