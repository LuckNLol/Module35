package ru.sf;

/* Реализуем 2 метода: Выбрать сайт и выбрать категорию товара */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChooseWebPage {
    private static final String URL = "https://www.wildberries.ru/";
    private static final String SEARCH_CATEGORY = "searchInput";
    private final WebDriver driver;
    public ChooseWebPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get(URL);
    }

    public void chooseGoodsCategory(String goodsCategory) {
        WebElement searchField = (new WebDriverWait(driver, Duration.ofSeconds(2)).
                until(ExpectedConditions.presenceOfElementLocated(By.id(SEARCH_CATEGORY))));
        searchField.sendKeys(goodsCategory);
        searchField.sendKeys(Keys.ENTER);

    }

}
