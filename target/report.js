$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Add customer flow validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Customer by using scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_clicks_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill all the details",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_fill_all_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});