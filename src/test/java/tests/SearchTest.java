package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    public void googleSearchString () {
        //open link
        open("https://google.com");
        //input text for search
        $(byName("q")).val("Debit card").pressEnter();
        //assert text
        $("html").shouldHave(text("Debit card"));
    }
    
    @Test
    public void yandexSearchTest () {
        //open link
        open("https://ya.ru");
        //input text for search
        $(".search2__input input").val("Debit card").pressEnter();
        //assert text
        $("ul#search-result").shouldHave(text("Debit card"));
    }
}
