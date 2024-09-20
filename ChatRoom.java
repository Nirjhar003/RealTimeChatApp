import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<User> users = new ArrayList<>();

    public ChatRoom(String roomId) {
        this.roomId = roomId;
    }

    public void addUser(User user) {
        users.add(user);
        broadcastMessage(null, user.name + " has joined the room.");
    }

    public void removeUser(User user) {
        users.remove(user);
        broadcastMessage(null, user.name + " has left the room.");
    }

    public void broadcastMessage(User sender, String message) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage((sender != null ? sender.name : "System") + ": " + message);
            }
        }
    }

    public List<String> getActiveUsers() {
        List<String> activeUsers = new ArrayList<>();
        for (User user : users) {
            activeUsers.add(user.name);
        }
        return activeUsers;
    }
}
