package com.tatyana.trelloTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


    @Test
    public void testLogin() throws InterruptedException {

        clickLoginButton();
        fillEmailForm("rochman.elena@gmail.com");
        Thread.sleep(2000);

        clickLoginWithAtlassian();
        fillPasswordForm("12345.com");

        clickSubmitLogin();


    }



}
