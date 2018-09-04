package com.Parcels.stepDefinition;

import com.Parcels.enums.Browsers;
import com.Parcels.managers.FileReaderManager;
import com.Parcels.testbase.TestBase;


import com.cucumber.listener.Reporter;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.File;

public class ServiceHooks {
	TestBase testBase;

	@Before
	public void initializeTest(){
		testBase = new TestBase();
		//testBase.selectBrowser(Browsers.CHROME.name());
		testBase.selectBrowser(Browsers.FIREFOX.name());
	}

	@After
	public void endTest(){
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		TestBase.driver.quit();
	}
	}

