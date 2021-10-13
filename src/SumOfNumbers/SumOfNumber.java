package SumOfNumbers;

import ConnectorWithUser.Connector;

public class SumOfNumber {
    public static void main(String[] args){
        Connector connector = new Connector();

        connector.SendMessage("Введите числовую строку: ");
        String message = connector.GetMessage();

        int[] number_array = connector.ConvertMessageToIntArray(message);
        int sum = SumNumberOnArray(number_array);

        connector.SendMessage(sum);
    }

    private static int SumNumberOnArray(int[] number_array) {
        int sum = 0;

        for (int number:
                number_array) {
            sum += number;
        }

        return sum;
    }
}
