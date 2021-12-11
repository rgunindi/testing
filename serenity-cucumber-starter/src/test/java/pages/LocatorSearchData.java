package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
public class LocatorSearchData extends PageObject {
    public  void searchByKeywordInN11shoppingData(String keyword){
        $(By.id("searchData")).typeAndEnter(keyword);
    }
    public  void shouldHaveCheapestProduct(){
    //
    }
}
