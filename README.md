ParseCom-Android-Sample
=======================

Just a Simple Sample.
before run the project, pls register a developer account on parser.com
and change the  following lines in 

```php
/src/com/parse/starter/ParseApplication.java 
16     // Add your initialization code here
17    Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
```

```bash
curl -X POST \
  -H "X-Parse-Application-Id: YOUR_APPLICATION_ID" \
  -H "X-Parse-REST-API-Key: YOUR_REST_API_KEY" \
  -H "Content-Type: application/json" \
  -d '{
        "type": "android",
        "channels": [
          "YOUR_CHANNEL_SUBSCRIBED"
        ],
        "data": {
          "command": "Hello world",
          "action": "YOUR_COMPONENT_INTENT",
          "location": "China",
          "date": "2012-12-12 12:12:12"
        }
      }' \
     https://api.parse.com/1/push
```

To check the received data pushed on Android Client by this command: 

```bash
adb catlog | grep  TAG
```

TAG is the member variable in you component class.


You can replace the 

```bash
          "action": "YOUR_COMPONENT_INTENT",
```

with the following lines to let the Android system notification triggered.

```bash
          "title": "my title",
          "alert": "my alert",
```

