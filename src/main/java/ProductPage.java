import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@name='topurchases']")
    private WebElement buyButton;
    @FindBy(xpath = "//*[@id=\"cart-popup\"]/div[2]/div[1]/h2")
    private WebElement popupAddToCart;


    public ProductPage addToCart(){
        buyButton.click();
        return this;
    }
    public Boolean productAddedToCart(){
        return popupAddToCart.isDisplayed();
    }

}

