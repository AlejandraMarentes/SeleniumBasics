package ejerciciosSelenium;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //Ejemplo del click
        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        showBtn.click();

        WebElement hideBtn = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        showBtn.click();
        hideBtn.click();
        showBtn.click();
        hideBtn.click();

        //Ejemplo de sendKeys()
        // 1.Buscar elemento y guardarlo
        WebElement countryTxt= driver.findElement(By.id("autocomplete"));
        WebElement name = driver.findElement(By.id("name"));
        // 2. Escribir usando sendkeys()
        countryTxt.sendKeys("Mexico");
        WebElement Entername=driver.findElement(By.id("name"));
        Entername.sendKeys("Alejandra");
        // 3 Borrar los text box
        countryTxt.clear();
        Entername.clear();

        // COMANDOS GET
        // getTitle()
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //getText()
        // 1. Encontrar elemento
        WebElement radiobtnLbl = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
        System.out.println(radiobtnLbl.getText());

        //Ejercicio: Traer el texto de SUGGESSION CLASS EXAMPLE
        WebElement suggbtnLbl = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
        System.out.println(suggbtnLbl.getText());

        //COMANDOS CONDICIONALES
        // isDisplayed
        WebElement hideshowTxtbx = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println("El status del textbox isDisplayed es:"+hideshowTxtbx.isDisplayed());
        showBtn.click();
        System.out.println("Ahora el estatus del textbox isDisplayed es:"+hideshowTxtbx.isDisplayed());

        //Buscar el radiobutton1
        WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("El estatus del radio es"+radio1.isSelected());
        // Dar click en radiobutton1
        radio1.click();

        //Verficiar si esta checked con el comando ".isSelected e imprimir status
        System.out.println("ahora el estatus de textbox isSelected es "+radio1.isSelected());

        //2
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        System.out.println("El estatus del checkbox es"+ checkbox.isSelected());
        checkbox.click();
        System.out.println("ahora el estatus del checkbox isSelected es"+checkbox.isSelected());


        Thread.sleep(2000); // No usar solo se hace para alentar la pagina
        driver.quit();






    }
}
