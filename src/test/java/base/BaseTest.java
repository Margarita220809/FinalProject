package base;

import driver.DriverFactory;
import functions.Action;
import functions.Assertions;
import functions.Elements;
import functions.Waiters;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.ClickerPage;

public class BaseTest {
    protected WebDriver driver = DriverFactory.startChromeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Action action = new Action(driver);
    protected Assertions assertions = new Assertions(driver);
    protected Elements elements = new Elements(driver);
    protected Waiters waiters = new Waiters(driver);
    protected ClickerPage clickerPage = new ClickerPage(driver);



}
