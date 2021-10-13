package ConnectorWithUser;

import java.util.Scanner;

public class Connector {
    public String GetMessage() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public void SendMessage(String message) {
        System.out.print(message);
    }

    public void SendMessage(int message) {
        System.out.print(message);
    }

    public void SendMessage(String[] lines) {
        for (String line:
             lines) {
            SendMessage(line + "\n");
        }
    }

    public int[] ConvertMessageToIntArray(String message) {
        int[] int_array = new int[message.length()];

        for (int i = 0; i < message.length(); i++){
            if (Character.isDigit(message.charAt(i))) {
                int_array[i] = Character.getNumericValue(message.charAt(i));
            }
        }

        return  int_array;
    }
}
