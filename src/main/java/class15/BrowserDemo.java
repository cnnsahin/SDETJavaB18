package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDemo {
    public static void main(String[] args) {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://www.amazon.com/");


    }
}
