package utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtility {
    public static void takeScreenshot(WebDriver driver, String scenarioName) {
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotPath = "screenshots/" + scenarioName + "_" + timestamp + ".png";

            FileUtils.copyFile(srcFile, new File(screenshotPath));
            System.out.println("Screenshot saved: " + screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
