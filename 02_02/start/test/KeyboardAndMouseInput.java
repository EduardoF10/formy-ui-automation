import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        // Setting the location of the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        // Identifying the web element using its id
        WebElement nameBox = driver.findElement(By.id("name"));
        // Clicking the web element to make it active
        nameBox.click();
        // Sending the key presses
        nameBox.sendKeys("Eduardo Fuertes");

        WebElement buttonBox = driver.findElement(By.id("button"));
        buttonBox.click();


        driver.quit();
    }
}


