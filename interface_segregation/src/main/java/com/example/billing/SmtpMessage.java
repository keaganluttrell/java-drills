package com.example.billing;

import com.example.messaging.Message;

import java.util.List;

public class SmtpMessage implements Message {
    public List<String> toAddresses;
    public String messageBody;
    public String subject;

    @Override
    public List<String> getToAddresses() {
        return toAddresses;
    }

    @Override
    public void setToAddresses(List<String> toAddresses) {
        this.toAddresses = toAddresses;
    }

    @Override
    public String getMessageBody() {
        return messageBody;
    }

    @Override
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
