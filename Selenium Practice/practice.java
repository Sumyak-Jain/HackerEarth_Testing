import java.io.*;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class practice {

    public static void main(String[] args) throws IOException, InterruptedException {
        File file= new File("C:\\Users\\GAURAV\\OneDrive\\Desktop\\Documents\\text_url.txt");
        Scanner sc=new Scanner(file);
        String url="";
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        while(sc.hasNextLine()){
            url=sc.nextLine();
            driver.navigate().to(url);

            System.out.println("done");
        }
        driver.quit();



    }
}
