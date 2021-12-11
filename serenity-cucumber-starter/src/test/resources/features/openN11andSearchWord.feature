Feature: Open n11 and Search word
#  (ex:winter tire)

  Scenario: Open n11
    Given customer is open the n11 html main page
    When customer search "winter tire"
    And  customer Sees "winter tire" prices
    Then customer Adds the cheapest "winter tire" to the shopping cart

