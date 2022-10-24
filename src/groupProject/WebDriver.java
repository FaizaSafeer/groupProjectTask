package groupProject;

public interface WebDriver {
    void open();
    void close();
        void getTitle();
}
   interface TakesScreenshots{
    void getScreenshot();
   interface RemoteWebDriver extends WebDriver,TakesScreenshots{
   void navigate();
}


class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening the Chrome Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing the Chrome Driver");
    }

    @Override
    public void getTitle() {
        System.out.println(" Getting the title of Chrome Driver");
    }

    @Override
    public void navigate() {
        System.out.println("navigate Chrome Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take the screen shot of Chrome Driver");
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening the Firefox Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing the Firefox Driver");
    }

    @Override
    public void getTitle() {
        System.out.println(" Getting the title of Firefox Driver");
    }

    @Override
    public void navigate() {
        System.out.println("navigate Firefox Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take the screen shot of Chrome Driver");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening the Safari Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing the Safari Driver");
    }

    @Override
    public void getTitle() {
        System.out.println(" Getting the title of Safari Driver");
    }

    @Override
    public void navigate() {
        System.out.println("navigate Safari Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take the screen shot of Safari Driver");
    }
}}