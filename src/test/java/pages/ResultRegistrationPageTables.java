package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ResultRegistrationPageTables {

    public ResultRegistrationPageTables checkStudentName(String userFirstName, String userLastName) {
        $x("//td[text()='Student Name']").parent().shouldHave(text(userFirstName + " " + userLastName));
        System.out.println("Check Student Name: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentEmail(String userEmail) {
        $x("//td[text()='Student Email']").parent().shouldHave(text(userEmail));
        System.out.println("Check Student Email: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentGender(String Gender) {
        $x("//td[text()='Gender']").parent().shouldHave(text(Gender));
        System.out.println("Check Student Gender: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentMobile(String userPhoneNumber) {
        $x("//td[text()='Mobile']").parent().shouldHave(text(userPhoneNumber));
        System.out.println("Check Student Mobile: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentDateOfBirth(String DateOfBirth) {
        $x("//td[text()='Date of Birth']").parent().shouldHave(text(DateOfBirth));
        System.out.println("Check Student Date Of Birth: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentSubjects(String Subjects) {
        $x("//td[text()='Subjects']").parent().shouldHave(text(Subjects));
        System.out.println("Check Student Subjects: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentHobbies(String Hobbies) {
        $x("//td[text()='Hobbies']").parent().shouldHave(text(Hobbies));
        System.out.println("Check Student Hobbies: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentAddress(String userAddress) {
        $x("//td[text()='Address']").parent().shouldHave(text(userAddress));
        System.out.println("Check Student Address: OK");
        return this;
    }

    public ResultRegistrationPageTables checkStudentStateAndCity(String userState, String userCity) {
        $x("//td[text()='State and City']").parent().shouldHave(text(userState + " " + userCity));
        System.out.println("Check Student StateAndCity: OK");
        return this;
    }
}
