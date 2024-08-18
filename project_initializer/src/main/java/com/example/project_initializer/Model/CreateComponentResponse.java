package com.example.project_initializer.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CreateComponentResponse {

    @JsonProperty("data")
    private List<DataItem> data;

    @JsonProperty("included")
    private List<IncludedItem> included;

    @JsonProperty("meta")
    private Meta meta;

    // Getters and Setters
    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public List<IncludedItem> getIncluded() {
        return included;
    }

    public void setIncluded(List<IncludedItem> included) {
        this.included = included;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public static class DataItem {

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

        @JsonProperty("project-id")
        private String projectId;

        @JsonProperty("user-id")
        private String userId;

        @JsonProperty("created-on")
        private String createdOn;

        @JsonProperty("name")
        private String name;

        @JsonProperty("description")
        private String description;

        @JsonProperty("updated-on")
        private String updatedOn;

        @JsonProperty("parent-id")
        private String parentId;

        @JsonProperty("order")
        private int order;

        @JsonProperty("last-plan-uploaded")
        private String lastPlanUploaded;

        @JsonProperty("component-type")
        private int componentType;

        @JsonProperty("is-processed")
        private boolean isProcessed;

        @JsonProperty("node-id")
        private String nodeId;

        @JsonProperty("uuid")
        private String uuid;

        @JsonProperty("ml-uuid")
        private String mlUuid;

        @JsonProperty("has-runs")
        private boolean hasRuns;

        @JsonProperty("runs-count")
        private int runsCount;

        @JsonProperty("planfile-file-name")
        private String planfileFileName;

        @JsonProperty("root-node")
        private boolean rootNode;

        @JsonProperty("plan-thumb-big-url")
        private String planThumbBigUrl;

        @JsonProperty("plan-thumb-small-url")
        private String planThumbSmallUrl;

        @JsonProperty("has-failed")
        private boolean hasFailed;

        @JsonProperty("first-inactive-processed-plan")
        private FirstInactiveProcessedPlan firstInactiveProcessedPlan;

        @JsonProperty("has-inactive-processed-plans")
        private boolean hasInactiveProcessedPlans;

        @JsonProperty("model-info-url")
        private String modelInfoUrl;

        @JsonProperty("calibration")
        private Calibration calibration;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getCreatedOn() {
            return createdOn;
        }

        public void setCreatedOn(String createdOn) {
            this.createdOn = createdOn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUpdatedOn() {
            return updatedOn;
        }

        public void setUpdatedOn(String updatedOn) {
            this.updatedOn = updatedOn;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public String getLastPlanUploaded() {
            return lastPlanUploaded;
        }

        public void setLastPlanUploaded(String lastPlanUploaded) {
            this.lastPlanUploaded = lastPlanUploaded;
        }

        public int getComponentType() {
            return componentType;
        }

        public void setComponentType(int componentType) {
            this.componentType = componentType;
        }

        public boolean isProcessed() {
            return isProcessed;
        }

        public void setProcessed(boolean isProcessed) {
            this.isProcessed = isProcessed;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getMlUuid() {
            return mlUuid;
        }

        public void setMlUuid(String mlUuid) {
            this.mlUuid = mlUuid;
        }

        public boolean isHasRuns() {
            return hasRuns;
        }

        public void setHasRuns(boolean hasRuns) {
            this.hasRuns = hasRuns;
        }

        public int getRunsCount() {
            return runsCount;
        }

        public void setRunsCount(int runsCount) {
            this.runsCount = runsCount;
        }

        public String getPlanfileFileName() {
            return planfileFileName;
        }

        public void setPlanfileFileName(String planfileFileName) {
            this.planfileFileName = planfileFileName;
        }

        public boolean isRootNode() {
            return rootNode;
        }

        public void setRootNode(boolean rootNode) {
            this.rootNode = rootNode;
        }

        public String getPlanThumbBigUrl() {
            return planThumbBigUrl;
        }

        public void setPlanThumbBigUrl(String planThumbBigUrl) {
            this.planThumbBigUrl = planThumbBigUrl;
        }

        public String getPlanThumbSmallUrl() {
            return planThumbSmallUrl;
        }

        public void setPlanThumbSmallUrl(String planThumbSmallUrl) {
            this.planThumbSmallUrl = planThumbSmallUrl;
        }

        public boolean isHasFailed() {
            return hasFailed;
        }

        public void setHasFailed(boolean hasFailed) {
            this.hasFailed = hasFailed;
        }

        public FirstInactiveProcessedPlan getFirstInactiveProcessedPlan() {
            return firstInactiveProcessedPlan;
        }

        public void setFirstInactiveProcessedPlan(FirstInactiveProcessedPlan firstInactiveProcessedPlan) {
            this.firstInactiveProcessedPlan = firstInactiveProcessedPlan;
        }

        public boolean isHasInactiveProcessedPlans() {
            return hasInactiveProcessedPlans;
        }

        public void setHasInactiveProcessedPlans(boolean hasInactiveProcessedPlans) {
            this.hasInactiveProcessedPlans = hasInactiveProcessedPlans;
        }

        public String getModelInfoUrl() {
            return modelInfoUrl;
        }

        public void setModelInfoUrl(String modelInfoUrl) {
            this.modelInfoUrl = modelInfoUrl;
        }

        public Calibration getCalibration() {
            return calibration;
        }

        public void setCalibration(Calibration calibration) {
            this.calibration = calibration;
        }

      

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class FirstInactiveProcessedPlan {

        @JsonProperty("plan")
        private String plan;

        @JsonProperty("tile-hash")
        private String tileHash;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class Calibration {

        @JsonProperty("scale")
        private boolean scale;

        @JsonProperty("north")
        private boolean north;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class Relationships {

        @JsonProperty("project")
        private RelationshipData project;

        @JsonProperty("plan")
        private RelationshipData plan;

        @JsonProperty("parent")
        private RelationshipData parent;

        @JsonProperty("children")
        private Children relationshipsChildren;

        @JsonProperty("plans")
        private Plans plans;

        public RelationshipData getProject() {
            return project;
        }

        public void setProject(RelationshipData project) {
            this.project = project;
        }

        public RelationshipData getPlan() {
            return plan;
        }

        public void setPlan(RelationshipData plan) {
            this.plan = plan;
        }

        public RelationshipData getParent() {
            return parent;
        }

        public void setParent(RelationshipData parent) {
            this.parent = parent;
        }

        public Children getRelationshipsChildren() {
            return relationshipsChildren;
        }

        public void setRelationshipsChildren(Children relationshipsChildren) {
            this.relationshipsChildren = relationshipsChildren;
        }

        public Plans getPlans() {
            return plans;
        }

        public void setPlans(Plans plans) {
            this.plans = plans;
        }

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class RelationshipData {

        @JsonProperty("data")
        private RelationshipItem data;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class RelationshipItem {

        @JsonProperty("id")
        private String id;

        @JsonProperty("type")
        private String type;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class Children {

        @JsonProperty("data")
        private List<RelationshipItem> data;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class Plans {

        @JsonProperty("data")
        private List<RelationshipItem> data;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class IncludedItem {

        @JsonProperty("id")
        private String id;

        @JsonProperty("type")
        private String type;

        @JsonProperty("attributes")
        private Attributes attributes;

        @JsonProperty("relationships")
        private Relationships relationships;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }

    public static class Meta {

        @JsonProperty("created_plan_ids")
        private List<String> createdPlanIds;

        // Getters and Setters
        // Add Getters and Setters for all fields here
    }
}
