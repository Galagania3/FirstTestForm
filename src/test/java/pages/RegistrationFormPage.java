package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    public RegistrationFormPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String userFirstName) {
        $("#firstName").setValue(userFirstName);
        return this;
    }

    public RegistrationFormPage setLastName(String userLastName) {
        $("#lastName").setValue(userLastName);
        return this;
    }

    public RegistrationFormPage setEmail(String userEmail) {
        $("#userEmail").setValue(userEmail);
        return this;
    }

    public RegistrationFormPage setGender() {
        $("[for=\"gender-radio-3\"]").click();
        return this;
    }

    public RegistrationFormPage setPhoneNumber(String userPhoneNumber) {
        $("#userNumber").setValue(userPhoneNumber);
        return this;
    }

    public RegistrationFormPage setDateOfBirth() {
        $("#dateOfBirthInput").click();
        $x("//select[@class=\"react-datepicker__month-select\"]//option[@value=\"4\"]").click();
        $x("//select[@class=\"react-datepicker__year-select\"]//option[@value=\"1989\"]").click();
        $x("//div[@class=\"react-datepicker__week\"]//div[text()=\"11\"]").click();
        return this;
    }

    public RegistrationFormPage setSubjects() {
        $x("//input[@id=\"subjectsInput\"]").setValue("En").pressEnter();
        $x("//input[@id=\"subjectsInput\"]").setValue("Ma").pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbies() {
        $("[for=\"hobbies-checkbox-1\"]").click();
        $("[for=\"hobbies-checkbox-2\"]").click();
        $("[for=\"hobbies-checkbox-3\"]").click();
        return this;
    }

    public RegistrationFormPage setCurrentAddress(String userAddress) {
        $("#currentAddress").setValue(userAddress);
        return this;
    }

    public RegistrationFormPage setState(String userState) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(userState)).click();
        return this;
    }

    public RegistrationFormPage setCity(String userCity) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(userCity)).click();
        return this;
    }

    public RegistrationFormPage setSubmit() {
        $("#submit").click();
        return this;
    }
}
