import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AsusNotebooksPageTest extends BaseTest {

    @Test(priority = 1)
    public void checkSizeOfAsus() throws InterruptedException {

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        ComputersAndNotebooksPage computersAndNotebooksPage = PageFactory.initElements(driver, ComputersAndNotebooksPage.class);
        NotebookCategoriesPage notebookCategoriesPage = PageFactory.initElements(driver, NotebookCategoriesPage.class);
        AsusNotebooksPage asusNotebooksPage = PageFactory.initElements(driver, AsusNotebooksPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.getComputerAndNotebooksPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        computersAndNotebooksPage.navigateToNotebooksPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        notebookCategoriesPage.getAsusNotebooksPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        asusNotebooksPage.getSizeAsusNotebooks();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(asusNotebooksPage.getSizeAsusNotebooks(),32);
        System.out.println(asusNotebooksPage.getSizeAsusNotebooks());
    }

    @Test(priority = 2)
    public void changeDisplaying() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        AsusNotebooksPage asusNotebooksPage = PageFactory.initElements(driver, AsusNotebooksPage.class);
        asusNotebooksPage.switchToList();
    }

    @Test(priority = 3)
    public void checkSizeAsus() throws InterruptedException {
        AsusNotebooksPage asusNotebooksPage = PageFactory.initElements(driver, AsusNotebooksPage.class);
        asusNotebooksPage.getSizeAsusNotebooksAfterSwitch();
        Assert.assertEquals(asusNotebooksPage.getSizeAsusNotebooksAfterSwitch(),16);
        System.out.println(asusNotebooksPage.getSizeAsusNotebooksAfterSwitch());

    }


}
