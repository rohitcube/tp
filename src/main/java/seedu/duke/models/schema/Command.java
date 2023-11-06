package seedu.duke.models.schema;

public class Command {
    private String commandName;
    private String description;
    public Command(String commandName, String description) {
        this.commandName = commandName;
        this.description = description;
    }

    public String getCommandName() {
        return commandName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return commandName + ": " + description;
    }
}
