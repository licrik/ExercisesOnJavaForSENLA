package SafeForThings;

public class Item implements Comparable<Item>{
    public int price;
    public int space;
    public double value;

    public Item(int cost, int size){
        price = cost;
        space = size;
        value = (double) price / (double) space;
    }

    @Override
    public int compareTo(Item o) {
        return (int)(o.value - value);
    }
}
