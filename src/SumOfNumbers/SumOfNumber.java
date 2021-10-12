package SumOfNumbers;

import ConnectorWithUser.Connector;

public class SumOfNumber {
    public static void main(String[] args){
        Connector connector = new Connector();

        connector.SendMessage("Введите числовую строку: ");
        String message = connector.GetMessage();

        int[] number_array = ConvertStringToIntArray(message);
        int sum = SumNumberOnArray(number_array);

        connector.SendMessage(sum);
    }

    private static int[] ConvertStringToIntArray(String message) {
        int[] int_array = new int[message.length()];

        for (int i = 0; i < message.length(); i++){
            if (Character.isDigit(message.charAt(i))) {
                int_array[i] = Character.getNumericValue(message.charAt(i));
            }
        }

        return  int_array;
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
