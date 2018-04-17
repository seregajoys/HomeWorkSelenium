import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotebookCategoriesPageTest extends BaseTest {

  @Test
    public void checkSizeNotebookBrands() throws InterruptedException {
      Thread.sleep(2000);
      driver.get("https://rozetka.com.ua/notebooks/c80004/");
      Thread.sleep(2000);
      NotebookCategoriesPage notebookCategoriesPage = PageFactory.initElements(driver, NotebookCategoriesPage.class);
      notebookCategoriesPage.getNotebookBrands();
     Assert.assertEquals(notebookCategoriesPage.getNotebookBrands(), 8);
     System.out.println(notebookCategoriesPage.getNotebookBrands());


  }
}
