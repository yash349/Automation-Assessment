package store;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Data {

    private final WebDriver driver;

    public Data() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yash.agrawal\\Documents\\javaProject\\Project-aid\\src\\main\\Resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public WebDriver getData() {
        return driver;
    }

}
