package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
    @Given("I I have a search filed on Amazon Page")
    public void i_i_have_a_search_filed_on_amazon_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello world");
    }
    @When("I search for a project with name {string} and price {int}")
    public void i_search_for_a_project_with_name_and_price(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello world 2");
    }
    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello world 3");
    }
}
