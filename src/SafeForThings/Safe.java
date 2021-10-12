package SafeForThings;

import java.util.Arrays;

public class Safe {
    private int _space;
    private int _cost = 0;
    private Item[] _items;

    public Safe(int space){
        _space = space;
    }

    public int GetCost() { return _cost; }

    public void SetItem(Item[] items){
        int rest_space = _space;

        for (Item item:
             items) {
            rest_space = CalculateItem(item, rest_space);
        }
    }

    private int CalculateItem(Item item, int space) {
        int count = space / item.space;
        _cost += item.price * count;

        return  space - item.space * count;
    }
}
