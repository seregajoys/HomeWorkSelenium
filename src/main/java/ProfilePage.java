import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
    private WebDriver driver;
    public ProfilePage(WebDriver driver){

        this.driver = driver;
    }
    @FindBy(xpath = "//*[@id=\"confirm_email_btn\"]")
    private WebElement confirmEmailButton;

    public Boolean checkConfirmEmailPresent(){
        return confirmEmailButton.isDisplayed();
    }
}

