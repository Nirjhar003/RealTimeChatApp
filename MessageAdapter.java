public interface MessageProtocol {
    void sendMessage(String message);
}

public class ConsoleMessageProtocol implements MessageProtocol {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending via Console: " + message);
    }
}

public class MessageAdapter {
    private MessageProtocol protocol;

    public MessageAdapter(MessageProtocol protocol) {
        this.protocol = protocol;
    }

    public void send(String message) {
        protocol.sendMessage(message);
    }
}
