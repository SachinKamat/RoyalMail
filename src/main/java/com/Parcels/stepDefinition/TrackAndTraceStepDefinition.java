package com.Parcels.stepDefinition;

import cucumber.api.PendingException;
import org.openqa.selenium.By;

import com.Parcels.pages.TrackAndTracePages;
import com.Parcels.testbase.TestBase;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TrackAndTraceStepDefinition extends TestBase {

	TrackAndTracePages TrackAndTracePages = new TrackAndTracePages(driver);
	
	@Given("^launch the url \"([^\"]*)\"$")
	public void launch_the_url(String arg1) throws Throwable {
		driver.get(arg1);
	    Thread.sleep(1000);
	}
	
	@Then("^click on Track your item$")
	public void click_on_Track_your_item() throws Throwable {
		TrackAndTracePages.ClickOnTrackYourItem();
	}
	@Then("^Verify text Track your item$")
	public void verify_text_Track_your_item() throws Throwable {
	   TrackAndTracePages.TextTrackYourDelivery.isDisplayed();
	}
	
//	@Then("^Enter the barcode$")
//	public void enter_the_barcode() throws Throwable {
//		TrackAndTracePages.EnterBarcode();
//	}

	@Then("^click on Track your delivery$")
	public void click_on_Track_your_delivery() throws Throwable {
	   TrackAndTracePages.ClickonTrackYourDelivery();
	}

    @Then("^I Enter the barcode \"([^\"]*)\"$")
    public void iEnterTheBarcode(String barCode) throws Throwable {
		TrackAndTracePages.EnterBarcode(barCode);
    }
}