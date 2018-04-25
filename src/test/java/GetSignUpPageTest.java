import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetSignUpPageTest extends BaseTest {

    @Test
    public static void main () throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.getSignUpPage();
    }
}