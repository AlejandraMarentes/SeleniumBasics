package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EjercicioLocalizacionDeElementos {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //A)Buscar por id
        WebElement classExampleId1=driver.findElement(By.id("openwindow"));
        WebElement classExampleId2=driver.findElement(By.id("opentab"));
        WebElement classExampleId3=driver.findElement(By.id("name"));
        WebElement classExampleId4=driver.findElement(By.id("alertbtn"));
        WebElement classExampleId5=driver.findElement(By.id("confirmbtn"));
        WebElement classExampleId6=driver.findElement(By.id("hide-textbox"));
        WebElement classExampleId7=driver.findElement(By.id("show-textbox"));
        WebElement classExampleId8=driver.findElement(By.id("displayed-text"));


        //B)Buscar por name
        WebElement classExampleName1=driver.findElement(By.name("enter-name"));
        WebElement classExampleName2=driver.findElement(By.name("show-hide"));


        //C)Buscar por className
        List<WebElement> elements = driver.findElements(By.className("radioButton"));
        WebElement classExampleRadioButton1 = elements.get(0);
        WebElement classExampleRadioButton2 = elements.get(1);
        WebElement classExampleRadioButton3 = elements.get(2);


        //D)Buscar por Link Text o Partial Link Text
        WebElement classExampleLinkText1=driver.findElement(By.linkText("https://qasummit.org/"));
        WebElement classExampleLinkText2=driver.findElement(By.linkText("http://www.restapitutorial.com/"));
        WebElement classExampleLinkText3=driver.findElement(By.linkText("https://rahulshettyacademy.com/brokenlink"));

      // Explicar con mis palabras que hace la instrucción “WebDriver driver = new ChromeDriver();”
        //Básicamente esta instrucción hace que se inicie o bien se abra una pestaña del navegador Chorme la conecta con Selenium y nos permite automatizarla.

        //Explicar con mis palabras que hace la instrucción “WebElement classExampleTextbox = driver.findElement(By.id("name"));”
        //Esta instrucción nos sirve para poder localizar un campo por el ID en el HTML la cual se guarda en nuestra variable para poder interactuar con él en un futuro.

        //Cuáles son las formas en las que podemos localizar elementos en selenium?
        //Por ID: By.id
        //Por nombre: By.name
        //Por clase: By.classNam
        //Por etiqueta (tag): By.tagName
        //Por texto visible de un enlace: By.linkText
        //Por parte del texto del enlace: By.partialLinkText
        //Por CSS Selector: By.cssSelector
        //Por XPath: By.xpath



    }
}
