$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddTariffPlan.feature");
formatter.feature({
  "name": "Add Tariff Plan feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add tariff plan validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffplanSteps.user_click_on_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill up the plan details",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffplanSteps.user_fill_up_the_plan_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffplanSteps.user_clicked_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be displayed congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffplanSteps.user_should_be_displayed_congratulation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});