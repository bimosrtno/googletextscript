import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleSearchTest { public static void main (String[] args ) {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");

    //open chrome
    WebDriver driver = new ChromeDriver();

    driver.get ("https://www.google.com") ;

    // find search box (input name ="q"
    WebElement searchBox = driver.findElement(By.name("q"));

    //type halo => enter
    searchBox.sendKeys("halo");
    searchBox.sendKeys(Keys.RETURN);

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e ) {
        e.printStackTrace();
    }
    //close
    driver.quit();
  }
}
