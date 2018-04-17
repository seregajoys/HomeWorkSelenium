import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsusNotebooksPageTest extends BaseTest {

    @Test(priority = 1)
    public void checkSizeOfAsus() throws InterruptedException {
        Thread.sleep(2000);
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        ComputersAndNotebooksPage computersAndNotebooksPage = PageFactory.initElements(driver, ComputersAndNotebooksPage.class);
        NotebookCategoriesPage notebookCategoriesPage = PageFactory.initElements(driver, NotebookCategoriesPage.class);
        AsusNotebooksPage asusNotebooksPage = PageFactory.initElements(driver, AsusNotebooksPage.class);

        mainPage.getComputerAndNotebooksPage();
        Thread.sleep(1000);
        computersAndNotebooksPage.navigateToNotebooksPage();
        Thread.sleep(1000);
        notebookCategoriesPage.getAsusNotebooksPage();
        Thread.sleep(1000);
        asusNotebooksPage.getSizeAsusNotebooks();
        Thread.sleep(1000);
        Assert.assertEquals(asusNotebooksPage.getSizeAsusNotebooks(),32);
        System.out.println(asusNotebooksPage.getSizeAsusNotebooks());
    }

    @Test(priority = 2)
    public void changeDisplaying(){
        AsusNotebooksPage asusNotebooksPage = PageFactory.initElements(driver, AsusNotebooksPage.class);
        asusNotebooksPage.switchToList();
    }

    @Test(priority = 3)
    public void checkSizeAsus() throws InterruptedException {
        AsusNotebooksPage asusNotebooksPage = PageFactory.initElements(driver, AsusNotebooksPage.class);
        Thread.sleep(2000);
        asusNotebooksPage.getSizeAsusNotebooksAfterSwitch();
        Assert.assertEquals(asusNotebooksPage.getSizeAsusNotebooksAfterSwitch(),16);
        System.out.println(asusNotebooksPage.getSizeAsusNotebooksAfterSwitch());

    }


}
