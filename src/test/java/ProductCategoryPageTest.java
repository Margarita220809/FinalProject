
import base.BaseTest;
import org.testng.annotations.Test;


public class ProductCategoryPageTest extends BaseTest {
    @Test
    public void pageTitleWork() {
        productCategoryPage.openPage();
        String title = "≡ Дитячі ліжка ᐈ Купити дитяче ліжечко в Україні - ціна, відгуки на PAMPIK";
        productCategoryPage.checkPageTitle(title);
    }
    @Test
    public void paginationWork(){
        productCategoryPage.openPage();
        productCategoryPage.checkPaginationClick("https://pampik.com/ua/category/detskie-krovatki-i-kolyibeli/page/2");
    }
    @Test
    public void productDescriptionWork(){
        productCategoryPage.openPage();
        productCategoryPage.checkProductClick("https://pampik.com/ua/category/detskie-krovatki-i-kolyibeli/page/2");
    }
}