package com.example.project_initializer.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTicketRequest {
@JsonInclude(JsonInclude.Include.NON_NULL)
   
    @JsonProperty("data")
    private Data data;

    // Getter and Setter
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {

        @JsonProperty("attributes")
        private Attributes attributes;

        // Getter and Setter
        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    public static class Attributes {

        @JsonProperty("subject")
        private String subject;

        @JsonProperty("ticket-type-id")
        private String ticketTypeId;

        @JsonProperty("parent-id")
        private String parentId;

        @JsonProperty("status-id")
        private int statusId;

        @JsonProperty("component-id")
        private String componentId;

        @JsonProperty("priority-id")
        private int priorityId;

        @JsonProperty("due-date")
        private String dueDate;  // Adjust the type if a specific date format is used

        @JsonProperty("extension-date")
        private String extensionDate;


        // Getters and Setters
        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getTicketTypeId() {
            return ticketTypeId;
        }

        public void setTicketTypeId(String ticketTypeId) {
            this.ticketTypeId = ticketTypeId;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public int getStatusId() {
            return statusId;
        }

        public void setStatusId(int statusId) {
            this.statusId = statusId;
        }

        public String getComponentId() {
            return componentId;
        }

        public void setComponentId(String componentId) {
            this.componentId = componentId;
        }

        public int getPriorityId() {
            return priorityId;
        }

        public void setPriorityId(int priorityId) {
            this.priorityId = priorityId;
        }

        public String getDueDate() {
            return dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }

        public String getExtensionDate() {
            return extensionDate;
        }

        public void setExtensionDate(String extensionDate) {
            this.extensionDate = extensionDate;
        }
        }

       
    }

