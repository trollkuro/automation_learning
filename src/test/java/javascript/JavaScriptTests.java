package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDOM().ScrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testDropDownToMultiple(){
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.setDropDownMultiple();

        var optionsToSelect = List.of("Option 1","Option 2");
        optionsToSelect.forEach(dropdownPage::selectFromDropDown);

        var selectedOptions = dropdownPage.getSelectedOption();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "Options are not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected options is different");


    }
}
