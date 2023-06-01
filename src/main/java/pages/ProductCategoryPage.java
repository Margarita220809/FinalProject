package pages;

import functions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCategoryPage extends BasePage{
    public ProductCategoryPage(WebDriver driver){
        super(driver);
    }

    private static class Locators {
        private final static By pagination = By.xpath("//*[@id=\"pagination-block\"]/div/ul/li[3]");
        private final static By searchInput = By.xpath("//*[@id=\"search-form__input\"]");
        private final static By contactUs = By.xpath("//*[@id=\"footer\"]/div[2]/div/div[1]/div/div[1]/ul/li[4]/a");

    }

    private static class Labels {
//        private final static String frame = "//iframe[@src='https://www.clickspeedtester.com/online-click-counter/']";
        private final static String URL = "https://pampik.com/ua/category/detskie-krovatki-i-kolyibeli";

    }
    public void checkElementDisplay(String expected) {
        assertions.elementIsDisplayed(expected);
    }

    public void checkPageTitle(String expected){
        assertions.equalsOfText(driver.getTitle(), expected);
    }
    public void checkContactUsClicked(String expected){
        elements.clickOnElement(Locators.contactUs);
        assertions.equalsOfText(driver.getCurrentUrl(), expected);
    }
    public void enterSearchText(String query) {
        WebElement searchInputElement = driver.findElement(Locators.searchInput);
        searchInputElement.sendKeys(query);
        searchInputElement.submit();
    }
    public void checkSearchFunctionality(String query, String expected){
        enterSearchText(query);
        assertions.equalsOfText(driver.getCurrentUrl(), expected);
    }
    public void checkPaginationClick(String expected){
        elements.clickOnElement(Locators.pagination);
        assertions.equalsOfText(driver.getCurrentUrl(), expected);
    }
    public void checkProductClick(String expected){
        elements.clickOnElement(Locators.pagination);
        assertions.equalsOfText(driver.getCurrentUrl(), expected);
    }

    public void openPage(){
        driver.get(Labels.URL);
    }



}
