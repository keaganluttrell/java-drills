package com.example.messaging;

import java.util.List;

public interface Message {

    public List<String> getToAddresses();

    public void setToAddresses(List<String> toAddresses);

    public String getMessageBody();

    public void setMessageBody(String messageBody);

    public String getSubject();

    public void setSubject(String subject);
}
