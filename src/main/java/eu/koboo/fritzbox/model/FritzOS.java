package eu.koboo.fritzbox.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Getter
public class FritzOS {
    String version;
    LocalDateTime dateOfLastUpdate;
    LocalDateTime dateOfLastAutomaticCheck;
}
