import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private static Socket socket;
    private static PrintWriter out;
    private static BufferedReader in;
    private static BufferedReader userInput;

    public static void main(String[] args) {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            userInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Connected to the server!");

            // Receive messages from other clients
            Thread receiveThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String message;
                        while ((message = in.readLine()) != null) {
                            System.out.println(message);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receiveThread.start();

            // Send messages to server
            System.out.println("Enter your name:");
            String name = userInput.readLine();
            out.println(name);  // Send name to server

            String message;
            while (true) {
                message = userInput.readLine();
                out.println(message);  // Send message to server
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
