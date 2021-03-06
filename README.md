## JetLink Android SDK
[![Website](https://app.jetlink.io/Assets/img/jetlink-logo-medium.png)](https://jetlink.io)
### [Official Website](https://jetlink.io/)

Messaging platform for easy commerce and better support.

##### Quick Steps

App Module gradle file **(app/build.gradle)**
```
dependencies {
      compile('com.veslabs.jetlink:jetlinklibrary:1.1.12@aar') {
        transitive = true
    }
}
```

That's All! JetLink is ready to go! Now, you have a messaging module in your app.

Congratulations!!!



----------------------------------------------------------------------------------------


## HOW TO USE JETLINK

### 1. Add dependencies to our app module's Gradle file. (project/app/build.gradle)

```
dependencies {
        compile('com.veslabs.jetlink:jetlinklibrary:1.1.12@aar') {
        transitive = true
    }

}
```


And your minSdkVersion must at least be 16.


### 2. Initialize JetLink

Add the following to your app's launcher activity’s onCreate() method. Please ensure JetLink.init() is invoked before you use any feature of JetLink SDK. 
Don't forget to replace the <YOUR-APP-ID> and <YOUR-APP-KEY> in the following code snippet with the actual app ID and app key.   

```
	JetlinkConfig jetlinkConfig = new JetlinkConfig("<YOUR-APP-ID>", "<YOUR-APP-KEY>");


```


### 3. Initialize User

You can send basic user information at the beginning to give you more context on the user when your support agents are messaging back and forth with them.         
```
	JetLinkUser user = new JetLinkUser();
	user.setEmail("salman.khan@veslabs.com");
	user.setName("Salman");
	user.setSurname("Khan");
	JetLinkApp.getInstance(getApplicationContext()).setUser(user);
	JetLinkApp.getInstance(getApplicationContext()).init(jetlinkConfig);
```


### 4. Call the Chat Activity

Just call JetLinkChatActivity and it will open a ready-to-use chat screen;

```
Intent intent = new Intent(MainActivity.this, JetLinkChatActivity.class);
startActivity(intent);
```

### 5. Offline Messages (Push Notifications)

You need to integrate Firebase Cloud Messaging (FCM) into your app in order to get messages while your app is killed. 
Because this mechanism uses push messages to trigger Jetlink and Jetlink works with Firebase Cloud Messaging System of Google.

[For Firebase Cloud Messaging integration please click.](https://github.com/jetlinkio/jetlink-android-sdk/wiki/Notification-Message-Integration)

## VIDEO TUTORIAL
Altough we have clearly explained everthing, a video tutorial may still be helpful.

[![IMAGE ALT TEXT HERE](https://github.com/jetlinkio/jetlink-android-sdk/blob/master/app/src/main/res/mipmap-hdpi/jetlink_Youtube_Video2.png)](https://www.youtube.com/watch?v=LmoE6XGCl0c)
