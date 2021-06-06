package com.bridgelabz;

public enum UserFieldPattern {
    NAME_PATTERN("^[A-Z][a-z]{2,}"),
    EMAIL_PATTERN("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$"),
    MOBILE_PATTERN("^[0-9]{0,2}[ ][0-9]{10}"),
    PASSWORD_PATTERN("(?=.*[A-Z]+)(?=.*[0-9]+).{8,}");

    public final String patterns;

    UserFieldPattern(String patterns) {
        this.patterns = patterns;
    }
}
