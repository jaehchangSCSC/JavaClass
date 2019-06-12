package chat;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatClientApp {
    private static final String SERVER_IP = "192.168.137.1";
    private static final int SERVER_PORT = 5050;

    public static void main(String[] args) {
        String name = null;
        Scanner scanner = new Scanner(System.in);

        while( true ) {

            System.out.println("Please Input NickName.");
            System.out.print(">>> ");
            name = scanner.nextLine();

            if (name.isEmpty() == false ) {
                break;
            }

            System.out.println("At least one character is required for nickname.\n");
        }

        scanner.close();

        Socket socket = new Socket();
        try {
            socket.connect( new InetSocketAddress(SERVER_IP, SERVER_PORT) );
            consoleLog("You have entered Chatting Room.");
            new ChatWindow(name, socket).show();

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
            String request = "join:" + name + "\r\n";
            pw.println(request);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void consoleLog(String log) {
        System.out.println(log);
    }
}