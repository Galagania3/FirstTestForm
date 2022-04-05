import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstAutotestForm {

    @BeforeAll
    static void Test22 () {
        Configuration.startMaximized = true;
    }

    @Test
    void Test321 () {
        //open test site
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("Ivanov1337@gmail.com");
        $("[for=\"gender-radio-3\"]").click();
        //$("#gender-radio-1").click();
        $("#userNumber").setValue("6666666655");
        $("#dateOfBirthInput").setValue("12 Jan 1989");
        $("#subjects-label").click();
        $("[for=\"hobbies-checkbox-1\"]").click();
        $("[for=\"hobbies-checkbox-2\"]").click();
        $("[for=\"hobbies-checkbox-3\"]").click();
        //$("#hobbies-checkbox-1").click();
        //$("#hobbies-checkbox-2").click();
        //$("#hobbies-checkbox-3").click();
        $("#currentAddress").setValue("123 street");
        $("#state").$(".css-1uccc91-singleValue").setValue("Uttar Pradesh");
        //$("#state").setValue("Uttar Pradesh");
        $("#city").setValue("Delhi");
    }
}


//class=" css-1uccc91-singleValue"   css-1uccc91-singleValue
