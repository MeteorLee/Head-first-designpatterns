package headfirst.designpatterns.반복자_패턴과_컴포지트_패턴;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
