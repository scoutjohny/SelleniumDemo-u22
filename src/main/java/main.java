import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_114.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //odlazak na URL:
        driver.get("https://www.saucedemo.com/");
        //slanje teksta u polje Username
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        //slanje teksta u polje Password
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        //klik na dugme Login
        driver.findElement(By.cssSelector("#login-button")).click();

//
//        Šema CSS selektora:
//        tip[atribut='vrednost']

        //klasa>   .gLFyf
        //id>      #APjFqb

        //rad sa elementima:
        //upisivanje teksta u polje:
//        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Torte i kolaci");
//
//        //slanje specijalnih dugmića sa tastature:
//        //driver.findElement(By.cssSelector("#APjFqb")).sendKeys(Keys.ENTER);
//
//        driver.findElements(By.cssSelector("[name='btnK']")).get(0).click();
//
//        //Xpath
//        //tip[@atribut='vrednost']
//
//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("kjhabsdbas");
        //gasi ceo brauzer
        //driver.quit();
    }
}
