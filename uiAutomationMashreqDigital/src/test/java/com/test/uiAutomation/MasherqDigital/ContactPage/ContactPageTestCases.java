package com.test.uiAutomation.MasherqDigital.ContactPage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.uiAutomation.MasherqDigital.data.PropReadData;
import com.test.uiAutomation.MasherqDigital.excelReader.Excel_Reader;
import com.test.uiAutomation.MasherqDigital.testBase.TestBase;
import com.test.uiAutomation.MasherqDigital.uiActions.WebPages.ContactPageMashreqDigital;
import com.test.uiAutomation.MasherqDigital.uiActions.WebPages.HomePageMashreqDigital;

public class ContactPageTestCases extends TestBase {

HomePageMashreqDigital homepageObj;
ContactPageMashreqDigital contactpageObj;
PropReadData readData;


	@BeforeClass
	public void setUp() throws IOException {
      init(); 
   
	}

	@Test(priority=7,description="This test case display tooltip links list and clicks contact page link ")
	
	public void verifyContactFormFields() {
		
		try {
			log.info("=======Starting Contact form  test========");
			
			/**
			 * Created page objects for homepage and contact page to access class members to form TC
			 */
			homepageObj = new  HomePageMashreqDigital(driver);
			contactpageObj=new ContactPageMashreqDigital(driver);
			PropReadData readData=new PropReadData();
			
			//click on contact link 
			homepageObj.ClickMasterToolTips(PropReadData.PropGetData("clickToolTip"));
			
			log.info("=======Finished Contact form  test========");
			getScreenShot("Contact form test========");
		} catch (Exception e) {
           getScreenShot("Contact form test========");
		}
		
		
	}
	
}
