package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavascriptAlert();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text is incorrect");

    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavascriptAlert();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alet_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text is incorrect");
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Result text is incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavascriptAlert();
        alertsPage.triggerPrompt();
        String text = "Meow";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Result text is incorrect");
    }
}
