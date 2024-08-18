package com.example.project_initializer.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketTypeResponse {
     @JsonProperty("data")
    private Data data;

    @JsonProperty("included")
    private Object[] included;

    // Getters and Setters
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Object[] getIncluded() {
        return included;
    }

    public void setIncluded(Object[] included) {
        this.included = included;
    }

    public static class Data {

        @JsonProperty("id")
        private String id;

        @JsonProperty("type")
        private String type;

        @JsonProperty("attributes")
        private Attributes attributes;

        @JsonProperty("relationships")
        private Relationships relationships;

        // Getters and Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }

        public Relationships getRelationships() {
            return relationships;
        }

        public void setRelationships(Relationships relationships) {
            this.relationships = relationships;
        }
    }

    public static class Attributes {

        @JsonProperty("id")
        private String id;

        @JsonProperty("ticket-type-id")
        private String ticketTypeId;

        @JsonProperty("project-id")
        private String projectId;

        @JsonProperty("updated-at")
        private String updatedAt;

        @JsonProperty("created-at")
        private String createdAt;

        @JsonProperty("required-fields")
        private Object requiredFields;

        @JsonProperty("can-change")
        private boolean canChange;

        // Getters and Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTicketTypeId() {
            return ticketTypeId;
        }

        public void setTicketTypeId(String ticketTypeId) {
            this.ticketTypeId = ticketTypeId;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public Object getRequiredFields() {
            return requiredFields;
        }

        public void setRequiredFields(Object requiredFields) {
            this.requiredFields = requiredFields;
        }

        public boolean isCanChange() {
            return canChange;
        }

        public void setCanChange(boolean canChange) {
            this.canChange = canChange;
        }
    }

    public static class Relationships {

        @JsonProperty("lists-ticket-type")
        private ListsTicketType listsTicketType;

        // Getters and Setters
        public ListsTicketType getListsTicketType() {
            return listsTicketType;
        }

        public void setListsTicketType(ListsTicketType listsTicketType) {
            this.listsTicketType = listsTicketType;
        }
    }

    public static class ListsTicketType {

        @JsonProperty("data")
        private Object[] data;

        // Getters and Setters
        public Object[] getData() {
            return data;
        }

        public void setData(Object[] data) {
            this.data = data;
        }
    }
}
