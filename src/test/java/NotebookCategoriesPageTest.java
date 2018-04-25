import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NotebookCategoriesPageTest extends BaseTest {
//zamenitb waitu
  @Test
    public void checkSizeNotebookBrands() throws InterruptedException {
      MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
      ComputersAndNotebooksPage computersAndNotebooksPage = PageFactory.initElements(driver, ComputersAndNotebooksPage.class);
      NotebookCategoriesPage notebookCategoriesPage = PageFactory.initElements(driver, NotebookCategoriesPage.class);
      mainPage.getComputerAndNotebooksPage();
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      computersAndNotebooksPage.navigateToNotebooksPage();
      notebookCategoriesPage.getNotebookBrands();
     Assert.assertEquals(notebookCategoriesPage.getNotebookBrands(), 8);
     System.out.println(notebookCategoriesPage.getNotebookBrands());


  }
}
