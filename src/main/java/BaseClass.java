import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
    public static WebDriver driver;
    MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

    public  void firstLoad(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua");
    }

}
