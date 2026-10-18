package org.example;

public class Slon {
    public static final String HELP_COMMAND = "\\help";
    public static final String QUIT_COMMAND = "\\exit";

    public String hello() {
        return "Привет!\nЯ - продавец слона\nДля справки используй " + HELP_COMMAND
                + " или\n" + "Купи слона!" + "\n" + "Для выхода используй " + QUIT_COMMAND + "\n";
    }

    public boolean exitCommand(String input) {
        return QUIT_COMMAND.equals(input);
    }

    public String react(String input) {
        if (HELP_COMMAND.equals(input)) {
            return hello();
        }
        return "Все говорят \"" + input + "\".\n" + "А ты купи слона!" + "\n";
    }
}