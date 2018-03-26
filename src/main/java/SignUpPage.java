import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Signature;

public class SignUpPage {
    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = "//*[@id='signup_form']/div[1]/input")
    private WebElement userNameField;
    @FindBy(xpath = "//*[@id=\"signup_form\"]/div[2]/input")
    private WebElement emailFieldOnSignUp;
    @FindBy(xpath = "//*[@id=\"signup_form\"]/div[3]/input")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@class='btn-link btn-link-green btn-link-sign']")
    private WebElement signUpButton;
    @FindBy(xpath = "//*[@class='signup-title']")
    private WebElement headTitle;

    public SignUpPage setUsername(String username) {
        userNameField.sendKeys(username);
        return this;
    }
    public SignUpPage setPasswrod (String passwrod){
        passwordField.sendKeys(passwrod);
        return this;
    }

    public SignUpPage setEmail(String email){
        emailFieldOnSignUp.sendKeys(email);
        return this;
    }

    public ProfilePage getNewUser (String username, String email, String password) {
        setUsername(username);
        setEmail(email);
        setPasswrod(password);
        signUpButton.click();
        return new ProfilePage(driver);
    }

}