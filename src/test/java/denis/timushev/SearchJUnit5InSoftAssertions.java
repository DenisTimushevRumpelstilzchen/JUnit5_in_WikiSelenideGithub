package denis.timushev;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchJUnit5InSoftAssertions {

    @Test
    void searchJUnit5Code() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("[id=wiki-pages-filter]").setValue("SoftAssertions");
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
        $(".markdown-body").shouldHave(text("$(\"#first\").should(visible).click();"));
    }
}
