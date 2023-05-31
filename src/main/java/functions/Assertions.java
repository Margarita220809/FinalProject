package functions;


import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Assertions {
        private final WebDriver driver;
        private final Waiters waiters;
        private final Action actionist;
        private final Elements elements;

        public Assertions(WebDriver driver) {
            this.driver = driver;
            elements = new Elements(driver);
            waiters = new Waiters(driver);
            actionist = new Action(driver);
        }
        public void elementIsDisplayed(String xpath){
            assertTrue(elements.isElementDisplayed(xpath),"Элемент не отображается, а должен был");
        }
        public void equalsOfText(String xpath,String expectedText){
            assertEquals(elements.getElementText(elements.findElementByXpath(xpath)),expectedText,
                    "Я ожидал получить текст "+expectedText+". А получил "+
                            elements.getElementText(elements.findElementByXpath(xpath))+".");
        }
    public void equalsOfInts(int actual, int expected){
        assertEquals(actual,expected,
                "Я ожидал получить текст "+expected+". А получил "+
                        actual+".");
    }
    public void equalOfUrl(String actual, String expected){
        assertEquals(actual,expected,
                "Я ожидал получить текст "+expected+". А получил "+
                        actual+".");

    }

    }


