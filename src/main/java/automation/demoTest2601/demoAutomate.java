package automation.demoTest2601;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class demoAutomate 
{
    public static void main( String[] args )
    {
        WebDriver driver;
        //System.setProperty("webdriver.chrome.driver","D:\\Softwares\\eclipse-workspace\\demoTest2601\\src\\test\\resources\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Medlife Sipper Copper Water Bottle 1 LTR");
        driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']")).click();
    }
}
