# OnlineBookClub
Design Patterns
- Subscription Management
  - Command Pattern - In SubManagement > Controller > Modify Subs, the 'deleteSub' method stores 'currentSub' variable which is inputted by the user. When the user wants calls 'deleteSub', the function calls the previous stored state and delete the Subscription.
  - Wizard Pattern - Guides the user in the subscription payment process. Here are the steps:
    1. Click User profile
    2. Click into Subscription Status
    3. Modify Subscription
    4. Choose Subscription Plan (free, premium)
    5. Add Payment Method
       6. Add First Name
       7. Add Last Name
       8. Choose Payment Type
       9. Add Payment Informatoin
       10. Save & Submit
       11. "You have successfully subscribed for the Premium Subscription" Message!

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

