package ru.itprogram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itprogram.view.WelcomePrint;
import ru.itprogram.view.menu.Command;
import ru.itprogram.view.menu.ServiceMenu;

import java.util.Scanner;

public class App {
    private static final String NO_COMMAND = "Такой команды нет!";
    public static final String PERSISTENCE_UNIT = "THINKER";
    public static int commandLine;

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Scanner scanner = new Scanner(System.in);
        WelcomePrint welcomePrint = (WelcomePrint) context.getBean("welcomePrint");
        ServiceMenu serviceMenu = (ServiceMenu) context.getBean("serviceMenu");

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
