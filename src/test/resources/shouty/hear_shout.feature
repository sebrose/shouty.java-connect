#Feature: Hear Shout
#
#  Scenario: In-range shout is heard
#    Given Sean is at 0, 0
#    And Lucy is at 900, 0
#    When Sean shouts
#    Then Lucy should hear Sean
#
#
#  Scenario: Out-of-range shout is not heard
#    Given Sean is at 0, 0
#    And Lucy is at 1200, 0
#    When Sean shouts
#    Then Lucy should not hear Sean
#
#  Scenario: Business shout in-range based on origin
#    Given Sean is at 99999, 99999
#    And Lucy is at 900, 0
#    When Sean's shout originates from 0, 0
#    Then Lucy should hear Sean
#
#  Scenario: Business shout out-of-range based on origin
#    Given Sean is at 0, 0
#    And Lucy is at 900, 0
#    When Sean's shout originates from 9999, 9999
#    Then Lucy should not hear Sean
