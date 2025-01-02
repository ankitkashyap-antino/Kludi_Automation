package setupFramework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.WebDriver;

public class BaseResource {
    public WebDriver driver;
    public static String path = "C:\\Users\\Ankit\\IdeaProjects\\Kludi_Automation\\Reports\\report.html";
    public static ExtentReports extent;
    public static ExtentSparkReporter htmlReporter;


    public static void initialzReporter(String browser){

        //SetUp Reporter
        htmlReporter = new ExtentSparkReporter(path);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        //Setup TestEnv Data
        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser", browser);


        //Setup Html Report UI
        htmlReporter.config().setReportName("Ankit");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss a");
        htmlReporter.config().





    }


}
