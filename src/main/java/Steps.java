import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

public class Steps {
    private WebDriver driver = new ChromeDriver();
    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    private SecondPage secondPage = PageFactory.initElements(driver, SecondPage.class);
    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step
    public void startDriver() {
        driver.get("https://www.wrike.com/wa");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getLangChoose()));
    }

    @Step
    public void quitDriver() {
        driver.quit();
    }

    @Step
    public void changeLange() {
        homePage.setLangChoose();
        homePage.setLangEng();
    }

    @Step
    public void openSpanTableSolutions() {
        homePage.setSpanTable();
    }

    @Step
    public void choseProdactDevTeams() {
        homePage.setProdDevTeamsField();
    }

    @Step
    public void enterMail(String mail) {
        if (driver.getCurrentUrl().equals("https://www.wrike.com/product-management-software/")) {
            secondPage.setLoginField(mail);
        } else {
            Assert.fail("Incorrect URL");
        }
    }

    @Step
    public void clickGetStartedForFree() {
        secondPage.setGetStartedForFreeButton();
    }

    @Step
    public void checkErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(secondPage.getErrorMessage()));
    }

    @Step
    public void refreshPage() {
        driver.navigate().refresh();
    }

    @Step
    public void checkErrorAbsent() {
        Assert.assertTrue("Error is present", !secondPage.getErrorMessage().isDisplayed());
    }

    @Step
    public void checkLoginField() {
        Assert.assertTrue("Login Field is not empty", !secondPage.getLoginField().getText().equals(null));
    }

    @Step
    public void checkText() {
        Assert.assertTrue("Text is absent", !secondPage.getText().isDisplayed()
                || !secondPage.getText().getText().equals("Robust Features \n" + "for Product Development"));
    }
}
