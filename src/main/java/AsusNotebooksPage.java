import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AsusNotebooksPage {
    private WebDriver driver;

    public AsusNotebooksPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='g-i-tile g-i-tile-catalog']")
    private List<WebElement> listOfAsusNotebooks;

    @FindBy(xpath = "(//*[@class='btn-link-i'])[2]")
    private WebElement listButton;

    @FindBy(xpath = "//*[@class='g-i-list-middle-part']")
    private List<WebElement> listOfAsusNotebooksAfterSwitch;

    public int getSizeAsusNotebooks(){
        return listOfAsusNotebooks.size();
    }

    public AsusNotebooksPage switchToList(){
        listButton.click();
        return this;
    }

    public int getSizeAsusNotebooksAfterSwitch(){
       return listOfAsusNotebooksAfterSwitch.size();
    }

}
