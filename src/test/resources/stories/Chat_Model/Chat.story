
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

Scenario: Chat options
Given user is on the OCOM  page
When the user clicks on the chat icon
Then modal must show chat options

Scenario: Start the chat with an agent
Given user opened chat modal on OCOM page
When the user clicks on CTA link
Then chat forms must open


Scenario: Start a chat with an agent
Given user opened chat modal on OCOM page
When the user click on CTA link
Then support options page must open

Scenario: Chat form field
Given user clicked start chat
When chat form opens
Then user must view form fields


Scenario: Browser page
Given user opened chat form
When user browsers the website
Then chat form must not close


Scenario: Chat form validation
Given user opened chat form
When mandatory fields are not filled
Then form must not be submitted