$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/feature/techfios.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios Page",
  "description": "As a user I want to change the background color",
  "id": "techfios-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4003855476,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Valid users should be able to change background color to sky blue",
  "description": "",
  "id": "techfios-page;valid-users-should-be-able-to-change-background-color-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "SkyBlue Background button exists;",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on SkyBlue the button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "TechfiosSteps.skyblue_Background_button_exists()"
});
formatter.result({
  "duration": 170285840,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.i_click_on_SkyBlue_the_button()"
});
formatter.result({
  "duration": 47471324,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 33803660,
  "status": "passed"
});
formatter.before({
  "duration": 3007431542,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Valid users should be able to change background color to white",
  "description": "",
  "id": "techfios-page;valid-users-should-be-able-to-change-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on WhiteBackground the button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "TechfiosSteps.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 36789568,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.i_click_on_WhiteBackground_the_button()"
});
formatter.result({
  "duration": 126636010,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 35051187,
  "status": "passed"
});
});