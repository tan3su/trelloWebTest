package com.tatyana.trelloTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://trello.com/");
    }

    public void clickSubmitLogin() {
        click(By.cssSelector("#login-submit"));
    }

    public void fillPasswordForm(String password) {
        type(By.cssSelector("#password"), password);
    }

    public void clickLoginWithAtlassian() {
        click(By.cssSelector("#login"));
    }

    public void fillEmailForm(String email) {
        type(By.cssSelector("#user"), email);
    }

    public void clickLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }

    public void type(By by, String text) {
        click(by);
        wd.findElement(by).clear();
        wd.findElement(by).sendKeys(text);
    }

    public void click(By by) {
        wd.findElement(by).click();
    }

    public void submitBoardCreationBoard() {
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));
    }

    public void fillBoardForm() {
        type(By.cssSelector("[data-test-id='create-board-title-input']"), "Test2");
    }

    public void cliclCreateBoard() {
        click(By.cssSelector("[data-test-id='header-create-board-button']"));
    }

    public void clickOnPlusButton() {
        click(By.cssSelector("[name='add']"));

    }

}


