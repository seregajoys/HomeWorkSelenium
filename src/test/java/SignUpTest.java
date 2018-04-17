import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {
    @Test
    public void signUpTest() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        Thread.sleep(200);
        mainPage.getSignUpPage();
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.getNewUser(email, username, password);
        ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
        Thread.sleep(1000);
        Assert.assertTrue(profilePage.checkConfirmEmailPresent());


    }
}
