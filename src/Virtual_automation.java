
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Virtual_automation {

    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.hec.hecApp");//com.hec.hecApp
        dc.setCapability("appActivity", "com.hec.app.activity.login.StartActivity");
        dc.setCapability("autoGrantPermissions", true);


        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        TouchAction touchAction = new TouchAction(ad);

        ad.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        MobileElement el1 = (MobileElement) ad.findElementById("android:id/text1");
        el1.click();
        Thread.sleep(3000);
        MobileElement el2 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
        el2.click();
        Thread.sleep(1000);
        MobileElement el3 = (MobileElement) ad.findElementById("com.hec.hecApp:id/select_entrance_btn");//choose entrance
        el3.click();
        Thread.sleep(5000);
        MobileElement el4 = (MobileElement) ad.findElementById("com.hec.hecApp:id/btn_next");
        el4.click();
        Thread.sleep(500);
        MobileElement el5 = (MobileElement) ad.findElementById("com.hec.hecApp:id/btn_next");
        el5.click();
        Thread.sleep(500);
        MobileElement el6 = (MobileElement) ad.findElementById("com.hec.hecApp:id/btn_next");
        el6.click();
        Thread.sleep(500);
        MobileElement el7 = (MobileElement) ad.findElementById("com.hec.hecApp:id/btn_next");
        el7.click();
        Thread.sleep(500);
        MobileElement el8 = (MobileElement) ad.findElementById("com.hec.hecApp:id/txtUserName");//enter username
        el8.sendKeys("evilgamesx4");
        Thread.sleep(500);
        MobileElement el9 = (MobileElement) ad.findElementById("com.hec.hecApp:id/txtPwd");//enter password
        el9.sendKeys("evilgamesx4");
        Thread.sleep(500);
        MobileElement el10 = (MobileElement) ad.findElementById("com.hec.hecApp:id/btnUserLogin");//click log-in
        el10.click();
        Thread.sleep(2000);
        MobileElement el11 = (MobileElement) ad.findElementById("com.hec.hecApp:id/rbWebchat");//enter
        el11.click();
        Thread.sleep(1000);
        MobileElement el12 = (MobileElement) ad.findElementById("com.hec.hecApp:id/username");
        el12.click();
        Thread.sleep(1000);

        //new touchAction().press(500,500).moveTo(500,200).release();
        MobileElement el13 = (MobileElement) ad.findElementById("com.hec.hecApp:id/high_light_view");
        el13.click();
        Thread.sleep(1000);
        touchAction.press(new PointOption().withCoordinates(631, 1695)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(new PointOption().withCoordinates(631, 1095)).release().perform();
        Thread.sleep(1000);
        MobileElement el14 = (MobileElement) ad.findElementById("com.hec.hecApp:id/agent");
        el14.click();
        Thread.sleep(4000);
        MobileElement el15 = (MobileElement) ad.findElementById("com.hec.hecApp:id/proxy_btn_3");
        el15.click();
        Thread.sleep(1000);
        MobileElement el16 = (MobileElement) ad.findElementById("com.hec.hecApp:id/gen_link");
        el16.click();
        Thread.sleep(1000);

        //Assert.assertEquals(ad.findElementById("com.hec.hecApp:id/link_proxy").getText(),"http://register.dm1984.com/Account/Register?code=C9AC9B5A41DBAB5C&par=6BA0098D8F06C5DC");

    }

}
