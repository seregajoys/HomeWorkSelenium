import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {
    @Test
    public void signUpTest() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        Thread.sleep(2000);
        mainPage.getSignUpPage();
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.getNewUser(String username, String email, String password);
    }
}
