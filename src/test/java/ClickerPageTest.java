
import base.BaseTest;
import org.testng.annotations.Test;

public class ClickerPageTest extends BaseTest{
    @Test
    public void logoDisplayWork(){
        clickerPage.openPage();
        clickerPage.checkElementDisplay("//*[@id=\"logo-box\"]/strong/a/img");
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
    @Test
    public void featuredProductDisplayWork(){
        clickerPage.openPage();
        clickerPage.checkElementDisplay("//*[@id=\"main\"]/div/section[1]");
    }
    @Test
    public void searchWork(){
        clickerPage.openPage();
        String url = "https://pampik.com/ua/search?q=%D0%A0%D0%BE%D0%B7%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D1%87%D0%BA%D0%B0%20%D0%B4%D0%BB%D1%8F%20%D0%BA%D1%83%D0%BA%D0%BB%D1%8B";
        clickerPage.checkSearchFunctionality("Розовая ванночка для куклы", url);
    }
}
