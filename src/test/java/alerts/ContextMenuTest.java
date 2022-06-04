package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {

    @Test
    public void testGetTextFromAlert(){
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.triggerAlert();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(text, "You selected a context menu", "Popup message incorrect");
    }



}
