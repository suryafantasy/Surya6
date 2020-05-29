$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Muthukumar/eclipse-workspace/SampleBDD/src/main/java/com/feature/scenario1.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on clear cookies button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User gives input as",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user sort the price details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdef.user_is_on_home_page()"
});
formatter.result({
  "duration": 24028395400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_click_on_clear_cookies_button()"
});
formatter.result({
  "duration": 391073800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_gives_input_as()"
});
formatter.result({
  "duration": 8449105400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_sort_the_price_details()"
});
formatter.result({
  "duration": 52301928900,
  "status": "passed"
});
});