package com.eit.listner;


import java.io.File;
 

import org.testng.ITestResult;

import org.testng.Reporter;

import org.testng.TestListenerAdapter;
import org.testng.internal.BaseClassFinder;

 

public class Screenshots extends TestListenerAdapter {

 

@Override

public void onTestFailure(ITestResult result) {

File file = new File("");

 

Reporter.setCurrentTestResult(result);

System.out.println(file.getAbsolutePath());

Reporter.log(file.getAbsolutePath());

 

Reporter.log("screenshot saved at "+file.getAbsolutePath()+"\\reports\\"+result.getName()+".jpg");

//Reporter.log("<a <span id="IL_AD11" class="IL_AD">href</span>='..\"+result.getName()+".jpg' <img src='..\"+result.getName()+".jpg' hight='100' width='100'/> </a>");

//BaseClassFinder.selenium.captureScreenshot(file.getAbsolutePath()+"\\reports\\"+result.getName()+".jpg");

Reporter.setCurrentTestResult(null);

}

 

 

@Override

public void onTestSkipped(ITestResult result) {

// will be called after test will be skipped
}
@Override
public void onTestSuccess(ITestResult result) {
// will be called after test will pass

}

}