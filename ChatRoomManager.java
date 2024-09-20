public class ChatRoomManager {
    private static ChatRoomManager instance;
    private Map<String, ChatRoom> chatRooms = new HashMap<>();

    private ChatRoomManager() {
        // Private constructor to restrict instantiation
    }

    public static synchronized ChatRoomManager getInstance() {
        if (instance == null) {
            instance = new ChatRoomManager();
        }
        return instance;
    }

    public ChatRoom createOrJoinRoom(String roomId) {
        return chatRooms.computeIfAbsent(roomId, id -> new ChatRoom(id));
    }

    public void removeRoom(String roomId) {
        chatRooms.remove(roomId);
    }
}
