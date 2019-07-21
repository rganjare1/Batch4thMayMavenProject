package com.companyName.projectName.module.testCases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.companyName.projectName.module.pages.LandingPage;
import com.companyName.projectName.module.testBase4thMay.TastBase4thMay;

public class TC006_Create_An_Account extends TastBase4thMay {
	
	
	@Test(dataProvider = "Data_Collections")
	public void TC005_Create_an_Account(Hashtable <String, String> htdata) throws InterruptedException {
		
	//Keyword Driven:- Code defination and Test data in a Test case
	//Data Driven:- Code defination and Test data passing Xlsx files in a Test case	
	//Hybrid = Keyword	+ Data Driven + Page Factory concept + Page Object Model
		
	launchBrowser();
		
	//CommonMethods.verifyRedirectedURL();
	
	//CommonMethods.signUpToApplication();
			
	closeBrowser();
		
	}
	
}
