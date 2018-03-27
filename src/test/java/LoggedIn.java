import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoggedIn extends BaseTest {
    @Test
    public static void main () throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.loggedIn(username, password);
        Thread.sleep(2000);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ mainPage.profileIsDisplayed());
        Assert.assertTrue(mainPage.profileIsDisplayed());
    }

}