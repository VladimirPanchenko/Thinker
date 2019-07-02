package ru.itprogram.view.menu.impl;

import ru.itprogram.entity.Thinker;
import ru.itprogram.service.Service;
import ru.itprogram.service.impl.ThinkerService;
import ru.itprogram.view.menu.Command;

import java.util.List;
import java.util.Scanner;

public class DeleteCommand implements Command {
    private final String KEY_COMMAND = "3";
    private Service service;

    public DeleteCommand(ThinkerService thinkerService) {
        this.service = thinkerService;
    }

    @Override
    public String executionTeam() {
        return KEY_COMMAND;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи ID мысли которую следует удалить.");
        int id = scanner.nextInt();
        List<Thinker> thinkerList = service.getThinkers();
        for (Thinker thinker : thinkerList) {
            if (thinker.getId() == id) {
                service.deleteThinker(thinker);
            }
        }
    }
}
