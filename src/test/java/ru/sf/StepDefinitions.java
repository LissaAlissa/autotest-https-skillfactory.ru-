package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {
    public static final WebDriver webDriver;
    private static final HomePage homePage;
    private static final AllCourses allCourses;
    private static final OtherPage otherPage;



    //Процесс инициализации необходимых ресурсов
    static {
        System.setProperty("webdriver.chrome.driver", "D:\\stady\\project_38.1\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        webDriver.manage().window().maximize();
        homePage = new HomePage(webDriver);
        allCourses = new AllCourses(webDriver);
        otherPage = new OtherPage(webDriver);

    }
    @Given("url of site  {string}")
    public void url_of_site(String url) {
        homePage.go();
    }


//   1 кликнуть по кнопке в нав панели бесплатно
    @When("website is open click the button Free")
    public void website_is_open_click_the_button_free() {
        homePage.FindElementFree();
    }

    @When("Open page {string}")
    public void open_page(String expectedPage) {
        final var actaulPage  = webDriver.findElement(By.xpath("//h1[@field='tn_text_1638163298616']")).getText();
        assertEquals(expectedPage, actaulPage);
    }


//  2 при нажатии кнопки  Все курсы
    @When("website is open click the button All courses")
    public void website_is_open_click_the_button_all_courses() {
        homePage.FindElementAllCourses();
    }
    @When("Open All courses {string}")
    public void open_all_courses(String expectedPageAllCourses) {
        final var actaulPageAllCourses  = allCourses.getAllCoursesPage();
        assertEquals(expectedPageAllCourses, actaulPageAllCourses);
    }


//  3  кликнуть по кнопке в нав панели Корпоративное обучение
    @When("website is open click the button Corporate training")
    public void website_is_open_click_the_button_corporate_training() {
        allCourses.FindElementCorporateTraining();
    }
    @When("Open {string}")
    public void open(String expectedPageTwo) {
        final var actaulPageTwo  = otherPage.getAllCoursesPage();
        assertEquals(expectedPageTwo, actaulPageTwo);
    }


//  4 кликнуть по лого и вернуться на главную страницу
    @Then("click logo")
    public void click_logo() {
        allCourses.FindElementLogo();
    }
    @Then("Open main page {string}")
    public void open_main_page(String expectedMainPage) {
        final var actaulMainPage  = homePage.getHomePage();
        assertEquals(expectedMainPage, actaulMainPage);
    }


// 5 Нажатие кнопки Контакты
    @Then("website is open click the button Contacts")
    public void website_is_open_click_the_button_contacts() {
        allCourses.FindElementButtonContact();
    }
    @Then("Open Contacts {string}")
    public void open_contacts(String expectedPageContacts) {
        final var actaulPageContacts  = otherPage.getCotactPage();
        assertEquals(expectedPageContacts, actaulPageContacts);
    }


// 6 Нажатие кнопки Создание сайтов на странице Все курсы
    @When("website is open click the button Sozdanie Saytov")
    public void website_is_open_click_the_button_sozdanie_saytov() {
        allCourses.FindElementSozdanieSaytov();
    }
    @When("Open Sozdanie Saytov {string}")
    public void open_sozdanie_saytov(String expectedPageSozdanieSaytov) {
        final var actaulPageSozdanieSaytov  = otherPage.getSozdanieSaytovPage();
        assertEquals(expectedPageSozdanieSaytov, actaulPageSozdanieSaytov);
    }


// 7 Нажатие кнопки Курсы PHP  на странице Создание сайтов
    @Then("website is open click the button Courses Php")
    public void website_is_open_click_the_button_courses_php() {
        allCourses.FindElementCoursesPhp();
    }
    @Then("Open Courses Php {string}")
    public void open_courses_php(String expectedPageCoursesPhp) {
        final var actaulPageCoursesPhp  = otherPage.getCoursesPhpPage();
        assertEquals(expectedPageCoursesPhp, actaulPageCoursesPhp);
    }


// 8  кликнуть по кнопке в нав панели сотрудничество
    @When("website is open click the button Cooperation")
    public void website_is_open_click_the_button_Cooperation() {
        homePage.FindElementButtonCooperation();
    }
    @When("Open Cooperation {string}")
    public void open_cooperation(String expectedPageCooperation) {
        final var actaulPageCooperation  = otherPage.getCooperationPage();
        assertEquals(expectedPageCooperation, actaulPageCooperation);
    }


//  9  Нажатие кнопки Data Science
    @When("website is open click the button Data Science")
    public void website_is_open_click_the_button_data_science() {
        homePage.FindElementButtonDataScience();
    }
    @When("Open Data Science {string}")
    public void open_data_science(String expectedPageData) {
        final var actaulPageData  = otherPage.getDataSciencePage();
        assertEquals(expectedPageData, actaulPageData);
    }


//  10  Нажатие кнопки Аналитика данных
    @When("website is open click the button Data Analytics")
    public void website_is_open_click_the_button_data_analytics() {
        homePage.FindElementButtonDataAnalytics();
    }
    @When("Open Data Analytics {string}")
    public void open_data_analytics(String expectedPageAnalytics) {
        final var actaulPageAnalytics  = otherPage.getDataAnalyticsPage();
        assertEquals(expectedPageAnalytics, actaulPageAnalytics);
    }


//  11  Нажатие кнопки Программирование
    @When("website is open click the button Programming")
    public void website_is_open_click_the_button_programming() {
        homePage.FindElementButtonProgramming();
    }
    @When("Open Programming {string}")
    public void open_programming(String expectedPageProgramming) {
        final var actaulPageProgramming  = otherPage.getProgrammingPage();
        assertEquals(expectedPageProgramming, actaulPageProgramming);
    }


//  12  Нажатие кнопки бесплатные материалы Free Materials
    @When("website is open click the button Free Materials")
    public void website_is_open_click_the_button_free_materials() {
        homePage.FindElementButtonFreeMaterials();
    }


//  13 Нажатие кнопки Аналитика
    @When("website is open click the button Analitika Dannyh")
    public void website_is_open_click_the_button_analitika_dannyh() {
        homePage.FindElementButtonAnalitikaDannyh();
    }
    @When("Open Analitika Dannyh {string}")
    public void open_analitika_dannyh(String expectedPageAnalitikaDannyh) {
        final var actaulPageAnalitikaDannyh  = otherPage.getAnalitikaDannyhPage();
        assertEquals(expectedPageAnalitikaDannyh, actaulPageAnalitikaDannyh);
    }


//  14  Нажатие кнопки веб-разработке
    @When("website is open click the button Web Razrabotka")
    public void website_is_open_click_the_button_web_razrabotka() {
        homePage.FindElementButtonWebRazrabotka();
    }
    @When("Open Web Razrabotka {string}")
    public void open_web_razrabotka(String expectedPageWebRazrabotka) {
        final var actaulPageWebRazrabotka  = otherPage.getWebRazrabotkaPage();
        assertEquals(expectedPageWebRazrabotka, actaulPageWebRazrabotka);
    }


//  15 Нажатие кнопки тестирование
    @When("website is open click the button Testirovanie")
    public void website_is_open_click_the_button_testirovanie() {
        homePage.FindElementButtonTestirovanie();
    }
    @When("Open Testirovanie {string}")
    public void open_testirovanie(String expectedPageTestirovanie) {
        final var actaulPageTestirovanie  = otherPage.getTestirovaniePage();
        assertEquals(expectedPageTestirovanie, actaulPageTestirovanie);
    }


//  16 Нажатие кнопки разработка игр
    @When("website is open click the button Razrabotka Igr")
    public void website_is_open_click_the_button_razrabotka_igr() {
       homePage.FindElementButtonRazrabotkaIgr();
    }
    @When("Open Razrabotka Igr {string}")
    public void open_razrabotka_igr(String expectedPageRazrabotkaIgr) {
        final var actaulPageRazrabotkaIgr  = otherPage.getRazrabotkaIgrPage();
        assertEquals(expectedPageRazrabotkaIgr, actaulPageRazrabotkaIgr);
    }


//  17 Нажатие кнопки «Надёжный старт в IT»
    @When("website is open click the button Start")
    public void website_is_open_click_the_button_start() {
        homePage.FindElementButtonStart();
    }
    @When("Open Start {string}")
    public void open_start(String expectedPageStart) {
        final var actaulPageStart  = otherPage.getStartPage();
        assertEquals(expectedPageStart, actaulPageStart);
    }


//  18 Нажатие кнопки Отзывы студентов
    @When("website is open click the button Reviews")
    public void website_is_open_click_the_button_reviews() {
        homePage.FindElementButtonReviews();
    }
    @When("Open Reviews {string}")
    public void open_reviews(String expectedPageReviews) {
        final var actaulPageReviews  = otherPage.getReviewsPage();
        assertEquals(expectedPageReviews, actaulPageReviews);
    }
//  19 Нажатие кнопки Читать Историю
    @When("website is open click the button Read Story")
    public void website_is_open_click_the_button_read_story() {
        homePage.FindElementButtonReadStory();
    }
    @When("Open page Read Story {string}")
    public void open_page_read_story(String expectedPageBlog) {
        final var actaulPageBlog  = otherPage.getReadStoryPage();
        assertEquals(expectedPageBlog, actaulPageBlog);
    }

//  20 Нажатие кнопки Вопрос-ответ в блог
    @Then("click button ask")
    public void click_button_ask() {
        otherPage.FindElementAsk();
    }
    @Then("Open page ask {string}")
    public void open_page_ask(String expectedPageReadBlog) {
        final var actaulPageReadBlog = otherPage.getAskPage();
        assertEquals(expectedPageReadBlog, actaulPageReadBlog);
    }

}
