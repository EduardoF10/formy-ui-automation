import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        String date = "04/27/1999";
        dateField.sendKeys(date);

        Thread.sleep(2000);

        // Closing the datepicker by pressing ENTER
        dateField.sendKeys(Keys.RETURN);    // /n is also valid

        Thread.sleep(3000);

        driver.quit();
    }
}