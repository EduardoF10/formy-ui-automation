import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement dragImage = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        // Actions object needed to drag and drop
        Actions actions = new Actions(driver);
        // Build and perform the action of dragging "dragImage" into "box"
        actions.dragAndDrop(dragImage, box).build().perform();


        driver.quit();
    }
}

