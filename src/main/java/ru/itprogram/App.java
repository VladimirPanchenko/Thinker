package ru.itprogram;

import ru.itprogram.view.WelcomePrint;
import ru.itprogram.view.menu.Command;
import ru.itprogram.view.menu.ServiceMenu;

import java.util.Scanner;

public class App {
    private static final String NO_COMMAND = "Такой команды нет!";
    public static final String PERSISTENCE_UNIT = "THINKER";
    public static int commandLine;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        WelcomePrint welcomePrint = new WelcomePrint();
        ServiceMenu serviceMenu = new ServiceMenu();

        welcomePrint.welcomeFirst();
        while (true) {
            welcomePrint.welcome();
            commandLine = scanner.nextInt();
            for (Command command : serviceMenu.getCommandList()) {
                if (commandLine == Integer.valueOf(command.executionTeam())) {
                    command.run();
                }
            }
        }
    }
}
