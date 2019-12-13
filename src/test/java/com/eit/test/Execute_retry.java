package com.eit.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Execute_retry implements IRetryAnalyzer {
int min=0,max=1;
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
			
		}
		return false;
	}

	}
