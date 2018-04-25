import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoggedIn extends BaseTest {
    @Test
    public static void main ()  {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.loggedIn(username, password);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@name='profile']")));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ mainPage.profileIsDisplayed());
        Assert.assertTrue(mainPage.profileIsDisplayed());
    }

}