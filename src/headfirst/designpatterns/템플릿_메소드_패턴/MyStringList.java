package headfirst.designpatterns.템플릿_메소드_패턴;

import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList<String> {

    private String[] myList;

    public MyStringList(String[] myList) {
        this.myList = myList;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "RedHead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList duckList = new MyStringList(ducks);
        List duckSubList = duckList.subList(2, 3);
    }
}
