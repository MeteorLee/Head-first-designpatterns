package headfirst.designpatterns.커맨드_패턴.remote;


public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();


        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("부엌");


        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

//        remoteControl.setCommand(0, ()-> livingRoomLight.on(), () -> livingRoomLight.off());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

    }
}
