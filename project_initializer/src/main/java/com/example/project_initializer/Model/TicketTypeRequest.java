package com.example.project_initializer.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TicketTypeRequest {

    private Data data;

    // Getters and Setters
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        private Attributes attributes;

        // Getters and Setters
        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    public static class Attributes {
        @JsonProperty("ticket-type-id")
        private String ticketTypeId;

        @JsonProperty("required-fields")
        private List<String> requiredFields;

        // Getters and Setters
        public String getTicketTypeId() {
            return ticketTypeId;
        }

        public void setTicketTypeId(String ticketTypeId) {
            this.ticketTypeId = ticketTypeId;
        }

        public List<String> getRequiredFields() {
            return requiredFields;
        }

        public void setRequiredFields(List<String> requiredFields) {
            this.requiredFields = requiredFields;
        }
    }
}
