import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {
    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(xpath = "(//div[@class='g-i-tile-i-title clearfix'])[1]")
    private WebElement firstItem;

    public ProductPage openProductPage(){
        firstItem.click();
        return new ProductPage(driver);
    }
}



