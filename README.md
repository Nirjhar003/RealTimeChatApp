# RealTimeChatApp
This is a simple console-based real-time chat application written in Java. The application allows users to join or create chat rooms, send and receive messages in real-time, and see the list of active users in a room. 
This project implements several key design patterns such as Observer, Singleton, and Adapter, adhering to SOLID principles, and best practices in OOP.

Design Patterns Used
Observer Pattern: Used to notify users (observers) when new messages or events (subject updates) occur in the chat room.
Singleton Pattern: Ensures that only one instance of ChatRoomManager is active across the application to manage all chat rooms.
Adapter Pattern: Allows flexibility to adapt different messaging protocols (e.g., Console-based, WebSocket, HTTP).
