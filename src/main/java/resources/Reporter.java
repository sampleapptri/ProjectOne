package resources;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
	public void Reportsuccess(ITestResult result) {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\User\\Desktop\\Reporter\\Reports.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Test" + result);
		// reporter.config().setFilePath("C:\\User\\User\\Desktop\\Reporter\\Reports.html");
		logger.log(Status.INFO, "1");
		extent.flush();

	}

	public void ReporterOnFail(ITestResult result) {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\User\\Desktop\\Reporter" + "\\Reports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Test" + result);
		logger.log(Status.FAIL, "fail");
		extent.flush();

	}

}
