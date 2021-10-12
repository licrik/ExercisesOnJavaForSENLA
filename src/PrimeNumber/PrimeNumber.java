package PrimeNumber;

import ConnectorWithUser.Connector;

public class PrimeNumber {
    private static Connector _connector;

    public static void main(String[] args){
        _connector = new Connector();

        _connector.SendMessage("Введите целое число: ");
        String message = _connector.GetMessage();

        int number = ConvertToInteger(message);
        FindPrimeNumbers(number);
    }

    private static int ConvertToInteger(String number){
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException exception) {
            _connector.SendMessage("Данные введены неверно ");
        }
        return 0;
    }

    private static void FindPrimeNumbers(int number){
        int a = 2;
        while (a <= number) {
            if ((number % a) == 0) {
                if (a != number) {
                    _connector.SendMessage(a + " ");
                    FindPrimeNumbers(number / a);
                } else {
                    _connector.SendMessage(a);

                }
                return;
            }
            a++;
        }
    }
}
