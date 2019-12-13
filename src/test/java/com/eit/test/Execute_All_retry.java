package com.eit.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Execute_All_retry implements IAnnotationTransformer {
	 
	 @SuppressWarnings("rawtypes")
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	 annotation.setRetryAnalyzer(Execute_retry.class);
	 }


	}