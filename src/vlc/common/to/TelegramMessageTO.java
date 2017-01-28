package vlc.common.to;

public class TelegramMessageTO {

    private String chat_id;
    private String message;

    public TelegramMessageTO() {
    }

    public TelegramMessageTO(String chat_id, String message) {
        this.chat_id = chat_id;
        this.message = message;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "TelegramMessageTO{" +
                "chat_id='" + chat_id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
