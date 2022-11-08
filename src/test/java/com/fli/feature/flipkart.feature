@Flipkart
Feature: Flipkart testing

Background:
  Given Enter the url
  And close the popup
  
@laptop
  Scenario: select the lowest price laptop and add to cart
  When move to electronics
  And move to Laptop and Desktops
  Then validate the laptop  