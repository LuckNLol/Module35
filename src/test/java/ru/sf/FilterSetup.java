package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterSetup {

    private final static String CHOOSE_PROPER_FILTER = ".dropdown-filter__btn--sorter";
    private final static String SORT_GOODS = ".filter__item:nth-child(4) .radio-with-text__text";
    private final static String GET_FIRST_ELEMENT = "#c96087095 .product-card__img-wrap";
    private final static String PRODUCT_ID = "#productNmId";

    private final WebDriver driver;
    public FilterSetup(WebDriver driver) {
        this.driver = driver;
    }

    public void properFilterClick() {
        WebElement filterClick = driver.findElement(By.cssSelector(CHOOSE_PROPER_FILTER));
        filterClick.click();
    }

    public void sortPriceByDecrease() {
        WebElement sortSelect = driver.findElement(By.cssSelector(SORT_GOODS));
        sortSelect.click();
    }

    public void choose_first_element() {
        WebElement firstCard = driver.findElement(By.cssSelector(GET_FIRST_ELEMENT));
        firstCard.click();
    }

    public String getProductIdNumber() {
        String currentGoodId = driver.findElement(By.cssSelector(PRODUCT_ID)).getText();
        return currentGoodId;
    }

}
