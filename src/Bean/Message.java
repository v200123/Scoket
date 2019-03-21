package Bean;

import java.io.Serializable;

public class Message implements Serializable {
    private String Msg;
    private String UUID;

    public Message(String msg, String uuid) {
        Msg = msg;
        UUID = uuid;
    }
}
