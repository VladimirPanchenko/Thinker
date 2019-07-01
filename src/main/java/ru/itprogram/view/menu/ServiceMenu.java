package ru.itprogram.view.menu;

import ru.itprogram.view.menu.impl.DeleteCommand;
import ru.itprogram.view.menu.impl.PrintCommand;
import ru.itprogram.view.menu.impl.SaveCommand;

import java.util.ArrayList;
import java.util.List;

public class ServiceMenu {
    private List<Command> commandList;

    public ServiceMenu() {
        commandList = new ArrayList<>();
        commandList.add(new DeleteCommand());
        commandList.add(new PrintCommand());
        commandList.add(new SaveCommand());
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
