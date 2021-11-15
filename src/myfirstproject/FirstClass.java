package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver D=new ChromeDriver();
 D.get("https://chromedriver.storage.googleapis.com/index.html?path=95.0.4638.69/");

}
}
