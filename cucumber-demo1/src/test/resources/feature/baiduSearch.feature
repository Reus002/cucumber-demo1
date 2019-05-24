@smoke
Feature: Demo
  open Daidu and search something

  Scenario: baidu search
    Given go to baidu home
    And search "selenium"
    And click the search button
    Then the url contains "selenium"

  Scenario: baidu search
    Given go to baidu home
    And search "selenium"
    And click the search button
    Then the url contains "selenium"