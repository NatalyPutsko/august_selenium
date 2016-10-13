package patsanu;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class TwentySeven {
    @Test
    public void SearchForProduct() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\IdeaProjects\\august_selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.27.ua");

    }
}
