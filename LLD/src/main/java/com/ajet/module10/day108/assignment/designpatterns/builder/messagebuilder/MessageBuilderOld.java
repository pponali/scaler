package com.ajet.module10.day108.assignment.designpatterns.builder.messagebuilder;

@WithBuilder
public class MessageBuilderOld {

    public MessageBuilderOld setMessageType(MessageType messageType) {
        this.messageType = messageType;
        return this;
    }

    public MessageBuilderOld setContent(String content) {
        this.content = content;
        return this;
    }

    public MessageBuilderOld setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public MessageBuilderOld setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public MessageBuilderOld setDelivered(boolean delivered) {
        isDelivered = delivered;
        return this;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public MessageBuilderOld setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;





}
