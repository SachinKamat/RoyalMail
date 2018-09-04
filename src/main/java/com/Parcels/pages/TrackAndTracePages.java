package com.Parcels.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Parcels.helper.LoggerHelper;

public class TrackAndTracePages {
private WebDriver driver;



private static Logger log = LoggerHelper.getLogger(TrackAndTracePages.class);
@FindBy(xpath="//li[@class='track']/a[text()='Track your item']")
WebElement TrackYourItem;

@FindBy(xpath="//*[@id='track-item']")
WebElement Barcode;

@FindBy(xpath="//*[contains(text(),'Track your delivery')]")
WebElement TrackYourDelivery;

@FindBy(xpath="//h1[contains(text(),'Track and Trace - Track your Item')]")
public WebElement TextTrackYourDelivery;//created as public so that we can access this webelement in Step definition

public TrackAndTracePages(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void ClickOnTrackYourItem(){
this.TrackYourItem.click();
}
public void EnterBarcode(String barCode){
	//log.info("enter the barcode:" +Barcode);
	this.Barcode.sendKeys(barCode);
}
public void ClickonTrackYourDelivery(){
	TrackYourDelivery.click();
}
public void VerifyTextTrackYourDelivery(){
	String expectedMessage = "Track and Trace - Track your Item";
	String message = driver.findElement(By.xpath("//h1[contains(text(),'Track and Trace - Track your Item')]")).getText();
	Assert.assertEquals("error message", message.contains(expectedMessage));
}
}
