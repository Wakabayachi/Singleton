package com.kodilla.patterns.singleton;

public class Logger {

    private static Logger instance;
    private String lastLog = "";

    private Logger() {} // Prywatny konstruktor, aby uniemożliwić bezpośrednie tworzenie instancji klasy

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}