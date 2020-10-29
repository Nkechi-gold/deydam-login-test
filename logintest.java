package login;

import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

    //import selenium webDriver
    private WebDriver driver;

  //    import chromedriver
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nkechi\\IdeaProjects\\Deydamtest\\resources\\chromedriver.exe");
      driver = new ChromeDriver();
        //input the url
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        //waiting for globally
        driver.manage().timeouts().implicitlyWait(time 10, Timeunit.SECONDS);
        //maximize window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //enter username into username field
        driver.findElement(By.id("username")).sendKeys("nklicious");
        // enter password into password field
        driver.findElement(By.id("password")).sendKeys("Marvelous1");
        // click on sign in button
        driver.findElement(By.xpath(//*[@id="root"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button)).click();
        Thread.sleep( mills: 10000);
        close browser
             driver.quit();
        public static void main(string args[]){ throws InterruptedException {
        logintest = new logintest()
         test setup();
    }


        }

    }
