import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
    @FindBy(xpath = "//*[@id=\"panel-36-0-0-0\"]/div/section/div[1]/div/div/div/form/input")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"panel-36-0-0-0\"]/div/section/div[1]/div/div/div/form/button")
    private WebElement getStartedForFreeButton;

    @FindBy(xpath = "//*[@id=\"panel-36-0-0-0\"]/div/section/div[1]/div/div/div/form/span")
    private WebElement errorMessage;

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getGetStartedForFreeButton() {
        return getStartedForFreeButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public void setLoginField(String mail) {
        getLoginField().sendKeys(mail);
    }

    public void setGetStartedForFreeButton() {
        getGetStartedForFreeButton().click();
    }
}
