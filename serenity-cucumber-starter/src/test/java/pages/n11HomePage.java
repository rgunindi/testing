package pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("https://www.n11.com/")
public class n11HomePage extends PageObject {
    public void verifyOpenSite(){
        String title=getDriver().getTitle();
        Assert.assertTrue(title,title=="n11.com - Hayat Sana Gelir");
    }
}
