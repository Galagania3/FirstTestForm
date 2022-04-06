import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class exampletest1 {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillStudentRegistrationForm() {

        //open page
        open("https://demoqa.com/automation-practice-form");

        //fill name
        $("#firstName").setValue("Tony");

        //fill last name
        $x("//*[@id='lastName']").setValue("Stark");

        //fill email
        $("#userEmail").setValue("TonyStark@gmail.com");

        //choose gender
        $x("//*[@id='genterWrapper']//*[@for='gender-radio-3']").click();

        //fill mobile number
        $("#userNumber").setValue("8800555353");

        //fill address
        $("#currentAddress").setValue("Pushkina street, Kolotushkina fleet");

        //scroll into view submit button
        $("#submit").scrollIntoView(true);

        //click submit
        $("#submit").click();

        //check successful popup header
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        //check submitting form name
        $x("//*[contains(text(),'Student Name')]//..").shouldHave(text("Tony Stark"));

        //check submitting form email
        $x("//*[contains(text(),'Student Email')]//..").shouldHave(text("TonyStark@gmail.com"));

        //check submitting form mobile
        $x("//*[@class='table-responsive']//td[contains(text(),'Mobile')]//..").shouldHave(text("8800555353"));

        //check submitting form address
        $x("//*[@class='table-responsive']//td[contains(text(),'Address')]//..").shouldHave(text("Pushkina street, Kolotushkina fleet"));

    }

}