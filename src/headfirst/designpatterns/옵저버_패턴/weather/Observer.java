package headfirst.designpatterns.옵저버_패턴.weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
