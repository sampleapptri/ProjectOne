package TricentisApp;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import resources.Reporter;
import resources.base;

public class listeners implements ITestListener {
	
	
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	base s = new base();

	public void onTestStart(ITestResult result) {
		System.out.println("Test getting started");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test succesfully executed");
		Reporter report = new Reporter();
		report.Reportsuccess(result);
	}

	public void onTestFailure(ITestResult result) {
		Reporter report = new Reporter();
		report.ReporterOnFail(result);
		log.error("Test failed! " + "Screenshot has been saved locally");

		try {
			s.getScreenshot(result.getName());

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
