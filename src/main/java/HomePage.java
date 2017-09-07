import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[3]/div/div/div[1]/nav/ul/li[1]/span")
    private WebElement spanTable;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[3]/div/div/div[1]/nav/ul/li[1]/ul/li[4]/a/span")
    private WebElement prodDevTeamsField;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/span[2]")
    private WebElement langChoose;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div/div/ul/li[2]/a")
    private WebElement langEng;


    public WebElement getSpanTable() {
        return spanTable;
    }

    public WebElement getProdDevTeamsField() {
        return prodDevTeamsField;
    }

    public WebElement getLangChoose() {
        return langChoose;
    }

    public WebElement getLangEng() {
        return langEng;
    }

    public void setSpanTable() {
        getSpanTable().click();
    }

    public void setProdDevTeamsField() {
        getProdDevTeamsField().click();
    }

    public void setLangChoose() {
        getLangChoose().click();
    }

    public void setLangEng() {
        getLangEng().click();
    }

}