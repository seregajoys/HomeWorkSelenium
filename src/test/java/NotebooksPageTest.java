import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NotebooksPageTest extends BaseTest {

    @Test
    public void chekFilterIsActive() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        ComputersAndNotebooksPage computersAndNotebooksPage = PageFactory.initElements(driver, ComputersAndNotebooksPage.class);
        NotebookCategoriesPage notebookCategoriesPage = PageFactory.initElements(driver, NotebookCategoriesPage.class);
        NotebooksPage notebooksPage = PageFactory.initElements(driver, NotebooksPage.class);

        mainPage.getComputerAndNotebooksPage();
        Thread.sleep(1000);
        computersAndNotebooksPage.navigateToNotebooksPage();
        Thread.sleep(1000);
        notebookCategoriesPage.selectFilter();
        Thread.sleep(1000);
        notebooksPage.chekFilterIsSelected();
        Thread.sleep(1000);
        notebooksPage.clearFilters();
    }
}
