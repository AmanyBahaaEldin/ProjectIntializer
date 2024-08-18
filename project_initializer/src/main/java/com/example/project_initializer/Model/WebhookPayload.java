package com.example.project_initializer.Model;
import java.util.List;
import java.util.Map;

public class WebhookPayload {


    private ProjectData data;  // Renamed from Data to ProjectData
    private String eventName;

    // Getters and Setters
    public ProjectData getData() {
        return data;
    }

    public void setData(ProjectData data) {
        this.data = data;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public static class ProjectData {  // Renamed from Data to ProjectData
        private String id;
        private String type;
        private Attributes attributes;
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

        public static class Attributes {
            private String id;
            private String city;
            private String name;
            private Integer status;
            private String street;
            private String country;
            private String zipcode;
            private String homepage;
            private String authorId;
            private String createdOn;
            private String drendDate;
            private String updatedOn;
            private String description;
            private String accessToken;
            private String drstartDate;
            private List<Object> typedFields;
            private Map<String, Object> typedValues;
            private String projectnumber;
            private Integer runningNumber;
            private String parentIdHashed;
            private String scheduleStartDate;

            // Getters and Setters for all fields
            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getStatus() {
                return status;
            }

            public void setStatus(Integer status) {
                this.status = status;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getZipcode() {
                return zipcode;
            }

            public void setZipcode(String zipcode) {
                this.zipcode = zipcode;
            }

            public String getHomepage() {
                return homepage;
            }

            public void setHomepage(String homepage) {
                this.homepage = homepage;
            }

            public String getAuthorId() {
                return authorId;
            }

            public void setAuthorId(String authorId) {
                this.authorId = authorId;
            }

            public String getCreatedOn() {
                return createdOn;
            }

            public void setCreatedOn(String createdOn) {
                this.createdOn = createdOn;
            }

            public String getDrendDate() {
                return drendDate;
            }

            public void setDrendDate(String drendDate) {
                this.drendDate = drendDate;
            }

            public String getUpdatedOn() {
                return updatedOn;
            }

            public void setUpdatedOn(String updatedOn) {
                this.updatedOn = updatedOn;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getAccessToken() {
                return accessToken;
            }

            public void setAccessToken(String accessToken) {
                this.accessToken = accessToken;
            }

            public String getDrstartDate() {
                return drstartDate;
            }

            public void setDrstartDate(String drstartDate) {
                this.drstartDate = drstartDate;
            }

            public List<Object> getTypedFields() {
                return typedFields;
            }

            public void setTypedFields(List<Object> typedFields) {
                this.typedFields = typedFields;
            }

            public Map<String, Object> getTypedValues() {
                return typedValues;
            }

            public void setTypedValues(Map<String, Object> typedValues) {
                this.typedValues = typedValues;
            }

            public String getProjectnumber() {
                return projectnumber;
            }

            public void setProjectnumber(String projectnumber) {
                this.projectnumber = projectnumber;
            }

            public Integer getRunningNumber() {
                return runningNumber;
            }

            public void setRunningNumber(Integer runningNumber) {
                this.runningNumber = runningNumber;
            }

            public String getParentIdHashed() {
                return parentIdHashed;
            }

            public void setParentIdHashed(String parentIdHashed) {
                this.parentIdHashed = parentIdHashed;
            }

            public String getScheduleStartDate() {
                return scheduleStartDate;
            }

            public void setScheduleStartDate(String scheduleStartDate) {
                this.scheduleStartDate = scheduleStartDate;
            }
        }

        public static class Relationships {
            private AuthorRelationship author;
            private GroupsRelationship groups;
            private ProjectMembershipsRelationship projectMemberships;
            private ProjectWorkingDaysRelationship projectWorkingDays;

            // Getters and Setters
            public AuthorRelationship getAuthor() {
                return author;
            }

            public void setAuthor(AuthorRelationship author) {
                this.author = author;
            }

            public GroupsRelationship getGroups() {
                return groups;
            }

            public void setGroups(GroupsRelationship groups) {
                this.groups = groups;
            }

            public ProjectMembershipsRelationship getProjectMemberships() {
                return projectMemberships;
            }

            public void setProjectMemberships(ProjectMembershipsRelationship projectMemberships) {
                this.projectMemberships = projectMemberships;
            }

            public ProjectWorkingDaysRelationship getProjectWorkingDays() {
                return projectWorkingDays;
            }

            public void setProjectWorkingDays(ProjectWorkingDaysRelationship projectWorkingDays) {
                this.projectWorkingDays = projectWorkingDays;
            }

            public static class AuthorRelationship {
                private AuthorData data;

                // Getters and Setters
                public AuthorData getData() {
                    return data;
                }

                public void setData(AuthorData data) {
                    this.data = data;
                }

                public static class AuthorData {
                    private String id;
                    private String type;

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
                }
            }

            public static class GroupsRelationship {
                private List<Object> data;

                // Getters and Setters
                public List<Object> getData() {
                    return data;
                }

                public void setData(List<Object> data) {
                    this.data = data;
                }
            }

            public static class ProjectMembershipsRelationship {
                private List<ProjectMembershipData> data;

                // Getters and Setters
                public List<ProjectMembershipData> getData() {
                    return data;
                }

                public void setData(List<ProjectMembershipData> data) {
                    this.data = data;
                }

                public static class ProjectMembershipData {
                    private String id;
                    private String type;

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
                }
            }

            public static class ProjectWorkingDaysRelationship {
                private ProjectWorkingDaysData data;

                // Getters and Setters
                public ProjectWorkingDaysData getData() {
                    return data;
                }

                public void setData(ProjectWorkingDaysData data) {
                    this.data = data;
                }

                public static class ProjectWorkingDaysData {
                    private String id;
                    private String type;

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
                }
            }
        }
    }


}
