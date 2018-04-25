import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchProductTest extends BaseTest {

    @Test
    public static void search() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.searchProduct(product);
        SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        searchResultPage.openProductPage();
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.addToCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(productPage.productAddedToCart());
    }

}
