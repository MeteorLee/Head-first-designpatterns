package headfirst.designpatterns.반복자_패턴과_컴포지트_패턴;

import java.util.List;
import java.util.Objects;

public class PancakeHouseIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && Objects.nonNull(menuItems.get(position));
    }
}
