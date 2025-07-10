package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }

    @After
    public void doAfterTestEnding() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void sdaTest(){
        // najprv si nacitame stranku tutorialspoint
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        // toto mi zvacsi stranku
        driver.manage().window().setSize(new Dimension(1936, 1048));

        // toto mi najde na stranke prvok a vypíše meno
        driver.findElement(By.id("name")).sendKeys("Veronika");
        // toto mi najde na stranke prvok a vpise mail
        driver.findElement(By.id("email")).sendKeys("nikus.kovalcikova@email.com");
        // assertujeme prvý parameter je predpoklad a druhý je skutočná hodnota - overí, zde je správny text
        Assert.assertEquals("Student Registration Form", driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/h1")).getText());



    }









}
