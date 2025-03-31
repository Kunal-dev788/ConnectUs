# Video Calling Meeting App - Android

## Overview

This Android application is a video calling meeting app built using Java and the Jitsi SDK. It provides a full set of features for online video conferences, including user login & signup, private chat rooms, and support for up to 75+ participants in a video call. The app allows users to record video calls, stream them live on YouTube, and offers front/back camera support with various controls like muting audio, disabling video, and inviting friends to join.

## Features

- **User Authentication**: Sign up and login using Firebase Authentication.
- **Video Calling**: Full video call functionality using the Jitsi SDK.
- **Private Chat Rooms**: Create and join private chat rooms.
- **Multiple Participants**: Support for up to 75+ participants in a video call.
- **Video Call Recording**: Record the video call and save it for later reference.
- **YouTube Live Streaming**: Stream your video calls live to YouTube.
- **Camera Support**: Front and back camera options available during the video call.
- **Audio/Video Controls**: Mute audio, disable video, and manage your camera preferences.
- **Invite Friends**: Share the meeting link and invite friends to join the call.

## Technologies Used

- **Java**: Programming language for building the Android app.
- **Jitsi SDK**: For video calling functionality.
- **Firebase**: Used for authentication (Firebase Auth) and data storage (Firestore).
- **ConstraintLayout**: For designing responsive and flexible UI layouts.
- **Drawables**: For custom UI elements such as buttons, icons, and backgrounds.

## Setup Instructions

### Prerequisites

Before running this app, make sure you have the following installed:

- [Android Studio](https://developer.android.com/studio) - For developing Android apps.
- [Jitsi SDK](https://github.com/jitsi/jitsi-meet) - To integrate video call functionality.
- [Firebase Account](https://firebase.google.com/) - For Firebase Authentication and Firestore.

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/video-calling-meeting-app.git
    cd video-calling-meeting-app
    ```

2. Open the project in Android Studio.

3. Install dependencies:
   - Make sure to add the Jitsi SDK dependency in your `build.gradle` file.
   - Set up Firebase Authentication and Firestore by adding the `google-services.json` file to your project. Follow Firebase documentation to generate this file.

4. Run the app on an emulator or physical device.

### Firebase Configuration

- Configure Firebase Auth and Firestore in your Firebase project.
- Enable Email/Password authentication and set up Firestore to store user data, meeting information, etc.
  
### Jitsi SDK Integration

To use the Jitsi SDK in your Android app, follow the integration guide in the Jitsi Meet SDK documentation to set it up.

## Screenshots
Here are some screenshots of the app:

Splash Screen
![ss1](https://github.com/user-attachments/assets/2bb153ee-d549-474c-befd-0579fec03584)

SignUp Screen
![ss3](https://github.com/user-attachments/assets/6b539332-a6b8-482d-83ee-c43c14274555)

Login Screen 
![ss2](https://github.com/user-attachments/assets/863016ee-cc12-4fec-8c19-7643ecfc4f1f)

Dashboard Screen
![ss4](https://github.com/user-attachments/assets/f074a55a-d8d4-40dc-b06e-22cd75e25c0d)

Connections SDK Screen
![ss5](https://github.com/user-attachments/assets/d3026378-628d-4794-af73-8279f9fa7d63)
![ss6](https://github.com/user-attachments/assets/95b1cf1a-f010-430b-b0ef-277d2c15baf5)
![ss7](https://github.com/user-attachments/assets/e0d213dd-2f18-486b-ae3b-1811e9844b3d)

## Demo
[demo.webm](https://github.com/user-attachments/assets/b68a5e86-1aa2-4e63-b3ab-cf5a539cd135)


## How to Use

1. **Sign Up & Login**: Open the app and either sign up for a new account or log in with your existing credentials.
2. **Start a Video Call**: Once logged in, create or join a meeting room, and start a video call.
3. **Invite Friends**: Share the meeting link with your friends to invite them.
4. **Live Streaming**: Stream your video call live on YouTube by linking your account.
5. **Recording**: Record your video calls for later viewing or sharing.

## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request. Here are some ways you can help:

- Bug fixes or feature enhancements.
- UI/UX improvements.
- Documentation updates.

---

Feel free to reach out with any questions or suggestions!
