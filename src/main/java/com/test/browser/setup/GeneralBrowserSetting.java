package com.test.browser.setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.HashMap;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.test.report.Reports;
import com.test.ui.helper.CommanUtill;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeneralBrowserSetting extends Reports {

    @BeforeClass
    public static void launchBrowser() throws IOException, InterruptedException {

        LOG_STATUS = readPropertiesFileData("LOG_FILE_STATUS");

        if (LOG_STATUS.equalsIgnoreCase("Yes")) {
            PropertyConfigurator.configure(readPropertiesFileData("LOG_FILE_PATH"));
        } else {
            System.out.println("Log file disabled in properties...");
        }

        try {
            InputStream input = new FileInputStream(PROPERTIES_FILE_PATH);
            properties.load(input);
            BROWSERNAME = readPropertiesFileData("BROWSERNAME");
        } catch (Exception e) {
            System.err.println("Property file error: " + e.getMessage());
        }

        if (BROWSERNAME.equalsIgnoreCase("Chrome")) {

            URL = readPropertiesFileData("URL");

            HashMap<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.prompt_for_download", false);
            chromePrefs.put("pdfjs.disabled", true);

            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);
            options.addArguments("--disable-extensions");
            options.setAcceptInsecureCerts(true);

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

        } 
        else if (BROWSERNAME.equalsIgnoreCase("IE")) {

            URL = readPropertiesFileData("URL");
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } 
        else if (BROWSERNAME.equalsIgnoreCase("Safari")) {

            URL = readPropertiesFileData("URL");
            driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(URL);

        applicationLogin();
    }

    public static void applicationLogin() throws IOException, InterruptedException {

        CommanUtill.enter("//input[@id='txtLoginName']", readPropertiesFileData("UserName"));
        CommanUtill.enter("//input[@id='txtPassword']", readPropertiesFileData("Password"));
        CommanUtill.click("//input[@id='btnLogin']", "Login Button");
        CommanUtill.click("//a[@id='btnYesAlreadyLogedinPopup']", "Login Yes");
    }

    //@AfterClass
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
