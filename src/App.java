import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\FullTesting\\STmodellab3105\\modellab\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://skcet.amypo.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.cssSelector("input[type='email']"));

        email.sendKeys("727722eucd045@skcet.ac.in");
        Thread.sleep(2000);

        WebElement pass=driver.findElement(By.id("passwordInput"));
        pass.sendKeys("045csdskcet");
        Thread.sleep(2000);

        WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/div[3]/button"));
        btn.click();
        Thread.sleep(6000);


        driver.quit();    

    }
}