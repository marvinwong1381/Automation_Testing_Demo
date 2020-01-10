import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Virtual_automation_iOS {

    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "iOS");
        cap.setCapability("platformVersion", "10.3");
        cap.setCapability("deviceName", "iPhone 7");
        //cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
        //cap.setCapability("UDID", "B03ADA2C-2C31-4977-9526-CAC56C0BD76F");
        cap.setCapability("app", "/Users/hkasianark/Downloads/hecApp-iOS.app");
        cap.setCapability("autoAcceptAlerts", "true");

        IOSDriver wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        MobileElement el1 = (MobileElement) wd.findElementByAccessibilityId("http://entrance-uat.bigbrothers.info/entrance/info");
        el1.click();
        wd.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        MobileElement el2 = (MobileElement) wd.findElementByAccessibilityId("GuideButtonNext");
        el2.click();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        MobileElement el3 = (MobileElement) wd.findElementByAccessibilityId("GuideButtonNext");
        el3.click();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        MobileElement el4 = (MobileElement) wd.findElementByAccessibilityId("GuideButtonNext");
        el4.click();
        //int index = 0;
        //wd.findElements(By.id("GuildButtonNext")).get(index);
        //System.out.println(index);


        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        MobileElement el6 = (MobileElement) wd.findElementByAccessibilityId("GuideButtonTry");
        el6.click();
        /*wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        MobileElement el7 = (MobileElement) wd.findElementByXPath("//XCUIElementTypeApplication[@name=\"聚星\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField");
        el7.click();
        el6.sendKeys("evilgamesx4");
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        MobileElement el8 = (MobileElement) wd.findElementByXPath("//XCUIElementTypeApplication[@name=\"聚星\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField");
        el8.click();
        el7.sendKeys("evilgamesx4");
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        MobileElement el9 = (MobileElement) wd.findElementByXPath("(//XCUIElementTypeButton[@name=\"Done\"])[2]");
        el9.click();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        MobileElement el10 = (MobileElement) wd.findElementByAccessibilityId("登录");
        el10.click();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
*/

    }
}
