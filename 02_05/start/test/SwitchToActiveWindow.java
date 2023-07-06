import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // Returns the original window
        String originalTabID = driver.getWindowHandle();

        // Iterating through each window
        for (String handleID: driver.getWindowHandles()) {
            // Switching to window with handleID
            driver.switchTo().window(handleID);
        }
        // Switching to the original window
        driver.switchTo().window(originalTabID);

        driver.quit();
    }
}


