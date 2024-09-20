public abstract class User {
    protected String name;
    protected ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public abstract void receiveMessage(String message);

    public void joinRoom(ChatRoom room) {
        this.chatRoom = room;
        room.addUser(this);
    }

    public void sendMessage(String message) {
        if (chatRoom != null) {
            chatRoom.broadcastMessage(this, message);
        } else {
            System.out.println("You are not in any chat room.");
        }
    }

    public void leaveRoom() {
        if (chatRoom != null) {
            chatRoom.removeUser(this);
            chatRoom = null;
        }
    }
}
