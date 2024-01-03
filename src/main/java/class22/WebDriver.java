package class22;

public interface WebDriver {
    void openBrowser();
     void closeBrowser();
     void maximizeWindow();
     void findElement();
}
class ChromeDriver  implements WebDriver{
    @Override
   public  void closeBrowser(){
        System.out.println("Chrome close browser");

    }

    @Override
    public void findElement(){
        System.out.println(" Chrome finds element");
    }

    @Override
    public void maximizeWindow(){
        System.out.println("Chrome maximize screen");
    }

    @Override
    public void openBrowser(){
        System.out.println(" Chrome opens pages");
    }
}
class  Firefox implements  WebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}