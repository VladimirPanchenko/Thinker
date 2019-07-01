package ru.itprogram.view.menu.impl;

import ru.itprogram.entity.Thinker;
import ru.itprogram.service.Service;
import ru.itprogram.service.impl.ThinkerService;
import ru.itprogram.view.menu.Command;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SaveCommand implements Command {
    private final String KEY_COMMAND = "2";
    private Service service;

    public SaveCommand() {
        service = new ThinkerService();
    }

    @Override
    public String executionTeam() {
        return KEY_COMMAND;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название мысли");
        String title = scanner.nextLine();
        System.out.println("Сформулируй свою мысль в виде текста");
        String text = scanner.nextLine();
        Thinker thinker = new Thinker(0, title, text, LocalDateTime.now());
        service.addThinker(thinker);
    }
}
