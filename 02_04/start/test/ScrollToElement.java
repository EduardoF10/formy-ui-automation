import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        // The element we want to find
        WebElement name = driver.findElement(By.id("name"));

        // Action of moving to element
        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        // Sending keys after moving to element
        name.sendKeys("Monkey D Luffy");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("07/02/23");

        driver.quit();
    }
}

