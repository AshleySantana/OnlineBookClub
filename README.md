# OnlineBookClub
Design Patterns
- Subscription Management
  - Command Pattern - In SubManagement > Controller > Modify Subs, the 'deleteSub' method stores 'currentSub' variable which is inputted by the user. When the user wants calls 'deleteSub', the function calls the previous stored state and delete the Subscription.
  - Wizard Pattern - Guides the user in the subscription payment process. Here are the steps:
    1. View user profile
    2. Click “Change” button next to subscription status
    3. Click “Change to Premium” button
    4. Add payment method
       - Add first name
       - Add last name
       - Add credit card info
       - Add expiration date
    5. Click “Save & Submit” button
    6. Subscription changed and information saved message


- Track Progress
  - Observer Pattern
  - Dashboard Pattern
- Channels
  - Builder 
  - Follow Pattern
- Homepage & User
  - Observer Pattern
  - Infinite Scroll Pattern
- Meetings
  - Factory Method
  - Dealing with Data Pattern

---
3/9 M02 - M03: System Component API Stubs and Automated System Tests

Ashley - Added methods stubs for the Channel Controller class

Manali- added and tested Meeting model as well as adding method stubs. 

Britney - Implemented method stubs for every method exposed in the SubManagement 
Module and User class related to subscription and payment. Added related methods
in TestHarness class to exercise those methods.

Stephanie - Created, refactored and tested functions toward implementing the Channel class

Sereina - Created, refactored and tested functions toward implementing the Track Progress, library, and reading goal classes

---
Previous Assignment

Ashley - I contributed to the channel package.

Manali - I contributed and made to the MeetingBookClub package.

Britney - I worked on both the API design and the code implementation for the Subscription Management MVC.

Stephanie - I worked on the Channel Management MVC, and all the classes contained in the code logic

Sereina - I worked on both the API design and the code implementation for the Homepage and TrackProgress MVC.

