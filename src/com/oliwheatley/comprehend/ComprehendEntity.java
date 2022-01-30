package com.oliwheatley.comprehend;

public class ComprehendEntity {

    private final EntityType entityType;
    private final int startIndex;
    private final int endIndex;
    private final String entityText;

    public ComprehendEntity(EntityType entityType, int startIndex, int endIndex, String entityText) {
        this.entityType = entityType;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.entityText = entityText;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public String getEntityText() {
        return entityText;
    }
}
