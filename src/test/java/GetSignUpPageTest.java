import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GetSignUpPageTest extends BaseTest {

    @Test
    public static void main () throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.getSignUpPage();
    }
}