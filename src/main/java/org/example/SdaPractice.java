package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaPractice {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/test/Desktop/software tester documenty/SDA_finalTesting/src/main/resources/chromedriver");
        driver = new ChromeDriver();

    }

    @After
    public void doAfterTestEnding() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testSdaFinalProject() throws Exception {
        //WebElement prvok

        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        driver.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();
        driver.findElement(By.id("c_bs_1")).click();

        driver.findElement(By.id("c_bf_2")).click();
        driver.findElement(By.xpath("//*[@id=\"bs_2\"]/span[1]")).click();
        driver.findElement(By.id("c_bf_4")).click();
        driver.findElement(By.id("c_bf_3")).click();

        //Req-C1
        Assert.assertTrue(driver.findElement(By.id("c_bs_1")).isSelected());
        //Req-C3
        Assert.assertTrue(driver.findElement(By.id("c_bf_1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("c_bf_2")).isSelected());

        driver.findElement(By.id("c_bf_2")).click();

        //Req-C3
        Assert.assertFalse(driver.findElement(By.id("c_bs_1")).isSelected());

        driver.findElement(By.xpath("//*[@id=\"bs_2\"]/span[1]")).click();

        driver.findElement(By.id("c_bf_4")).click();
        driver.findElement(By.id("c_bf_3")).click();

        //Req-C2
        Assert.assertTrue(driver.findElement(By.id("c_bs_2")).isSelected());

        driver.findElement(By.id("c_bf_3")).click();

        //Req-C2
        Assert.assertFalse(driver.findElement(By.id("c_bs_2")).isSelected());







    }
}
