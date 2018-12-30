package com.company;

public enum Status {
    Register ("Paczka zarejestrowana"),
    Check ("Paczka została nadana"),
    Provide ("Paczka została dostarczona"),
    NoProvide("Paczka nie została dostarczona");

    private String words;

    Status(String status) {
        words = status;
    }

    public String getWords() {
        return words;
    }
}
