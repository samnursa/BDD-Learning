Feature: Login
    Perform login on email and password are inputted

    Rule: email must be in email format and password should be more than 6 contains characters and number
        Scenario Outline: Input email and password in wrong format
            Given The app started
            When I input email <email>
            And I input password <password>
            Then I should see error on the <view>

            Examples:
            | email | password  | view  |
            | test  | lemoncake | email |
            | test@test.com | 1234 | password |

        Scenario Outline: Input email and password in correct format
            Given The app started
            When I input email <email>
            And I input password <password>
            Then I should <see> error on the view

            Examples:
            | email              | password   | see   |
            | espresso@spoon.com | bananacake | false  |

#        Scenario: Tap Sign up button
#            Given The app started
#            When I tap sign up button
#            Then I should see sign up screen