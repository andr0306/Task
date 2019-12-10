import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        String baseUrl = "https://www.google.com";
        WebDriver driver = new FirefoxDriver();
        Methods methods = new Methods(driver);


        methods.goToPage(baseUrl);
        methods.setTextIntoField("qwerty");
        methods.clickSearchButton();
        methods.getTitle();

        driver.close();
    }
}