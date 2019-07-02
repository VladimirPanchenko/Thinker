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
    private Thinker thinker;

    public SaveCommand(ThinkerService thinkerService, Thinker thinker) {
        this.service = thinkerService;
        this.thinker = thinker;
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
        thinker.setId(0);
        thinker.setTitle(title);
        thinker.setText(text);
        thinker.setTimeOfCreation(LocalDateTime.now());
        service.addThinker(thinker);
    }
}
