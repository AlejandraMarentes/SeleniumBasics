package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //Seleccionar los radio buttons
        List<WebElement> radiosBtns = driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement radio : radiosBtns) {
            radio.click();
            Thread.sleep(2000);
        }
        //seleccionar los checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
            Thread.sleep(2000);

        }
            driver.quit();


    }
}
