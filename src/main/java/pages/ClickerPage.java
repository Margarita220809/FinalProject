package pages;

import functions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickerPage extends BasePage{
    public ClickerPage(WebDriver driver){
        super(driver);
    }

    private static class Locators {
        private final static By logoImage = By.xpath("//*[@id=\"logo-box\"]/strong/a/img");
        private final static By logiN = By.xpath("//*[@id=\"personal-profile-link\"]");

        private final static By searchInput = By.xpath("//*[@id=\"search-form__input\"]");
        private final static By contactUs = By.xpath("//*[@id=\"footer\"]/div[2]/div/div[1]/div/div[1]/ul/li[4]/a");


    }

    private static class Labels {
        private final static String frame = "//iframe[@src='https://www.clickspeedtester.com/online-click-counter/']";
        private final static String URL = "https://pampik.com/ua";

    }
    public void checkLogoDisplay(String expected) {
        assertions.elementIsDisplayed(expected);
    }
    public void checkLogInClicked(String expected){
        elements.clickOnElement(Locators.logiN);
        assertions.equalOfUrl(driver.getCurrentUrl(), expected);
    }
    public void checkContactUsClicked(String expected){
        elements.clickOnElement(Locators.contactUs);
        assertions.equalOfUrl(driver.getCurrentUrl(), expected);
    }
    public void enterSearchText(String query) {
        WebElement searchInputElement = driver.findElement(Locators.searchInput);
        searchInputElement.sendKeys(query);
        searchInputElement.submit();
    }
    public void openPage(){
        driver.get(Labels.URL);
    }




}
