package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllCourses {
    private final WebDriver webDriver;
    private static final String ALL_COURSES_PAGE ="//*[@id=\"rec507072275\"]/div/div/div/h1";
    private static final String CORPORATE_TRAINING_ELEMENT ="tn-elem__4693509551613396199965";
    private static final String LOGO_ELEMENT ="//img[@imgfield='tn_img_1595239686685']";
    private static final String BUTTON_CONTACT_ELEMENT ="tn-elem__4693509551613396199943";
    private static final String SOZDANIE_SAYTOV_ELEMENT ="//*[@id=\"rec507070798\"]/div/div/div/div/div[15]/a";
    private static final String COURSE_PHP_ELEMENT ="//*[@id=\"rec506872521\"]/div/div/div/div[2]/div[9]/a";



    public AllCourses(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public String getAllCoursesPage() {
        return webDriver.findElement(By.xpath(ALL_COURSES_PAGE)).getText();
    }
    public void FindElementCorporateTraining() { webDriver.findElement(By.className(CORPORATE_TRAINING_ELEMENT)).click(); }
    public void FindElementLogo() { webDriver.findElement(By.xpath(LOGO_ELEMENT)).click(); }
    public void FindElementButtonContact() { webDriver.findElement(By.className(BUTTON_CONTACT_ELEMENT)).click(); }
    public void FindElementSozdanieSaytov() { webDriver.findElement(By.xpath(SOZDANIE_SAYTOV_ELEMENT)).click(); }
    public void FindElementCoursesPhp() {
        webDriver.findElement(By.xpath(COURSE_PHP_ELEMENT)).click();
    }






}
