package com.test.browser.setup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author anup
 *
 * Feb 01, 2025
 */

public class BrowserSetup {

    public static WebDriver driver;
    public static String URL = "";
    public static String BROWSERNAME = "";


    @BeforeClass
    public static void launchBrowser() throws IOException {
        if (BROWSERNAME.equalsIgnoreCase("Chrome") || BROWSERNAME.equalsIgnoreCase("CHROME")) {
            try {
                WebDriverManager.chromedriver().setup();
            } catch (Exception E) {
                System.err.println("Error while loading the chrome driver: " + E.getMessage());
            }

            try {
                // If you need custom capabilities for chrome, initialize here.
                driver = new ChromeDriver();
            } catch (Exception e) {
                System.err.println("Error while creating ChromeDriver: " + e.getMessage());
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get(URL);
        }

        else if (BROWSERNAME.equalsIgnoreCase("InternetExplorer") || BROWSERNAME.equalsIgnoreCase("IE")) {

            try {
                WebDriverManager.iedriver().setup();

            } catch (Exception E) {
                System.err.println("Error while loading the IE driver: " + E.getMessage());
            }

            try {
                driver = new InternetExplorerDriver();
            } catch (Exception e) {
                System.err.println("Error while creating InternetExplorerDriver: " + e.getMessage());
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get(URL);
        }

        else if (BROWSERNAME.equalsIgnoreCase("Safari") || BROWSERNAME.equalsIgnoreCase("SAFARI")) {

            try {
                driver = new SafariDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                driver.get(URL);
            } catch (Exception e) {
                System.err.println("Error while launching Safari: " + e.getMessage());
            }
        }
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Successful execution done !!!!");
        if (driver != null) {
            driver.quit();
        }
    }


    public void customWait(long millisecs) {
        try {
            Thread.sleep(millisecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }


    public void click(String locator, String fieldName) {
        try {
            driver.findElement(org.openqa.selenium.By.xpath(locator)).click();
        } catch (Exception e) {
            System.out.println("Error while clicking on '" + fieldName + "' " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void click(org.openqa.selenium.WebElement webElement, String fieldName) {
        try {
            webElement.click();
        } catch (Exception e) {
            System.out.println("Error while clicking on '" + fieldName + "' " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void enterText(String locator, String inputText, String fieldName) {
        try {
            driver.findElement(org.openqa.selenium.By.xpath(locator)).clear();
            customWait(2000);
            driver.findElement(org.openqa.selenium.By.xpath(locator)).sendKeys(inputText);
        } catch (Exception e) {
            System.out.println("Error while entering the text on '" + fieldName + "' " + e.getMessage());
            e.printStackTrace();
        }
    }

}
