package ru.mail.polis.homework.analyzer;

public enum FilterType {
    GOOD(0),
    SPAM(1),
    TOO_LONG(2),
    NEGATIVE_TEXT(3),
    LONG_SPACE(4);

    private final int priority;

    FilterType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
