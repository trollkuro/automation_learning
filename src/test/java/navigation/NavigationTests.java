package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com/");
    }

    @Test
    public void testSwitchTabs(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
    @Test
    public void testSwitchToNewTab(){
        var examplePage2 = homePage.clickDynamicLoading().openInNewTabDynamicLoadingExample2Page();
        getWindowManager().switchToNewOpenedTab();
        assertTrue(examplePage2.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
