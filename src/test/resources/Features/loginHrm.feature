Feature: orangehrmlogin

@t
Scenario: login in orange hrm page
Given lauching chrome
When going to login page
Then enter username and password
And click on logn button
Then veify user in home page