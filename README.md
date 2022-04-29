# issue 3686
### Summary
- add `google-services.json`
### Steps to reproduce
1. Create a InAppMessaging campaign through Firebase Console
    - Add a title, body, image, button with action
2. Open app, search for your installation ID, add this to the `Test on device` in InAppMessaging campaign
    - Search for `I/FIAM.Headless: Starting InAppMessaging runtime with Installation ID YOUR_INSTALLATION_ID` on the debug logs
3. Exit the app
4. Click the `Test` button on the InAppMessaging campaign
5. Open app, and check logs. It will display `java.lang.IllegalArgumentException: Modal model must have a title.`
    - This is received from the implemented `FirebaseInAppMessagingClickListener`
