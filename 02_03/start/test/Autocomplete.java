import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        // Create ChromeOptions and set the "--disable-infobars" flag
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-infobars");

        WebDriver driver = new ChromeDriver();


        // Set default geolocation to a specific latitude and longitude
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.get("https://formy-project.herokuapp.com/autocomplete");


        // Set the geolocation using the setLocation method
        ((ChromeDriver) driver).executeScript("navigator.geolocation.getCurrentPosition = function(success) { success({coords: {latitude: 18.3798, longitude: -66.1615}}); }");


        WebElement addressBar = driver.findElement(By.id("autocomplete"));
        addressBar.sendKeys("Volga Street #30 Residences at Rio");

        // Wait for the page to populate
        Thread.sleep(2000);

        WebElement dismissButton = driver.findElement(By.className("dismissButton"));
        dismissButton.click();

        // Wait before looking the autocomplete box
        Thread.sleep(3000);

        // Finding web element by class name
        WebElement addressAuto = driver.findElement(By.className("pac-container hdpi"));
        addressAuto.click();

        driver.quit();
    }

    // Helper method to create the Chrome preferences for location access
    private static String getLocationPreferences(boolean allowLocation) {
        return "{" +
                "\"profile\": {" +
                "\"content_settings\": {" +
                "\"geolocation\": " + (allowLocation ? "1" : "0") +
                "}" +
                "}" +
                "}";
    }


    private static String getLocationOverride(double latitude, double longitude, int accuracy) {
        return "{" +
                "\"latitude\": " + latitude + "," +
                "\"longitude\": " + longitude + "," +
                "\"accuracy\": " + accuracy +
                "}";
    }
}
