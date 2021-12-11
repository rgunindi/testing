package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.SearchData;

public class OpenN11andSearchWord {
    @Steps
    HomePage home;
    @Steps
    SearchData search;

    @Given("customer is open the n11 html main page")
    public void customer_is_open_the_n11_html_main_page() {
    home.verifyOpenSite();
    }
    @When("customer search {string}")
    public void customerSearch(String string) {
        search.searchByKeywordInN11shoppingData(string);

    }
    @When("customer Sees {string} prices")
    public void customer_sees_prices(String string) {
    }

    @Then("customer Adds the cheapest {string} to the shopping cart")
    public void customer_adds_the_cheapest_to_the_shopping_cart(String string) {
    search.shouldHaveCheapestProduct();
    }


}
