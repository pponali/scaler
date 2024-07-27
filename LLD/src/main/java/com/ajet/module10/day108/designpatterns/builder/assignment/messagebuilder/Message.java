package com.ajet.module10.day108.designpatterns.builder.assignment.messagebuilder;

public class Message {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private Message(MessageType messageType, String content, String sender, String recipient, boolean isDelivered, long timestamp) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
        this.isDelivered = isDelivered;
        this.timestamp = timestamp;
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

    public MessageBuilder builder(){
        return new MessageBuilder();
    }

    @WithBuilder
    public static class MessageBuilder {

        public MessageBuilder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public MessageBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public MessageBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public MessageBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public MessageBuilder setDelivered(boolean delivered) {
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

        public MessageBuilder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Message build(){
            return new Message(this.messageType, this.content, this.sender, this.recipient, this.isDelivered, this.timestamp);
        }

        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

    }


}
