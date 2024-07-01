package eu.koboo.fritzbox.model;

public record LogEntry(
        String helpLink,
        String time,
        String group,
        int id,
        String message,
        String date,
        int noHelp
) {
}
