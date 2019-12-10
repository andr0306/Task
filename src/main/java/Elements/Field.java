package Elements;

import org.openqa.selenium.WebDriver;

public class Field extends BaseElement{

    public Field(WebDriver driver, String xpath) {
        super(driver, xpath);
    }
    public Field setText(String text){
        this.element.sendKeys(text);
        return this;
    }
}
