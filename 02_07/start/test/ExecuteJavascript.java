import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalBtn = driver.findElement(By.id("modal-button"));
        modalBtn.click();

        // Close button inside modal
        WebElement closeBtn = driver.findElement(By.id("close-button"));

        // Creating a JavaScript Executor
        JavascriptExecutor javex = (JavascriptExecutor) driver;
        // Executing a script to click the close button
        javex.executeScript("arguments[0].click()", closeBtn);

        driver.quit();
    }
}

