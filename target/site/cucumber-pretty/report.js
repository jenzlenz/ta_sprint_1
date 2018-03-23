$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotels.feature");
formatter.feature({
  "line": 2,
  "name": "Verification of Hotels homepage data",
  "description": "",
  "id": "verification-of-hotels-homepage-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@hotels"
    }
  ]
});
formatter.before({
  "duration": 11094234270,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on hotels home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD.iAmOnHotelsHomePage()"
});
formatter.result({
  "duration": 744815602,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#  # JIRA ticket TA4:"
    }
  ],
  "line": 8,
  "name": "Verify user is able to successfully search for hotels",
  "description": "",
  "id": "verification-of-hotels-homepage-data;verify-user-is-able-to-successfully-search-for-hotels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I enter Milwaukee in destination and select Milwaukee, Milwuakee County, United States of America on hotels.com home screen",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select check in for tomorrows date",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select check out date 6 days later",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the number of nights is 6",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I select Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select 1 room",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select 2 adults",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select 2 children",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select age 2 for child 1",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select age 1 for child 2",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Search to get hotel results",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify search results page displays correct options chosen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Milwaukee",
      "offset": 8
    },
    {
      "val": "Milwaukee, Milwuakee County, United States of America",
      "offset": 44
    }
  ],
  "location": "HotelsSD.enterDestination(String,String)"
});
formatter.result({
  "duration": 8886439996,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectCheckInTomorrow()"
});
formatter.result({
  "duration": 9992426596,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectCheckOutSixDaysLater()"
});
formatter.result({
  "duration": 10002813725,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.verifyNumberOfNights()"
});
formatter.result({
  "duration": 38230654,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectRooms()"
});
formatter.result({
  "duration": 278109891,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectNumberOfRooms()"
});
formatter.result({
  "duration": 271647550,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectAdults()"
});
formatter.result({
  "duration": 449699292,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectChildren()"
});
formatter.result({
  "duration": 511055180,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectAgeOfChild1()"
});
formatter.result({
  "duration": 573289579,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.selectAgeOfChild2()"
});
formatter.result({
  "duration": 439026269,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.clickSearch()"
});
formatter.result({
  "duration": 1633291924,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.verifySearchResultHeaderInfo()"
});
formatter.result({
  "duration": 675197663,
  "status": "passed"
});
formatter.after({
  "duration": 393255778,
  "status": "passed"
});
});