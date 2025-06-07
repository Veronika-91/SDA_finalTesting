import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTutorialPointBdd {

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

    @Given("the user is on the website tutorialpoint checkbox")
    public void theUserIsOnTheWebsiteTutorialpointCheckbox() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        driver.manage().window().setSize(new Dimension(1936, 1048));
    }

    @When("user clicks on the checkbox with id {string}")
    public void userClicksOnTheCheckboxWithId(String idElement) {
        driver.findElement(By.id(idElement)).click();

    }

    @Then("user sees the ticked checkbox with id {string}")
    public void userSeesTheTickedCheckboxWithId(String idElement) {
        Assert.assertTrue(driver.findElement(By.id(idElement)).isSelected());
    }

    @When("user clicks on the button plus for rollup offer with xpath {string}")
    public void userClicksOnTheButtonPlusForRollupOfferWithXpath(String xpathWay) {
        driver.findElement(By.xpath(xpathWay)).click();
    }

    @Then("user sees the unticked checkbox with id {string}")
    public void userSeesTheUntickedCheckboxWithId(String idElement) {
        Assert.assertFalse(driver.findElement(By.id(idElement)).isSelected());
    }
}
