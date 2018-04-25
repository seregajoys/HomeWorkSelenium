import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NotebooksPageTest extends BaseTest {

    @Test
    public void chekFilterIsActive() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        ComputersAndNotebooksPage computersAndNotebooksPage = PageFactory.initElements(driver, ComputersAndNotebooksPage.class);
        NotebookCategoriesPage notebookCategoriesPage = PageFactory.initElements(driver, NotebookCategoriesPage.class);
        NotebooksPage notebooksPage = PageFactory.initElements(driver, NotebooksPage.class);

        mainPage.getComputerAndNotebooksPage();
        computersAndNotebooksPage.navigateToNotebooksPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        notebookCategoriesPage.selectFilter();
        notebooksPage.chekFilterIsSelected();
        notebooksPage.clearFilters();

    }
}
