Feature: Shout a message and get heard

  Scenario: Is within distance
    Given Lucy is at a distance of 15m from Sean
    When Sean shouts free bagels!!
    Then Lucy hears the shouted message

  Scenario: Is away
    Given Lucy is at a distance of 350m from Sean
    When Sean shouts hey lucy
    Then Lucy cannot hear anything


  Scenario: Shout back
    Given Lucy is at a distance of 15m from Sean
    When Lucy shouts back hey to Sean
    Then Sean hears the shouted message