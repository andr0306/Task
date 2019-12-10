import Elements.Button;
import Elements.Field;
import org.openqa.selenium.WebDriver;

public class Methods {
    public WebDriver webDriver;
    private Button searchButton;
    private Field googleField;

    public Methods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Methods goToPage(String link){
       webDriver.get(link);
        return this;
    }

    public Methods setTextIntoField(String text){
        googleField = new Field(webDriver,"//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input").setText(text);
        return this;
    }

    public Methods clickSearchButton(){
        searchButton = new Button(webDriver,"//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]").click();
        return this;
    }

    public void getTitle(){
        System.out.println(webDriver.getTitle());
    }
}
