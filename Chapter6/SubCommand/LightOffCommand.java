package Chapter6.SubCommand;

import Chapter6.Command;
import Chapter6.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.off();
    }

}
