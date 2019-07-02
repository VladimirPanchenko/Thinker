package ru.itprogram.view.menu;

import ru.itprogram.view.menu.impl.DeleteCommand;
import ru.itprogram.view.menu.impl.PrintCommand;
import ru.itprogram.view.menu.impl.SaveCommand;

import java.util.ArrayList;
import java.util.List;

public class ServiceMenu {
    private List<Command> commandList;

    public ServiceMenu(DeleteCommand deleteCommand, PrintCommand printCommand, SaveCommand saveCommand, ArrayList commandList) {
        this.commandList = commandList;
        commandList.add(deleteCommand);
        commandList.add(printCommand);
        commandList.add(saveCommand);
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
