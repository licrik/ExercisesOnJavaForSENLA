package SafeForThings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class ItemsGenerator {
    private Item[] _items = new Item[] {
            new Item(10, 7),
            new Item(6, 5),
            new Item(3, 3),
            new Item(3, 1)
    };

    public Item[] GetItems(){
        Arrays.sort(_items);

        return _items;
    }
}
