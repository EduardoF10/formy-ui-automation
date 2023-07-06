import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // Finding element by id
        WebElement option1 = driver.findElement(By.id("radio-button-1"));
        // Finding element by value
        WebElement option2 = driver.findElement(By.cssSelector("input[value='option2']"));
        // Finding element by XPath
        WebElement option3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));

        // Selecting all 3 buttons
        option1.click();
        Thread.sleep(2000);
        option2.click();
        Thread.sleep(2000);
        option3.click();
        Thread.sleep(2000);

        driver.quit();
    }
}




