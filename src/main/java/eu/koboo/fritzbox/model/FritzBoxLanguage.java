package eu.koboo.fritzbox.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Getter
@RequiredArgsConstructor
public enum FritzBoxLanguage {

    GERMAN("de"),
    ;

    String value;
}
