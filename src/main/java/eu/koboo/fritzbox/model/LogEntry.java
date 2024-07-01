package eu.koboo.fritzbox.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Getter
public class LogEntry {
    String helpLink;
    String time;
    String group;
    int id;
    String message;
    String date;
    int noHelp;
}
