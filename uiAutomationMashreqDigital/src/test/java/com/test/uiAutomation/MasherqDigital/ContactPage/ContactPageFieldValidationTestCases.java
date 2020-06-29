package com.test.uiAutomation.MasherqDigital.ContactPage;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.uiAutomation.MasherqDigital.data.PropReadData;
import com.test.uiAutomation.MasherqDigital.testBase.TestBase;
import com.test.uiAutomation.MasherqDigital.uiActions.WebPages.ContactPageMashreqDigital;
import com.test.uiAutomation.MasherqDigital.uiActions.WebPages.HomePageMashreqDigital;

public class ContactPageFieldValidationTestCases extends TestBase {
	HomePageMashreqDigital homepageObj;
	ContactPageMashreqDigital contactpageObj;
	PropReadData readData;
	
	@BeforeClass
	public void setUp() throws IOException {
      init(); 
      
	}
	
	@Test(priority=4,description="This test case Validates-Entering a number that is less or greater than 7 digits in the “Mobile Number” field should show an error. Entering a number that is 7 digits should not show an error ")
	public void ContactPageTC001_verifyPhoneNumberField() {
		
		try {
			log.info("=======Starting Mobile field test========");
			
			/**
			 * Created page objects for home page and contact page to access class members to form TC
			 */
			homepageObj = new  HomePageMashreqDigital(driver);
			contactpageObj=new ContactPageMashreqDigital(driver);
			readData=new PropReadData();
			
			 
			
			homepageObj.ClickMasterToolTips(PropReadData.PropGetData("clickToolTip"));
			
			
			//Entered less than 7 digits to check error message
			contactpageObj.Txt_EnterMobileNum(PropReadData.PropGetData("mobilenum"));
			
			log.info("=======Finished Mobile field  test========");
			getScreenShot("Mobile field  test========");
		} catch (Exception e) {
           getScreenShot("Mobile field  test========");
		}
		
		
	}
	
	@Test(priority=5,description="This test case displays number of items in <I am looking to…> dropdown list and select one set by user")
	public void ContactPageTC002_verify_Iamlookingto() {
		
		try {
			log.info("=======Starting <I am looking to…> dropdown list test========");
			homepageObj = new  HomePageMashreqDigital(driver);
			contactpageObj=new ContactPageMashreqDigital(driver);
			readData=new PropReadData();
			homepageObj.ClickMasterToolTips(PropReadData.PropGetData("clickToolTip"));
			
			contactpageObj.Contactform_Field_Iamlookingto_dropdown(PropReadData.PropGetData("Iamlookingto"));
			
			
			log.info("=======Finished <I am looking to…> dropdown list test========");
			getScreenShot("I am looking to  test========");
		} catch (Exception e) {
           getScreenShot(" I am looking to  test========");
		}
		
		
	}
	
	@Test(priority=6,description="This test case Validates for all valid data for contact form ")
	public void ContactPageTC003_verifyContactFormFields_validdata() {
		
		try {
			log.info("=======Starting valid data for contact form  test========");
			
			/**
			 * Created page objects for home page and contact page to access class members to form TC
			 */
			homepageObj = new  HomePageMashreqDigital(driver);
			contactpageObj=new ContactPageMashreqDigital(driver);
			readData=new PropReadData();//To read data from property file
			 
			
			homepageObj.ClickMasterToolTips(PropReadData.PropGetData("clickToolTip"));
			
			//enter data to all fields in contact form 
			
			contactpageObj.Contactform_Field_Iamlookingto_dropdown(PropReadData.PropGetData("Iamlookingto"));
			contactpageObj.Contactform_ComplaintInquirySerivce_dropdown(PropReadData.PropGetData("ComplaintInquirySerivce"));
			contactpageObj.Contactform_SelectProduct_dropdownItems(PropReadData.PropGetData("SelectProduct"));
			contactpageObj.Contactform_SelectSubProduct_dropdown(PropReadData.PropGetData("SelectSubProduct"));
			contactpageObj.Contactform_SelectEmirates_dropdown(PropReadData.PropGetData("SelectEmirates"));
			contactpageObj.Contactform_SelectBranch_dropdown(PropReadData.PropGetData("SelectBranch"));
			contactpageObj.Contactform_SelectPrefLanguage_dropdown(PropReadData.PropGetData("SelectPrefLanguage"));
			contactpageObj.Contactform_SelectCustomer_dropdown(PropReadData.PropGetData("SelectCustomer"));
			contactpageObj.Txt_EnterFirstName(PropReadData.PropGetData("Firstname"));
			contactpageObj.Txt_EnterLatstName(PropReadData.PropGetData("Lastname"));
			contactpageObj.Txt_EnterEmail(PropReadData.PropGetData("Email"));
			contactpageObj.Txt_EnterMobileNum(PropReadData.PropGetData("mobilenum"));
			contactpageObj.btn_Submit.click();
			
			log.info("=======Finished valid data for contact form  test========");
			getScreenShot("valid data for contact form ========");
		} catch (Exception e) {
           getScreenShot("valid data for contact form ========");
		}		
	}
}
