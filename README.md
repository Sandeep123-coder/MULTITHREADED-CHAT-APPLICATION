# MULTITHREADED-CHAT-APPLICATION

COMPANY: CODTECH IT SOLUTIONS

NAME: GANARAJU SANDEEP VARMA

INTERN ID: CT04WT31

DOMAIN : JAVA PROGRAMMING

DURATION : 4 WEEKS

MENTOR: NEELA SANTHOSH KUMAR

DESCRIPTION :

This project titled "Multithreaded Client-Server Chat Application Using Java Sockets" is a Java-based software application designed to facilitate real-time communication between multiple users through the implementation of socket programming and multithreading. The core purpose of the application is to enable multiple clients to connect to a central server and exchange messages efficiently in a text-based chatroom-like environment. The server acts as a communication hub, receiving messages from each client and broadcasting them to all other connected clients in real time.

The chat application uses Java sockets for networking and Java multithreading to handle multiple client connections simultaneously. The server listens on a specific port for incoming client connections. When a new client connects, the server spawns a new thread (using a class called ClientHandler) dedicated to that specific client. This approach ensures that all clients are served concurrently, avoiding any blocking or delays that would result from a single-threaded implementation. The use of multithreading allows the server to be scalable and efficient even when many clients are connected at once.

Each client runs an instance of a Java program that establishes a socket connection to the server. The client interface is command-line based, allowing the user to type and send messages. At the same time, a separate thread within the client continuously listens for incoming messages from the server. This design ensures that sending and receiving messages happen independently and concurrently, providing a seamless chat experience for the user.

The server maintains a list of connected clients using a thread-safe data structure such as Vector. When a client sends a message, the server receives it and loops through all connected clients (except the sender) to forward the message. This behavior effectively simulates a group chat environment. If a client disconnects or encounters an error, the server safely closes the connection and removes that client from the active clients list.

The communication between the server and the client is handled using BufferedReader and PrintWriter for efficient input and output stream management. The server’s console displays the status of client connections and disconnections, helping the administrator keep track of activity. On the client side, all messages sent by others are prefixed to indicate that they came from the server, although usernames and timestamps can be added in future enhancements.

This project is an excellent example of how networking and concurrency concepts in Java can be applied to develop practical, real-time applications. It also provides foundational knowledge for more advanced systems such as peer-to-peer networks, group messaging apps, and multiplayer game communication engines. Furthermore, the modular structure of the project — with separate classes for the server, client, and client handler — follows best practices for maintainability and code organization.

In addition to demonstrating socket communication, this project also lays the groundwork for implementing future features such as graphical user interfaces (using Swing or JavaFX), message encryption, user authentication, message history, and private messaging functionalities. It can also be adapted into more sophisticated systems like chatbots or integrated into web applications via WebSocket bridges.

Overall, the Multithreaded Client-Server Chat Application offers a robust, efficient, and extensible solution for real-time communication using core Java technologies. It not only showcases fundamental concepts such as sockets and threads but also emphasizes the importance of concurrent programming in developing scalable and responsive applications. The simplicity of the code makes it highly accessible for beginners while still being powerful enough to serve as a base for more advanced networking projects.

OUTPUT:

![Image](https://github.com/user-attachments/assets/dcf73a74-649a-4079-b50c-4f9187bda0a9)
![Image](https://github.com/user-attachments/assets/c510990b-ae90-4374-a731-8ce3bf69d3cb)
![Image](https://github.com/user-attachments/assets/0e4b3db0-53f2-4ab7-bf50-d24efa28a4ee)
![Image](https://github.com/user-attachments/assets/0e469a5e-dab3-4b2e-aae0-367f515e3e9d)
![Image](https://github.com/user-attachments/assets/04059b1a-a9bc-4abf-80a8-304553de6a87)


