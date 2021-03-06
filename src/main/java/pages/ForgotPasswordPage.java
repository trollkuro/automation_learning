package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.cssSelector("#form_submit");

    public ForgotPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    public void setEmail (String email){
        driver.findElement(emailField).sendKeys(email); ;
    }

    public EmailSentPage clickRetrivePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver); //решить вопросик со страницей

    }

    public EmailSentPage retrivePasswor(String email){
        setEmail(email);
        return clickRetrivePasswordButton();
    }



}
