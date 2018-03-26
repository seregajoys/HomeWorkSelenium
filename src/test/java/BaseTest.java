import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;
    /*
    MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    CreditPage creditPage = PageFactory.initElements(driver, CreditPage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    */


    public static final String username = "testusername";
    public static final String email = "homework" + System.currentTimeMillis()/100000 + "@yopmail.com";
    public static final String password = "Qwerty1";
    public static final String product = "Iphone";

    @BeforeClass
    public  void load(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua");
    }

}
