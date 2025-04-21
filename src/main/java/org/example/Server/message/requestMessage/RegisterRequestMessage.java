package org.example.Server.message.requestMessage;

import lombok.Data;

@Data
public class RegisterRequestMessage extends LoginAndRegisterRequestMessage {
    Integer userId;
    String password;
    @Override
    public int getMessageType() {
        return RegisterRequestEvent;
    }
}
