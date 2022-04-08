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

        //запишем переменные
        String userfirstName = "Ivan";
        String userlastName = "Ivanov";
        String userEmail = "Ivanov1337@gmail.com";
        String userphonenumber = "6666666655";
        String useraddress = "123 street";
        String userstate = "Uttar Pradesh";
        String usercity = "Agra";

        //open test site
        open("https://demoqa.com/automation-practice-form");

        //set value
        $("#firstName").setValue(userfirstName);
        $("#lastName").setValue(userlastName);
        $("#userEmail").setValue(userEmail);
        $("[for=\"gender-radio-3\"]").click();
        $("#userNumber").setValue(userphonenumber);
        $("#dateOfBirthInput").click();
        $x("//select[@class=\"react-datepicker__month-select\"]//option[@value=\"4\"]").click();
        $x("//select[@class=\"react-datepicker__year-select\"]//option[@value=\"1989\"]").click();
        $x("//div[@class=\"react-datepicker__week\"]//div[text()=\"11\"]").click();
        $x("//input[@id=\"subjectsInput\"]").setValue("En").pressEnter();
        $x("//input[@id=\"subjectsInput\"]").setValue("Ma").pressEnter();
        $("[for=\"hobbies-checkbox-1\"]").click();
        $("[for=\"hobbies-checkbox-2\"]").click();
        $("[for=\"hobbies-checkbox-3\"]").click();
        $("#currentAddress").setValue(useraddress);
        $("#state").click();
        $("#stateCity-wrapper").$(byText(userstate)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(usercity)).click();
        $("#submit").click();
        TimeUnit.SECONDS.sleep(2); //просто увидеть значения

        //test result table
        $x("//td[text()='Student Name']").parent().shouldHave(text(userfirstName + " " + userlastName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(userEmail));
        $x("//td[text()='Gender']").parent().shouldHave(text("Other"));
        $x("//td[text()='Mobile']").parent().shouldHave(text(userphonenumber));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text("11 May,1989"));
        $x("//td[text()='Subjects']").parent().shouldHave(text("English, Maths"));
        $x("//td[text()='Hobbies']").parent().shouldHave(text("Sports, Reading, Music"));
        $x("//td[text()='Address']").parent().shouldHave(text(useraddress));
        $x("//td[text()='State and City']").parent().shouldHave(text(userstate + " " + usercity));
    }
}