# Termii Spring Boot SDK


This SDK, designed for Java applications, seamlessly incorporates Termii features without the need for manual Termii API 
calls. It is specifically tailored for Maven projects and is compatible with Spring Boot versions `3x` and Java versions `8+`.

## Installation guide
!!! Ensure you have `maven` installed on your machine.

1. Clone the repo and then navigate to the location where the `pom.xml` file located on your machine. In that directory, run the 
following command in the command line to install the SDK in the `.m2` maven repository on your localhost `./mvnw clean install`.
<br>
<br>
2. Add the Termii dependency to your Spring boot project's `pom.xml` file.
```xml
<dependency>
    <groupId>com.termii</groupId>
    <artifactId>termii-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```
3. Add your Termii API key and Email configuration Id to your properties file like so.
```yaml
termii:
  api-key: <API_KEY_HERE>
  email-configuration-id: <EMAIL_CONFIG_ID_HERE>
```

4. Enable the Termii SDK in the main spring boot class as shown below:

```java
import com.termii.spring.annotation.EnableTermii;

@EnableTermii
@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
```

If you have made it this far, congratulations, you have setup the Termii SDK in your Spring boot project. Now to use it for accessing the Termii APIs.
You can access all the functionalities in the Tokens, Insights and the Messaging sections in the official Termii documentation.

Let us take a look at all the functionalities:

#### Messaging APIs

```java
// Messaging APIs
public interface MessagingService {

    FetchSenderIdResponse fetchSenderId();

    RequestSenderIdResponse requestSenderId(RequestSenderIdRequest request);

    SendMessageResponse sendMessage(SendMessageRequest request);

    SendBulkMessageResponse sendBulkMessage(SendBulkMessageRequest request);

    SendMessageToPhoneResponse sendMessageToPhone(SendMessageToPhoneRequest request);

    DeviceTemplateResponse deviceTemplateMessage(DeviceTemplateRequest request);
}
```

#### Token APIs

```java
public interface TokenService {

    SendTokenResponse sendToken(SendTokenRequest tokenRequest);

    VoiceTokenResponse voiceToken(VoiceTokenRequest voiceTokenRequest);

    VoiceCallResponse voiceCall(VoiceCallRequest voiceCallRequest);

    EmailTokenResponse emailToken(EmailTokenRequest emailTokenRequest);

    VerifyTokenResponse verifyToken(VerifyTokenRequest verifyTokenRequest);

    InAppTokenResponse inAppToken(InAppTokenRequest inAppTokenRequest);
}
```

I also implemented the `HMAC SHA512` for verifying Termii events.

#### Insights APIs

```java
public interface InsightsService {

    boolean verifySignature(String payload, String signature);

    BalanceResponse balance();

    SearchResponse search(String phoneNumber);

    StatusResponse status(String phoneNumber, String countryCode);

    List<HistoryResponseItemDto> history();
}
```

### Sample Usage

```java
// we want to use the messaging APIs to send a text message to a phone number

import com.termii.spring.dto.request.messaging.SendMessageToPhoneRequest;
import com.termii.spring.service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;

public class SomeService {

    @Autowired
    private MessagingService messagingService;

    public void sendTextMessage() {
        SendMessageToPhoneRequest request = new SendMessageToPhoneRequest();
        request.setSms("test sms");
        request.setTo("2348102023276");
        
        messagingService.sendMessageToPhone(request);
    }
}
```

It's that simple.

#### Things to note
* You do not have to pass the API keys in the requests because the SDK does that automatically.
* Do not use any of the dto classes in the project to make the function calls, they are meant for something different.

### Bugs

If you discover any bugs, please email todiwon23@gmail.com to report them.

### License

The MIT License (MIT). Please see [License File](LICENSE.md) for more information.