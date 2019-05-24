$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("baiduSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Demo",
  "description": "open Daidu and search something",
  "id": "demo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 5254560799,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "baidu search",
  "description": "",
  "id": "demo;baidu-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "go to baidu home",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "search \"selenium\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the url contains \"selenium\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BaiduSearchSteps.goToBaiduHome()"
});
formatter.result({
  "duration": 1811138632,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 8
    }
  ],
  "location": "BaiduSearchSteps.search(String)"
});
formatter.result({
  "duration": 4310065170,
  "status": "passed"
});
formatter.match({
  "location": "BaiduSearchSteps.clickTheSearchButton()"
});
formatter.result({
  "duration": 4114466252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 18
    }
  ],
  "location": "BaiduSearchSteps.theUrlContains(String)"
});
formatter.result({
  "duration": 4164598783,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3242705139,
  "status": "passed"
});
});