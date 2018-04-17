import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotebooksPage {
    private WebDriver driver;

    public NotebooksPage (WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='filter-active-i-link novisited sprite-side'][contains(text(), 'от 10000 до 12999 грн')]")
    private WebElement selectedFilter;

    @FindBy(xpath = "//*[@class='filter-active-i-link novisited filter-active-i-link-reset sprite-side']")
    private WebElement removeFilters;

    public Boolean chekFilterIsSelected(){
        return selectedFilter.isDisplayed();
    }

    public NotebooksPage clearFilters(){
        removeFilters.click();
        return this;
    }
}
