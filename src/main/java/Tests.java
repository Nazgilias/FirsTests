import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tests {
    private Steps steps = new Steps();

    @Before
    public void startDriver() {
        steps.startDriver();
    }

    @After
    public void quitDriver() {
        steps.quitDriver();
    }

    @Test
    public void test1() {
        steps.changeLange();
        steps.openSpanTableSolutions();
        steps.choseProdactDevTeams();
        steps.enterMail("blabla");
        steps.clickGetStartedForFree();
        steps.checkErrorMessage();
        steps.refreshPage();
        steps.checkErrorAbsent();
        steps.checkLoginField();
        steps.checkText();
    }
}