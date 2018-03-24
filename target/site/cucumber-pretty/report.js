$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky.feature");
formatter.feature({
  "line": 2,
  "name": "Darksky homepage data",
  "description": "",
  "id": "darksky-homepage-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@darksky"
    }
  ]
});
formatter.before({
  "duration": 14393617359,
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
  "name": "I am on darksky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 927248243,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 18,
      "value": "#  #JIRA Ticket TA3"
    }
  ],
  "line": 20,
  "name": "Select Tomorrows date from Time Machine",
  "description": "",
  "id": "darksky-homepage-data;select-tomorrows-date-from-time-machine",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@darksky3"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I click on TimeMachine on darksky homepage",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I select tomorrows date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify selected date is NOT clickable",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I verify date is displayed in correct format",
  "keyword": "And "
});
formatter.match({
  "location": "DarkSkySD.clickTimeMachineButton()"
});
formatter.result({
  "duration": 503936772,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.selectTomorrowsDate()"
});
formatter.result({
  "duration": 15385634815,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifySelectedDateNotClickable()"
});
formatter.result({
  "duration": 35972127,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyDateIsInCorrectFormat()"
});
formatter.result({
  "duration": 35571884,
  "status": "passed"
});
formatter.after({
  "duration": 25650269,
  "status": "passed"
});
});