package Chapter6;

import Chapter6.SubCommand.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lighton = new LightOnCommand(light);

        remote.setCommand(lighton);
        remote.buttonWasPressed();
    }
}
