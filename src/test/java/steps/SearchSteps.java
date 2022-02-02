package steps;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {
    private Product product;
    private Search search;
    @Given("I I have a search filed on Amazon Page")
    public void i_i_have_a_search_filed_on_amazon_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello world");
    }
    @When("I search for a project with name {string} and price {int}")
    public void i_search_for_a_project_with_name_and_price(String productName, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello world 2");
        product = new Product(productName, price);
    }
    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello world 3");
        this.search = new Search();
        String name = this.search.displayProduct(this.product);
        System.out.println(name);
        Assert.assertEquals(name, productName);
    }
}
