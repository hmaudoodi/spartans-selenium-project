package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        //opens chrome
        chromeDriver.get("https://google.com");

        //method to maximize browser
        chromeDriver.manage().window().maximize();

        //return String of Application title
        String title = chromeDriver.getTitle();
        System.out.println(title);

        //to close browser
        chromeDriver.quit();


    }
}
