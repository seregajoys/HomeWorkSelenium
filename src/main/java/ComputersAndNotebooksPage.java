import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersAndNotebooksPage {
    private WebDriver driver;

    public ComputersAndNotebooksPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "(//*[@class='pab-h3-link'])[1]")
    private WebElement navigateToNotebooks;

    public NotebookCategoriesPage navigateToNotebooksPage(){
        navigateToNotebooks.click();
        return new NotebookCategoriesPage(driver);
    }
}
