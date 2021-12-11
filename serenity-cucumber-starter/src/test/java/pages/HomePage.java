package pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
    n11HomePage n11Page;
    @Step
    public  void verifyOpenSite(){
        n11Page.verifyOpenSite();
    }
}
