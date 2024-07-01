package eu.koboo.fritzbox.model;

import java.time.LocalDateTime;

public record FritzOS(
        String version,
        LocalDateTime dateOfLastUpdate,
        LocalDateTime dateOfLastAutomaticCheck
) {
}
