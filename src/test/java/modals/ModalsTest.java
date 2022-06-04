package modals;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalsTest extends BaseTests {

    @Test
    public void testOpenModalWindow(){
        var modalPage = homePage.clickModalWindowPage();
        modalPage.modalWindowIsDisplayed();
        assertEquals(modalPage.modalWindowHeader(), "THIS IS A MODAL WINDOW");
    }


    @Test
    public void testCloseModalWindow(){
        var modalPage = homePage.clickModalWindowPage();
        modalPage.modalWindowIsDisplayed();
        modalPage.closeModalWindow();
        assertEquals(modalPage.modalWindowIsClosed(),"Displays an ad on page load.");
    }
}
