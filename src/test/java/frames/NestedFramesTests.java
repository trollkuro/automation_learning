package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void NestedFramesTests(){
        var nestedFramePage = homePage.clickNestedFrames();
        String leftFrame = nestedFramePage.getLeftFrameText();
        assertEquals(leftFrame, "LEFT", "Incorrect left frame text");
        String bottomFrame = nestedFramePage.getBottomFrameText();
        assertEquals(bottomFrame, "BOTTOM", "Incorrect bottom frame text");
    }
}
