package Command;

public class SmartHomeRemote {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public SmartHomeRemote() {
        onCommands = new Command[6];
        offCommands = new Command[6];
        Command noCommand = new NoCommand();

        for (int i = 0; i < 6; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Smart Home Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " +
                    onCommands[i].getClass().getSimpleName() + " / " +
                    offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}
