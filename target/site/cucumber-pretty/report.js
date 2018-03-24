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
  "duration": 14580271057,
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
  "duration": 625061531,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 12,
      "value": "#  #JIRA Ticket TA2"
    }
  ],
  "line": 14,
  "name": "Verify low to high value is displayed correctly on weekly forecast section",
  "description": "",
  "id": "darksky-homepage-data;verify-low-to-high-value-is-displayed-correctly-on-weekly-forecast-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@darksky2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I click on todays bar on darksky homepage",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify low and high temp displayed correctly on parent bar",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.clickTodaysBar()"
});
formatter.result({
  "duration": 411832566,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyCorrectTempOnParentBar()"
});
formatter.result({
  "duration": 683817086,
  "status": "passed"
});
formatter.after({
  "duration": 27844609,
  "status": "passed"
});
});