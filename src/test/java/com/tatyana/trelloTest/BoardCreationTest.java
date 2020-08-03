package com.tatyana.trelloTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {

    @Test
    public void boardCreationTest(){
        clickLoginButton();
        fillEmailForm("rochman.elena@gmail.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickLoginWithAtlassian();
        fillPasswordForm("12345.com");
        clickSubmitLogin();

        clickOnPlusButton();
        cliclCreateBoard();
        fillBoardForm();
        submitBoardCreationBoard();
    }



}
