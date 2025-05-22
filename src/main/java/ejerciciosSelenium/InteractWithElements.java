package ejerciciosSelenium;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InteractWithElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

//        //Ejemplo del click
//        WebElement showBtn = driver.findElement(By.id("show-textbox"));
//        showBtn.click();
//
//        WebElement hideBtn = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//        showBtn.click();
//        hideBtn.click();
//        showBtn.click();
//        hideBtn.click();
//
//        //Ejemplo de sendKeys()
//        // 1.Buscar elemento y guardarlo
//        WebElement countryTxt= driver.findElement(By.id("autocomplete"));
//        WebElement name = driver.findElement(By.id("name"));
//        // 2. Escribir usando sendkeys()
//        countryTxt.sendKeys("Mexico");
//        WebElement Entername=driver.findElement(By.id("name"));
//        Entername.sendKeys("Alejandra");
//        // 3 Borrar los text box
//        countryTxt.clear();
//        Entername.clear();
//
//        // COMANDOS GET
//        // getTitle()
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//
//        //getText()
//        // 1. Encontrar elemento
//        WebElement radiobtnLbl = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
//        System.out.println(radiobtnLbl.getText());
//
//        //Ejercicio: Traer el texto de SUGGESSION CLASS EXAMPLE
//        WebElement suggbtnLbl = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
//        System.out.println(suggbtnLbl.getText());
//
//        //COMANDOS CONDICIONALES
//        // isDisplayed
//        WebElement hideshowTxtbx = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//        System.out.println("El status del textbox isDisplayed es:"+hideshowTxtbx.isDisplayed());
//        showBtn.click();
//        System.out.println("Ahora el estatus del textbox isDisplayed es:"+hideshowTxtbx.isDisplayed());
//
//        //Buscar el radiobutton1
//        WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
//        System.out.println("El estatus del radio es"+radio1.isSelected());
//        // Dar click en radiobutton1
//        radio1.click();
//
//        //Verficar si esta checked con el comando ".isSelected e imprimir status
//        System.out.println("ahora el estatus de textbox isSelected es "+radio1.isSelected());
//
//        //2
//        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//        System.out.println("El estatus del checkbox es"+ checkbox.isSelected());
//        checkbox.click();
//        System.out.println("ahora el estatus del checkbox isSelected es"+checkbox.isSelected());

        WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
        alert.click();
        driver.switchTo().alert().accept();

////   EJERCICIO
//        //Buscar boton confirm por xpath
//        WebElement confirm=driver.findElement(By.xpath(" //input[@id='confirmbtn']"));
//        //Click en el boton confirm
//        confirm.click();
//        //Aceptar alerta
//        driver.switchTo().alert().accept();
//        //volver a hacer click en el boton confirm
//        confirm.click();
//        //declinar alerta
//        driver.switchTo().alert().dismiss();

        //TAREA OPCIONAL
        //Poner el nombre en el campo de "enter your name" y dar click en aceptar, luego volver a poner el nombre y dar click en
        //confirm y aceptar/declinar alerta


//        //MANEJO DE DROPDOWN
//        // 1. Buscar el dropdown
//        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//        // 2. Hacer una instancia de Select
//        Select select = new Select(dropdown);
//        // 3. Seleccionamos el valor que queremos hay 3 formas:
//        // por index
//        select.selectByIndex(0);
//        Thread.sleep(3000);
//        select.selectByValue("option3");
//        Thread.sleep(3000);
//        select.selectByVisibleText("Option2");

//        //USO DE LA CLASE ACTIONS EN SELENIUM
//        //MOUSE HOVER
//        //1.BUSCAR ELEMENTO
//        WebElement mousehoverBtn = driver.findElement(By.id("mousehover"));
//        //2. hacer mi instancia de actions
//        Actions actions = new Actions(driver);
//        //3. hacer el hover
//        // primero se mueva al elemento iframe example
//        //aqui poner codigo
//        WebElement iframeLbl=driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
//        actions.moveToElement(iframeLbl).perform();
//        actions.moveToElement(mousehoverBtn).contextClick(mousehoverBtn).build().perform();
//        //actions.contextClick(mousehoverBtn).perform();


        //USO DEL findElements
        List<WebElement> encabezados = driver.findElements(By.xpath("//table[@name='courses']//th"));
//        for (int i=0; i<encabezados.size(); i++){
//            System.out.println(encabezados.get(i).getText());
//        }
        for (WebElement encabezado:encabezados){
            System.out.println(encabezado.getText()); //.click para darle click y .is selected para seleccionar
        }
        //Tarea crear clase USING FILE ELEMENT Sseleccionar los 3 radios y despues a los options que se seleccionen los 3 y luego se quiten usando List Element

        Thread.sleep(5000); // No usar solo se hace para alentar la pagina
        driver.quit();






    }
}
