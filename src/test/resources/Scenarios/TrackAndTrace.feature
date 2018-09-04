@TestcaseP2R4
Feature: Parcel2Release4 Track and Trace Application
Scenario: TrackAndTrace
Given launch the url "https://www.royalmail.com/"
Then click on Track your item
#Then Verify text Track your item
Then I Enter the barcode "sfs6s587s6d"
Then click on Track your delivery

