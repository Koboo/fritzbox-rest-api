# fritzbox-rest-api

This is a project that aims to provide fritzbox data as rest api.

Note: The REST api of fritzbox is not documented. So this library could lack some features!

## Requirements

* > JDK 11 or above
* > Fritz!OS 7.20 or above

## Current features

* get internet information
  * ipv4 (+ status)
  * ipv6 (+ status)
  * provider name
  * upstream bits (+ medium)
  * downstream bits (+ medium)
* force reconnect (get/request new ip address)
* get information about fritz os
  * current version
  * date of last update
  * date of last automatic availability check
* get log events

[Please submit requested features as new issue!](https://github.com/Koboo/fritzbox-rest-api/issues)

## Usage

````java
public class TestLaunch {

    public static void main(String[] args) {
        FritzBox fritzBox = new FritzBox(
                "fritz.box",
                "your_username",
                "your_password"
        );

        // Log into your fritzbox
        fritzBox.login();

        // Get the current information about the internet connections.
        InternetInfo internetInfo = fritzBox.getInternetInfo().get(0);
        System.out.println(internetInfo.connected());
        System.out.println(internetInfo.ipv4());
        System.out.println(internetInfo.ipv4Connected());
        System.out.println(internetInfo.ipv6());
        System.out.println(internetInfo.ipv6Connected());
        System.out.println(internetInfo.providerName());
        System.out.println(internetInfo.upstreamBits());
        System.out.println(internetInfo.mediumUpstreamBits());
        System.out.println(internetInfo.downstreamBits());
        System.out.println(internetInfo.mediumDownstreamBits());

        // Force a reconnect to get/request a new ip address
        fritzBox.reconnect();

        // Request the information of the current fritz os
        FritzOS fritzOS = fritzBox.getFritzOS();

        // Request the log event entries
        List<LogEntry> logEntryList = fritzbox.getLogEvents();
    }
}
````

## Maven / Gradle

fritzbox-rest-api is deployed at the maven central repository.

````xml
<dependency>
    <groupId>eu.koboo</groupId>
    <artifactId>fritzbox-rest-api</artifactId>
    <version>1.0.1</version>
</dependency>
````

````groovy
implementation 'eu.koboo:fritzbox-rest-api:1.0.1'
````