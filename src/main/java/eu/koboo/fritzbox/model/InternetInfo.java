package eu.koboo.fritzbox.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Getter
public class InternetInfo {
    boolean connected;
    String ipv4;
    boolean ipv4Connected;
    String ipv6;
    boolean ipv6Connected;
    String providerName;
    int upstreamBits;
    int mediumUpstreamBits;
    int downstreamBits;
    int mediumDownstreamBits;
}
