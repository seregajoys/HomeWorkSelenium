import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

    @Test
    public static void search() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.searchProduct();
        Thread.sleep(2000);
        SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        searchResultPage.openProductPage();
        Thread.sleep(2000);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.addToCart();
        Thread.sleep(2000);
        Assert.assertTrue(productPage.productAddedToCart());
    }

}
