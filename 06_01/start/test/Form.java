import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/efuertes2/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        // Form info
        String firstName = "Eduardo";
        String lastName = "Fuertes";
        String jobTitle = "Software Developer";
        String educationLvl = "College";
        String sex = "Male";
        int years = 7;
        String date = "07/05/23";

        // Sending form info
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        Thread.sleep(1000);
        driver.findElement(By.id("job-title")).sendKeys(jobTitle);
        Thread.sleep(1000);
        selectEducation(driver, educationLvl);
        Thread.sleep(1000);
        selectSex(driver, sex);
        Thread.sleep(1000);
        selectExperience(driver, years);
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys(date + "\n");
        Thread.sleep(1000);

        // Click submit
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.quit();
    }


    // Selects education level based on input
    private static void selectEducation(WebDriver driver, String educationLvl) {
        if (educationLvl == "High School") {
            driver.findElement(By.id("radio-button-1")).click();
        } else if (educationLvl == "College") {
            driver.findElement(By.id("radio-button-2")).click();
        }
        else if (educationLvl == "Grad School") {
            driver.findElement(By.id("radio-button-3")).click();
        }
    }

    // Selects sex based on input
    private static void selectSex(WebDriver driver, String sex) {
        if (sex == "Male") {
            driver.findElement(By.id("checkbox-1")).click();
        } else if (sex == "Female") {
            driver.findElement(By.id("checkbox-2")).click();
        }
        else if (sex == "Prefer not to say") {
            driver.findElement(By.id("checkbox-3")).click();
        }
    }

    // Selects years of experience based on input
    private static void selectExperience(WebDriver driver, int years) {

        // Finding elements based on their tag name ("option") and value
        if (years < 2) {
            driver.findElement(By.cssSelector("option[value='1']")).click();
        } else if (years < 5) {
            driver.findElement(By.cssSelector("option[value='2']")).click();
        }
        else if (years < 10) {
            driver.findElement(By.cssSelector("option[value='3']")).click();
        }
        else {
            driver.findElement(By.cssSelector("option[value='4']")).click();
        }
    }

}


