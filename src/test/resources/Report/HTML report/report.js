$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginRegistration.feature");
formatter.feature({
  "name": "validate the login and registration",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "    user is on the facebook page",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "validate the text properties of create an account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@saran"
    }
  ]
});
formatter.step({
  "name": "user get the text properties of create an account",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.user_get_the_text_properties_of_create_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the text properties",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.user_verifies_the_text_properties()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});