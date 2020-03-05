package io.mirko.repository;

public enum CommandType {
    TURN_ON("turnOn"),
    TURN_OFF("turnOff"),
    POWER_STATUS("powerStatus");

    private final String value;
    private CommandType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public boolean hasResponse() {
        return this == POWER_STATUS;
    }
}
