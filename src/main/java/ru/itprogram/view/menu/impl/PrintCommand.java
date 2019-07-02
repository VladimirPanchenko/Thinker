package ru.itprogram.view.menu.impl;

import ru.itprogram.service.Service;
import ru.itprogram.service.impl.ThinkerService;
import ru.itprogram.view.ThinkerPrint;
import ru.itprogram.view.menu.Command;

public class PrintCommand implements Command {
    private final String KEY_COMMAND = "1";
    private Service service;
    private ThinkerPrint thinkerPrint;

    public PrintCommand(ThinkerService thinkerService, ThinkerPrint thinkerPrint) {
        this.service = thinkerService;
        this.thinkerPrint = thinkerPrint;
    }

    @Override
    public String executionTeam() {
        return KEY_COMMAND;
    }

    @Override
    public void run() {
        thinkerPrint.print(service.getThinkers());
    }
}
