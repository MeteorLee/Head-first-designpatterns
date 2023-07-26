package headfirst.designpatterns.커맨드_패턴.remote;

public class TV {
    String location = "";

    public TV(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    
    public void on() {
        System.out.println(location + " tv가 켜집니다.");
    }
    public void off() {
        System.out.println(location + " tv가 꺼집니다.");
    }
}
