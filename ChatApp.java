import java.util.Scanner;

public class ChatApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatRoomManager chatRoomManager = ChatRoomManager.getInstance();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        User user = new RegularUser(name);

        System.out.println("Enter room ID to join or create: ");
        String roomId = scanner.nextLine();
        ChatRoom chatRoom = chatRoomManager.createOrJoinRoom(roomId);
        user.joinRoom(chatRoom);

        System.out.println("Welcome to room: " + roomId);
        while (true) {
            System.out.println("Enter message (or type 'exit' to leave): ");
            String message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) {
                user.leaveRoom();
                break;
            }
            user.sendMessage(message);
        }

        scanner.close();
    }
}
