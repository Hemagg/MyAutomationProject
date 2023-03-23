package MyMaven.MyMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--start-maximized");
    	chromeOptions.addArguments("--remote-allow-origins=*");
    	WebDriver driver=new ChromeDriver(chromeOptions);
    	
    	driver.get("https://github.com");
    	
    	
        System.out.println( "Hello World!" );
    }
}
