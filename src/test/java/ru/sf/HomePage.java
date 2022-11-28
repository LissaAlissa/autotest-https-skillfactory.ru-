package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final String URL =  "https://skillfactory.ru/";
    private static final String ELEMENT_FREE ="tn-elem__4567460551658239202580";
    private static final String ALL_COURSES ="tn-elem__4567460551563735937155";
    private static final String HOME_PAGE ="//h1[@field='tn_text_1563735741705']";
    private static final String BUTTON_COOPERATION_ELEMENT ="tn-elem__4567460551658239202594";
    private static final String DATA_SCIENCE_ELEMENT ="tn-elem__4567460551656076073860";
    private static final String DATA_ANALYTICS_ELEMENT ="tn-elem__4567460551656076132280";
    private static final String PROGRAMMING_ELEMENT ="tn-elem__4567460551656076157308";
    private static final String FREE_MATERIAL_ELEMENT ="tn-elem__4567460551563737497747";
    private static final String ANALITIKA_DANNYH_ELEMENT ="tn-elem__4681130601654780343712";
    private static final String WEB_RAZRABOTKA_ELEMENT ="tn-elem__4681130601654780325725";
    private static final String TESTIROVVANIE_ELEMENT ="tn-elem__4681130601654780349484";
    private static final String RAZRABOTKA_IGR_ELEMENT ="tn-elem__4681130601654780368239";
    private static final String START_ELEMENT ="tn-elem__4567460681659344216624";
    private static final String REVIEWS_ELEMENT ="tn-elem__4567460981571744402023";
    private static final String READ_STORY_ELEMENT ="tn-elem__4572199691654866036754";



    private final WebDriver webDriver;


    public HomePage(org.openqa.selenium.WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void go() {webDriver.get(URL);}
    public void FindElementFree() {
        webDriver.findElement(By.className(ELEMENT_FREE)).click();
    }
    public void FindElementAllCourses() {
        webDriver.findElement(By.className(ALL_COURSES )).click();
    }
    public String getHomePage() {
        return webDriver.findElement(By.xpath(HOME_PAGE)).getText();
    }
    public void FindElementButtonCooperation() {
        webDriver.findElement(By.className(BUTTON_COOPERATION_ELEMENT)).click();
    }
    public void FindElementButtonDataScience() {
        webDriver.findElement(By.className(DATA_SCIENCE_ELEMENT)).click();
    }
    public void FindElementButtonDataAnalytics() {
        webDriver.findElement(By.className(DATA_ANALYTICS_ELEMENT)).click();
    }
    public void FindElementButtonProgramming() {
        webDriver.findElement(By.className(PROGRAMMING_ELEMENT)).click();
    }
    public void FindElementButtonFreeMaterials() {
        webDriver.findElement(By.className(FREE_MATERIAL_ELEMENT)).click();
    }
    public void FindElementButtonAnalitikaDannyh() {
        webDriver.findElement(By.className(ANALITIKA_DANNYH_ELEMENT)).click();
    }
    public void FindElementButtonWebRazrabotka() {
        webDriver.findElement(By.className(WEB_RAZRABOTKA_ELEMENT )).click();
    }
    public void FindElementButtonTestirovanie() {
        webDriver.findElement(By.className(TESTIROVVANIE_ELEMENT)).click();
    }
    public void FindElementButtonRazrabotkaIgr() {
        webDriver.findElement(By.className(RAZRABOTKA_IGR_ELEMENT)).click();
    }
    public void FindElementButtonStart() {
        webDriver.findElement(By.className(START_ELEMENT)).click();
    }
    public void FindElementButtonReviews() {
        webDriver.findElement(By.className(REVIEWS_ELEMENT)).click();
    }
    public void FindElementButtonReadStory() {
        webDriver.findElement(By.className(READ_STORY_ELEMENT)).click();
    }



}
