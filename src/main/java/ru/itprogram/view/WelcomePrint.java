package ru.itprogram.view;

public class WelcomePrint {
    private static final String WELCOME = "Добро пожаловать в мыслевик!";
    private static final String ONE = "Нажми 1 для вывода всех мыслей";
    private static final String TWO = "Нажми 2 для создания новой мысли";
    private static final String TREE = "Нажми 3 для удаления мысли";

    public void welcomeFirst() {
        System.out.println(WELCOME);
    }

    public void welcome() {
        commandPrint();
    }

    private void commandPrint() {
        System.out.println(ONE);
        System.out.println(TWO);
        System.out.println(TREE);
    }
}
