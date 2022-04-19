package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        Select dropdownElements = new Select(driver.findElement(dropdown));
        dropdownElements.selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> selectElements = findDropDownElement().getAllSelectedOptions();
        return selectElements.stream().map(e->e.getText()).collect(Collectors.toList());

    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }


}
