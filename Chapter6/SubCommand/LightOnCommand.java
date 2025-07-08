package Chapter6.SubCommand;

import Chapter6.Command;
import Chapter6.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}
