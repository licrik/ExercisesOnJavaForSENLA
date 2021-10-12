package SafeForThings;

import ConnectorWithUser.Connector;

public class SaveForThings {
    public static void  main(String[] args){
        ItemsGenerator item_generator = new ItemsGenerator();
        Connector connector = new Connector();

        Item[] items = item_generator.GetItems();
        Safe safe = new Safe(12);

        safe.SetItem(items);

        connector.SendMessage(safe.GetCost());
    }
}
