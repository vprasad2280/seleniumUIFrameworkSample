package com.test.uiAutomation.MasherqDigital.HomePage;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.uiAutomation.MasherqDigital.data.PropReadData;
import com.test.uiAutomation.MasherqDigital.testBase.TestBase;
import com.test.uiAutomation.MasherqDigital.uiActions.WebPages.HomePageMashreqDigital;

public class HomePageTestCases extends TestBase{
	HomePageMashreqDigital homepage;
	PropReadData readData;
	
	
	@BeforeClass
	public void setUp() throws IOException {
		//init method will setup environment to launch browser & data from config proprties
      init(); 
	}

	@Test(priority=1,description="-	This TC displays the navigation links should be visible on desktop devices and display 9 items: Corporate, Business, International etc ")
	public void HomePageTC001_verifyNavigationlinks() {
		try {
			log.info("=======Starting verifylinks test========");
			/**
			 * Created page objects for home page  to access class members to form TCs
			 */
			homepage = new  HomePageMashreqDigital(driver);
			PropReadData readData=new PropReadData();
			
			homepage.NavigationMenuLinks();
			
			log.info("=======Finished verifylink test========");
			getScreenShot("verifylink");
		} catch (Exception e) {
           getScreenShot("verifyLink");
		}
	}

	@Test(priority=2,description="this test case click on navigationl link of user choice")
	public void  HomePageTC002_ClickNavlink() {
		try {
			log.info("=======Starting click menu link test========");
			homepage = new  HomePageMashreqDigital(driver);
			
			//clicking on "Business" navigation link
			homepage.SelectnClickNavigationMenuLinks(PropReadData.PropGetData("clicknavlink"));
			
			log.info("=======Finished click menu link test========");
			getScreenShot("click menu link");
		} catch (Exception e) {
           getScreenShot("click menu link");
		}
	}
	
		@Test(priority=3,description="This test case click tooltip link of user choice")
		public void HomePageTC003_ClicTooltiplink()
		{
			try {
				log.info("=======Starting tooltip link  test========");
				homepage = new  HomePageMashreqDigital(driver);
				//clicking on "Contact"link from tool tips
				homepage.ClickMasterToolTips(PropReadData.PropGetData("clickToolTip"));//click on contact
				String ActualContactctpagelink=driver.getCurrentUrl();
				String expexctedContactpagelink="https://www.mashreqbank.com/uae/en/personal/contactus";
				if(expexctedContactpagelink.equalsIgnoreCase(ActualContactctpagelink))
				{
					System.out.println("Contact page is loaded sucessfully" );
				}
				else
					System.out.println("Contact page is not loaded sucessfully" );
				log.info("=======Finished tooltip link  test========");
				getScreenShot("tooltip link ");
			} catch (Exception e) {
	           getScreenShot("tooltip link ");
			}
		}
	
	//closing browser after test
	@AfterClass
	public void endTest()
	{ 
      closeBrowser();
      }
	


}