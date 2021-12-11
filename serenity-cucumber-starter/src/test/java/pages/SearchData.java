package pages;

import net.thucydides.core.annotations.Step;

public class SearchData {
    LocatorSearchData data;

    @Step
    public  void searchByKeywordInN11shoppingData(String keyword){
    data.searchByKeywordInN11shoppingData(keyword);
    }

    @Step
    public  void shouldHaveCheapestProduct(){
    data.shouldHaveCheapestProduct();
    }

}
