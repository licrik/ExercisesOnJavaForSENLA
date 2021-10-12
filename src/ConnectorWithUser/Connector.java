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
}
