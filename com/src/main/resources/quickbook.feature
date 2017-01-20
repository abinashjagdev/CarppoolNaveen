Feature: Share my ride
Story as you like

Scenario: valid post with successful message
Given employee "naveen" enter details like "office" as source, "home" as destination and time is "5:30pm"
And his email is "naveendash@gmail.com" and phone is "909898000"
When click on "Share"
Then data get saved and message "Posting was successful." get dispplayed with "OK" button
And clicking on "OK" will take him to "Home" page.

Scenario: Invalid post with error message
Given employee " " enter details like "office" as source, "home" as destination and time is "5:30pm"
And his email is "naveendash@gmail.com" and phone is "909898000"
When click on "Share"
Then data get saved and message "Posting was successful." get dispplayed with "OK" button
And clicking on "OK" will take him to "Home" page.