$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "Google Test case",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": ": Verifying Google Search Engine",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Google Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSteps.get_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for",
  "rows": [
    {
      "cells": [
        "cucumber"
      ]
    },
    {
      "cells": [
        "java"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSteps.EnterSearchText(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSteps.ClickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Results for Cucumber is available",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSteps.VerifyResult()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat org.junit.Assert.assertFalse(Assert.java:74)\r\n\tat helloCucumber.GoogleSteps.VerifyResult(GoogleSteps.java:48)\r\n\tat ✽.Search Results for Cucumber is available(file:src/test/resources/features/test.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/test2.feature");
formatter.feature({
  "name": "Facebook Test case",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": ": Verifying Facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Facebook Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookSteps.loginFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});