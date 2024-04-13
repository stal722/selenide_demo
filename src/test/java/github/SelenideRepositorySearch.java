package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        $("[data-target='qbsearch-input.inputButton']").click();
        $("[data-target='query-builder.input']").setValue("selenide").pressEnter();
        $$("[data-hpc=true]").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide"));
    }
}
