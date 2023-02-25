package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {
    public static final WebDriver driver;
    public static final ChooseWebPage CHOOSE_WEB_PAGE;
    public static final FilterSetup MANAGE_FILTER;

    //Инициализация ресурсов
    static {
        driver = new ChromeDriver();
        driver .manage().window().maximize();
        driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        CHOOSE_WEB_PAGE = new ChooseWebPage(driver);
        MANAGE_FILTER = new FilterSetup(driver);
    }

    // Выполнение сценария
        @Given("url {string}")
        public void url(String url) {
            CHOOSE_WEB_PAGE.goToPage();
        }

        @When("website is open start search {string}")
        public void website_is_open_start_search(String searchParam) {
            CHOOSE_WEB_PAGE.chooseGoodsCategory(searchParam);
        }

        @Then("choose price option dropdown {string}")
        public void choose_price_option_dropdown(String string) {
            MANAGE_FILTER.properFilterClick();
        }

        @Then("select price option {string}")
        public void select_price_option(String string) {
            MANAGE_FILTER.sortPriceByDecrease();
        }

        @Then("choose first element {string}")
        public void choose_first_element(String string) {
            MANAGE_FILTER.choose_first_element();
        }

        @Then("assert that proper article is {string}")
        public void assert_that_proper_article_is(String expectedGoodId) {
            String currentGoodId = MANAGE_FILTER.getProductIdNumber();
            assertEquals(expectedGoodId, currentGoodId);
        }

}
