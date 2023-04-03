package headfirst.designpatterns.command.remote;

public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("불을 킵니다.");
    }

    public void off(){
        System.out.println("불을 끕니다.");
    }
}
