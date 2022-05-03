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
        $("[id=wiki-pages-filter").setValue("SoftAssertions");
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldBe(text("<div id='first' style='display:none;'>First</div>"));
        $(".markdown-body").shouldBe(text("$(\"#first\").should(visible).click();"));
    }
}
