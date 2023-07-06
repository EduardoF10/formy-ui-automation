import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertBtn = driver.findElement(By.id("alert-button"));
        alertBtn.click();

        // Switching to an alert on the screen
        Alert alert1 = driver.switchTo().alert();
        // Pressing ok on the alert
        alert1.accept();

        driver.quit();
    }
}



