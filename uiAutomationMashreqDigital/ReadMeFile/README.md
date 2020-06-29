Mashreq Ditial Bank Web Automation (Selenium-Java)
=====================================

This automation frame work is based on Page Object Model (POM) design pattern.This project contains the automation source code which automates QA flows for Mashreq Ditial Bank  WebSite. The automation source is based
on Selenium (WebDriver).

Framework Structure:
===================
As I informed ,frame work is based on Page Object Model (POM) design pattern where every web page will have corresponding Java class.

1.Created packages and classes for HomePage and Contact Page under package called src/main/java"com.test.uiAutomation.MasherqDigital.uiActions.WebPages". These classes have all the web elements stored using Page factory and created methods to perform actions on web elements

2.Created packages and classes for HomePage test cases and Contact Page test cases under package called src/test/java"com.test.uiAutomation.MasherqDigital.ContactPage". These classes have all the web elements stored using Page factory and created methods to perform actions on web elements

3.Created a class called "Testbase.java" .All classes extends this parent class.


System Requirement:
===================

* Eclpise IDE (for your OS, use the latest version)
* Java 8 (Downloaded and installed )
* Git command line tools and integration (Optional)

Technology Resources Used
===========================
Project is created with:
* Selenium Java version : 3.141.59
* TestNG version: 6.14.3
* Chrome browser version : Version 75.0.3770.142 (Official Build) (64-bit)

Skill Requirement
=================
* Hands-on coding knowledge in Java (Core Java at least)
* Selenium 3
* Java Collection useful utilities(List,Set etc.,)

Importing the Project
=====================
Download the project from below github repository :



The project is based on **Maven**, and Eclipse IDE natively supports Maven based projects, so the simple option is to import the project in Eclipse IDE like this:

```File  --> New --> Project from Existing Sources...```

Once imported it should automatically resolve all necessary Maven dependencies if required.


Configuration
=============
You may need to follow the configurations below:
1.To setup test for browsers (chrome or firefox), provide data in "config.properties" file defined in package called "com.test.uiAutomation.MasherqDigital.config"
2.To supply test data to TCs , set it from in "testdata.properties" file defined in package called "com.test.uiAutomation.MasherqDigital.config"

To Trigger Scripts
===================
After import before you can run the TestNg.xml(Right click->Run As-> TestNG Suite) suite from Eclipse 

Report and Screen Shots
=======================
1.Extent report getting generated in package called as "com.test.automation.uiAutomation.report" after successful run 
2.Emailable report is getting generated in "test-output" folder in html format.
3.Screen shot for passed and failed TCs are stored in packed called "com.test.automation.uiAutomation.screenshot"

