package denis.timushev;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class searchJUnit5InSoftAssertions {

    @Test
    void searchJUnit5Code() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").should(text("Soft assertions"));
        $(".markdown-body").$(withText("Soft assertions")).click();
        $(".markdown-body").shouldBe(text("<div id='first' style='display:none;'>First</div>"));
        $(".markdown-body").shouldBe(text("$(\"#first\").should(visible).click();"));
    }
}
