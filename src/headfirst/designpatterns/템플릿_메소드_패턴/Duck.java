package headfirst.designpatterns.템플릿_메소드_패턴;

public class Duck implements Comparable<Duck>{

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight > otherDuck.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
