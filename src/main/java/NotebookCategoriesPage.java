import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NotebookCategoriesPage {
    private WebDriver driver;

    public NotebookCategoriesPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='pab-cell pab-img-45']")
    private List<WebElement> notebookBrands;

    @FindBy(xpath = "(//div[@class='clearfix sprite-side '])[11]")
    private WebElement asusNotebooks;

    @FindBy(xpath = "(//*[@class='m-cat-subl-i'])[17]")
    private WebElement priceFilter;

    public int getNotebookBrands() throws InterruptedException {
        return notebookBrands.size();
    }

    public AsusNotebooksPage getAsusNotebooksPage (){
        asusNotebooks.click();
        return new AsusNotebooksPage(driver);
    }

    public NotebooksPage selectFilter(){
        priceFilter.click();
        return new NotebooksPage(driver);
    }

}
