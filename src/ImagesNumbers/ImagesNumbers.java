package ImagesNumbers;

import ConnectorWithUser.Connector;

public class ImagesNumbers {
    private static Connector _connector = new Connector();
    private static  GeneratorNumberImage _generator;

    public static void main(String[] args){
        _connector.SendMessage("Введите строку с цифрами: ");
        String message = _connector.GetMessage();
        int[] numbers = _connector.ConvertMessageToIntArray(message);

        _generator =  new GeneratorNumberImage(numbers);

        String[] t = _generator.GetStringImage();

        _connector.SendMessage(t);
    }
}
