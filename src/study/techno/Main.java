package study.techno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            System.setProperty( "webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver" );
            WebDriver driver = new ChromeDriver();
            driver.get( "https://www.phptravels.net/en" );
            driver.manage().window().maximize();
            WebElement element= driver.findElement(By.id("dropdownLangauge"));
            element.click();
            List<WebElement> buttons = driver.findElements( By.cssSelector( ".dropdown-item" ) );
            for(WebElement button: buttons){
//            System.out.println(button.getText());
                    button.click();

            }
//            Select select = new Select(driver.findElement(By.className("dropdown-item")));
//        // select.deselectAll();
//            List<WebElement> selectOptions = select.getOptions();
//            for (WebElement option : selectOptions) {
//
//                select.selectByVisibleText(option.getText());
//                option.click();
//
//            }

           // List<WebElement> list = driver.findElements(By.cssSelector("(\"div[class='dropdown-menu dropdown-menu-right show'] a"));





        }
}
