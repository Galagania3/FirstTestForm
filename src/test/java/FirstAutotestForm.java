import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstAutotestForm {

    @BeforeAll
    static void Test22 () {
        Configuration.startMaximized = true;
    }

    @Test
    void Test321 () throws InterruptedException {
        //open test site
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("Ivanov1337@gmail.com");
        $("[for=\"gender-radio-3\"]").click();
        //$("#gender-radio-1").click();
        $("#userNumber").setValue("6666666655");
        $("#dateOfBirthInput").setValue("12 Jan 1989").pressEnter();
        //$("#subjects-label").click();
        $("[for=\"hobbies-checkbox-1\"]").click();
        $("[for=\"hobbies-checkbox-2\"]").click();
        $("[for=\"hobbies-checkbox-3\"]").click();
        //$("#hobbies-checkbox-1").click();
        //$("#hobbies-checkbox-2").click();
        //$("#hobbies-checkbox-3").click();
        //$("#currentAddress").setValue("123 street");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
        //$("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
        //TimeUnit.SECONDS.sleep(2);
        //$("#react-select-4-input").setValue("Delhi").pressEnter();
        //$(".css-1hwfws3").$(".css-1uccc91-singleValue").setValue("Uttar Pradesh");
        //$("#state").setValue("Uttar Pradesh");
        //$("#city").setValue("Delhi");
        //TimeUnit.SECONDS.sleep(3);
        $("#submit").click();
        TimeUnit.SECONDS.sleep(3);
        //$("#subjects-label").pressEnter();
        //$("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));


        $(".modal-body") .$(".tbody") .$()
    }
}


//class=" css-1uccc91-singleValue"   css-1uccc91-singleValue    react-select-4-input//
//$x("//td[text()='Student Name']").parent().shouldHave(text("Ivan Ivanov"));