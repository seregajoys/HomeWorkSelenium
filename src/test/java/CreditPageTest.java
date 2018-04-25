import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditPageTest extends BaseTest {
    @Test(priority = 1)
    public void creditRulesIsDisplayed() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.navigateToCreditPage();
        CreditPage creditPage = PageFactory.initElements(driver, CreditPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='credit-rules-list']/div[1]")));
        Assert.assertTrue(creditPage.getCreditRules1());
        Assert.assertTrue(creditPage.getCreditRules2());
        Assert.assertTrue(creditPage.getCreditRules3());
        Assert.assertTrue(creditPage.getCreditRules4());
        creditPage.scrollToElement();
        Assert.assertEquals(creditPage.checkCreditTermsAge(), "21-70");
    }

    @Test(priority = 2)
    public void checkTable() throws InterruptedException {
        CreditPage creditPage = PageFactory.initElements(driver, CreditPage.class);
        creditPage.checkTableTitle();
        Assert.assertEquals(creditPage.checkTableTitle(), "Условия кредитования");
        Assert.assertEquals(creditPage.checkCreditPackTitle(), "0,01% на 15 месяцев");
        Assert.assertEquals(creditPage.checkCreditPeriod(),"15");
        Assert.assertEquals(creditPage.checkCreditRate(), "0,01");
        Assert.assertEquals(creditPage.checkCreditComission(), "2,5");
        Assert.assertEquals(creditPage.checkCreditSingleComission(), "-");
        Assert.assertEquals(creditPage.checkCreditFirstDeposit(), "от 0");
    }

    @Test(priority = 3)
    public  void check() throws InterruptedException {
        CreditPage creditPage = PageFactory.initElements(driver, CreditPage.class);
        Assert.assertEquals(creditPage.getValueFromTable("0,01% на 5 месяцев", "Льготный период"), "5");
        Assert.assertEquals(creditPage.getValueFromTable("Кредит с компенсацией до", "Ежемесячная"), "1,99");

    }

}