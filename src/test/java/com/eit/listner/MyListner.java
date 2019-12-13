package com.eit.listner;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.eit.resource.base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class MyListner implements ITestListener {
 protected static WebDriver driver;                            
 protected static ExtentReports reports;
 protected static ExtentTest test;
 public void onTestStart(ITestResult result) {
  System.out.println("on test start");
  test = reports.startTest(result.getMethod().getMethodName());
  test.log(LogStatus.INFO, result.getMethod().getMethodName() + "test is started");
 }
 public void onTestSuccess(ITestResult result) {
  System.out.println("on test success");
  test.log(LogStatus.PASS, result.getMethod().getMethodName() + "test is passed");
 }
 public void onTestFailure(ITestResult result) {
  System.out.println("on test failure");
  test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed");
TakesScreenshot ts = (TakesScreenshot) base.driv;
  File src = ts.getScreenshotAs(OutputType.FILE);
  try {
   FileUtils.copyFile(src, new File("E:\\REPORT\\Screenshot\\" + result.getMethod().getMethodName() + ".png"));
   String file = test.addScreenCapture("E:\\REPORT\\Screenshot\\" + result.getMethod().getMethodName() + ".png");
   test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed", file);
   test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed", result.getThrowable().getMessage());
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
 public void onTestSkipped(ITestResult result) {
  System.out.println("on test skipped");
  test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");
 }
 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
  System.out.println("on test sucess within percentage");
 }
 public void onStart(ITestContext context) {
  System.out.println("on start");// Set the drivers path in environment variables to avoid code(System.setProperty())

  try {
	FileUtils.forceDelete(new File("E:\\REPORT\\Screenshot"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  reports = new ExtentReports("E:\\Eit_track\\REPORT\\Screenshot\\Extend-reports.html");
 }
 public void onFinish(ITestContext context) {
  System.out.println("on finish");
  reports.endTest(test);
  reports.flush();
 }
}