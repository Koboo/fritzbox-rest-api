# fritzbox-rest-api

This is a project that aims to provide fritzbox data as rest api.

Note: The REST api of fritzbox is not documented. So this library could lack some features!

## Current features

* Get internet information
  * ipv4 (+ status)
  * ipv6 (+ status)
  * provider name
  * upstream bits (+ medium)
  * downstream bits (+ medium)
* Force reconnect (get/request new ip address)

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
    }
}
````