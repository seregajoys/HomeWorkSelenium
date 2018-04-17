import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartIsEmptyTest extends BaseTest {

    @Test
    public static void checkcart() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickToCart();
        Assert.assertTrue(mainPage.checkCartIsEmpty());
    }
}
