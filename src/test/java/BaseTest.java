import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;

    public static final String username = "testusername"+ System.currentTimeMillis()/100000;
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




/*
    public static  MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    public static  CreditPage creditPage = PageFactory.initElements(driver, CreditPage.class);
    public static  SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    public static  SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    public static  AsusNotebooksPage asusNotebooksPage = PageFactory.initElements(driver, AsusNotebooksPage.class);
    public static  ComputersAndNotebooksPage computersAndNotebooksPage = PageFactory.initElements(driver, ComputersAndNotebooksPage.class);
    public static  NotebookCategoriesPage notebookCategoriesPage = PageFactory.initElements(driver, NotebookCategoriesPage.class);
    public static  NotebooksPage notebooksPage = PageFactory.initElements(driver, NotebooksPage.class);
    public static  ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
    public static  ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
 */
