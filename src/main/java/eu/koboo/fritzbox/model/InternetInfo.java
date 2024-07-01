package eu.koboo.fritzbox.model;

public record InternetInfo(
        boolean connected,
        String ipv4,
        boolean ipv4Connected,
        String ipv6,
        boolean ipv6Connected,
        String providerName,
        int upstreamBits,
        int mediumUpstreamBits,
        int downstreamBits,
        int mediumDownstreamBits
) {
}
