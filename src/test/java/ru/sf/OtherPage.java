package ru.sf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OtherPage {
    private final WebDriver webDriver;

    private static final String CORPORATE_TRAINING_PAGE ="//h2[@field='tn_text_1639036757251']";
    private static final String CONTACT_PAGE ="//h1[@field='tn_text_1568973323410']";
    private static final String SOZDANIE_SAYTOV_PAGE ="//h1[@field='title']";
    private static final String COURSE_PHP_PAGE ="//h1[@field='title']";
    private static final String COOPERATION_PAGE ="//div[@field='tn_text_1634652593877']";
    private static final String DATA_SCIENCE_PAGE ="//*[@id=\"rec503870348\"]/div/div/div/h1";
    private static final String DATA_ANALYTICS_PAGE ="//*[@id=\"rec506787641\"]/div/div/div/h1";
    private static final String PROGRAMMING_PAGE ="//*[@id=\"rec506831144\"]/div/div/div/h1";
    private static final String ANALITIKA_DANNYH_PAGE ="//h1[@field='title']";
    private static final String WEB_RAZRABOTKA_PAGE ="//h1[@field='title']";
    private static final String TESTIROVVANIE_PAGE ="//h1[@field='title']";
    private static final String RAZRABOTKA_IGR_PAGE ="//h1[@field='title']";
    private static final String START_PAGE ="//h1[@field='tn_text_1650022405403']";
    private static final String REVIEWS_PAGE ="//h1[@field='btitle']";
    private static final String READ_STORY_PAGE ="//h1[@class='entry-title']";
    private static final String ASK_ELEMENT ="//*[@id=\"menu-item-15090\"]/a";
    private static final String ASK_PAGE = "//h1[@class='page-title']";



    public OtherPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getAllCoursesPage() {
        return webDriver.findElement(By.xpath(CORPORATE_TRAINING_PAGE)).getText();
    }

    public String getCotactPage() {
        return webDriver.findElement(By.xpath(CONTACT_PAGE)).getText();
    }

    public String getSozdanieSaytovPage() {
        return webDriver.findElement(By.xpath(SOZDANIE_SAYTOV_PAGE)).getText();
    }

    public String getCoursesPhpPage() {
        return webDriver.findElement(By.xpath(COURSE_PHP_PAGE)).getText();
    }
    public String getCooperationPage() {
        return webDriver.findElement(By.xpath(COOPERATION_PAGE)).getText();
    }
    public String getDataSciencePage() {
        return webDriver.findElement(By.xpath(DATA_SCIENCE_PAGE)).getText();
    }
    public String getDataAnalyticsPage() {
        return webDriver.findElement(By.xpath(DATA_ANALYTICS_PAGE)).getText();
    }
    public String getProgrammingPage() {
        return webDriver.findElement(By.xpath(PROGRAMMING_PAGE)).getText();
    }
    public String getAnalitikaDannyhPage() {
        return webDriver.findElement(By.xpath(ANALITIKA_DANNYH_PAGE)).getText();
    }
    public String getWebRazrabotkaPage() {
        return webDriver.findElement(By.xpath(WEB_RAZRABOTKA_PAGE)).getText();
    }
    public String getTestirovaniePage() {
        return webDriver.findElement(By.xpath(TESTIROVVANIE_PAGE)).getText();
    }
    public String getRazrabotkaIgrPage() {
        return webDriver.findElement(By.xpath(RAZRABOTKA_IGR_PAGE)).getText();
    }
    public String getStartPage() {
        return webDriver.findElement(By.xpath(START_PAGE)).getText();
    }
    public String getReviewsPage() {
        return webDriver.findElement(By.xpath(REVIEWS_PAGE)).getText();
    }
    public String getReadStoryPage() {
        return webDriver.findElement(By.xpath(READ_STORY_PAGE)).getText();
    }
    public void FindElementAsk() {
        webDriver.findElement(By.xpath(ASK_ELEMENT)).click();
    }
    public String getAskPage() {
        return  webDriver.findElement(By.xpath(ASK_PAGE)).getText();
    }



}
