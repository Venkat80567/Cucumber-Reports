Feature: user registers a facebook account and validate the number of images

  Background: 
    user is on the facebook page


  @venkat
  Scenario: user validate the number of images
    When user get the no.of images
    Then user validate the no.of images in the homepage
