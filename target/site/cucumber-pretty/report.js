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
  "duration": 18337876913,
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
  "duration": 2948715739,
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
  "duration": 3404917932,
  "status": "passed"
});
formatter.after({
  "duration": 68005401,
  "status": "passed"
});
});