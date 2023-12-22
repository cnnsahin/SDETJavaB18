package class19;

import org.openqa.selenium.chrome.ChromeDriver;

public class E4Poly {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromedriver=new ChromeDriver();
        chromedriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        chromedriver.quit();
    }
}
