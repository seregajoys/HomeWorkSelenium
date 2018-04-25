import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(xpath = "//a[@name='signin']")
    private WebElement signInHeader;
    @FindBy(xpath = "//*[@class='auth-f-signup']")
    private WebElement signUpForm;
    @FindBy(xpath = "(//*[@class='input-text auth-input-text'])[1]")
    private WebElement emailInput ;
    @FindBy(xpath = "(//*[@class='input-text auth-input-text'])[2]")
    private WebElement passInput ;
    @FindBy(xpath = "//*[@name='auth_submit']")
    private WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"rz-search\"]/form/div[1]/div[2]/input")
    private WebElement searchInput ;
    @FindBy(xpath = "//span[@class='btn-link btn-link-green']")
    private WebElement searchButton ;
    @FindBy(xpath = "//a[@class='hub-i-link hub-i-cart-link sprite-side whitelink']")
    private WebElement cart ;
    @FindBy(xpath = "//a[@name='profile']")
    private WebElement profileButton;
    @FindBy(xpath = "//*[@class='m-top']/li[2]")
    private WebElement creditPageLink;
    @FindBy (xpath = "//span[@class='exponea-close-cross']")
    private WebElement sranuybanner;
    @FindBy(xpath = "//*[@id=\"drop-block\"]")
    private WebElement dropBlock;
    @FindBy(xpath = "(//*[@name='fat_menu_link'])[1]")
    private WebElement navigateToNotebooks;



    public MainPage setEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }

    public MainPage setPass(String password){
        passInput.sendKeys(password);
        return this;
    }

    public MainPage setProduct(String product){
        searchInput.sendKeys(product);
        return this;
    }

    public MainPage loggedIn(String email, String password){
        signInHeader.click();
        setEmail("seruy001@mail.ru");
        setPass("006035");
        signInButton.click();
        return this;
    }

    public Boolean profileIsDisplayed(){
        if (profileButton.isDisplayed()) return true;
        else return false;
    }

    public SignUpPage getSignUpPage() throws InterruptedException {
       signInHeader.click();
    /*
       if (sranuybanner.isDisplayed()){
            sranuybanner.click();
        }
        else {
           signUpForm.click();
       }
     */
       signUpForm.click();
       return new SignUpPage(driver);
    }

    public SearchResultPage searchProduct(String product){
        setProduct(product);
        searchButton.click();
       return new SearchResultPage(driver);
    }

    public MainPage clickToCart(){
        cart.click();
        return this;
    }

    public CreditPage navigateToCreditPage (){
        creditPageLink.click();
        return new CreditPage(driver);
    }

    public Boolean checkCartIsEmpty(){
        return dropBlock.isDisplayed();
    }

    public ComputersAndNotebooksPage getComputerAndNotebooksPage(){
        navigateToNotebooks.click();
        return new ComputersAndNotebooksPage(driver);
    }


}
