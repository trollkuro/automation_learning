package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTests {

    @Test
    public void testSlider(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.moveSliderToValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect!");

    }
}
