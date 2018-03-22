
Narrative:
In order to open chat modal
As a user
I want to click chat icon

Scenario: Chat icon global header
Given user is on the OCOM  page
When the page loads
Then chat icon must appear in global header

Scenario: Chat icon side wall
Given user is on the OCOM  page
When the page loads
Then chat icon must appear on the side wall

Scenario: Start chat with agent from proactive chat window
Given user is on the OCOM  page
When proactive chat appears
Then user clicks on start chat button
Then chat form must open

Scenario: Close proactive chat window
Given user is on the OCOM  page
When proactive chat appears
Then user clicks x
Then chat form must not open
