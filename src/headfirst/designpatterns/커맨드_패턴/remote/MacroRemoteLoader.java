package headfirst.designpatterns.커맨드_패턴.remote;

public class MacroRemoteLoader {

    public static void main(String[] args) {


        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        TV tv = new TV("거실");
        Light light = new Light("거실");
        CeilingFan ceilingFan = new CeilingFan("거실");

        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        LightOnCommand lightOnCommand = new LightOnCommand(light);


        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        LightOffCommand lightOffCommand = new LightOffCommand(light);


        Command[] partyOn = {tvOnCommand, lightOnCommand};
        Command[] partyOff = {tvOffCommand, lightOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

    }

}
