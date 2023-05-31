
import base.BaseTest;
import org.testng.annotations.Test;

public class ClickerPageTest extends BaseTest{
    @Test
    public void logoDisplayWork(){
        clickerPage.openPage();
        clickerPage.checkLogoDisplay("//*[@id=\"logo-box\"]/strong/a/img");

    }
    @Test
    public void logInClickWork(){
        clickerPage.openPage();
        clickerPage.checkLogInClicked("https://pampik.com/ua/account/login");
    }
    @Test
    public void contactUsClickWork(){
        clickerPage.openPage();
        clickerPage.checkContactUsClicked("https://pampik.com/ua/aboutus/contact-us");
    }
}
