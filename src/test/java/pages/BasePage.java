package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected static WebDriver driver; //Donde se guardará el webdriver
    private static WebDriverWait wait; // Se usará cuando toque esperar
    private static Actions accion;

    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);//Única instancia del webDriver
        wait = new WebDriverWait(driver, 10); // Que espere un máximo de 10 s
    }

    // Constructor de la clase
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);//espera explícita
    }

    // Función para navegar
    public static void navigateTo(String url){
        driver.get(url);
    }

    // Función para crear una instancia 
    private WebElement Find(String locator){
        //wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));//espera implícita
    }

    // Función para hacer click
    public void clickElement(String locator){
        //wait = new WebDriverWait(driver, 10);
        Find(locator).click();
    }

    // Función para hacer submit
    public void submitElement(String locator){
        Find(locator).submit();
    }

    // Función escribir
    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    // Función press ENTER
    public void pressEnter(String locator){
        Find(locator).sendKeys(Keys.ENTER);
    }
    
    // Función seleccionar Dropdown
    public void selectFromDropDownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropDownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropDownByText(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }

    // Simular posicionamiento
    public void hoverOverElement(String locator){
        accion.moveToElement(Find(locator));
    }

    // Simular doble click
    public void doubleClick(String locator){
        accion.doubleClick(Find(locator));
    }

    // Simular click derecho
    public void rightClick(String locator){
        accion.contextClick(Find(locator));
    }

    public String textFromElement(String locator){
        return Find(locator).getText();
    }

    // Manipular lista desplegable
    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    // Cerrar el browser
    public static void closeBrowser(){
        driver.quit();
    }
}
