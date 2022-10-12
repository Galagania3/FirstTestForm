package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;
import pages.ResultRegistrationPageTables;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static test.TestData.*;

public class FirstAutotestFormWithPageObjects {

    @BeforeAll
    static void Test22() {
        Configuration.startMaximized = true;
    }

    @Test
    void Test321() throws InterruptedException {
        RegistrationFormPage registrationFormPage = new RegistrationFormPage();
        ResultRegistrationPageTables resultRegistrationPageTables = new ResultRegistrationPageTables();

        //set value
        registrationFormPage.openPage()
                .setFirstName(USER_FIRST_NAME)
                .setLastName(USER_LAST_NAME)
                .setEmail(USER_EMAIL)
                .setGender()
                .setPhoneNumber(USER_PHONE_NUMBER)
                .setDateOfBirth()
                .setSubjects()
                .setHobbies()
                .setCurrentAddress(USER_ADRESS)
                .setState(USER_STATE)
                .setCity(USER_CITY)
                .setSubmit();
        TimeUnit.SECONDS.sleep(4); //просто увидеть значения

        //test result table
        resultRegistrationPageTables.checkStudentName(USER_FIRST_NAME, USER_LAST_NAME)
                .checkStudentEmail(USER_EMAIL)
                .checkStudentGender(USER_GENDER)
                .checkStudentMobile(USER_PHONE_NUMBER)
                .checkStudentDateOfBirth(DATE_OF_BIRTH)
                .checkStudentSubjects(USER_SUBJECTS)
                .checkStudentHobbies(USER_HOBBIES)
                .checkStudentAddress(USER_ADRESS)
                .checkStudentStateAndCity(USER_STATE, USER_CITY);
    }
}