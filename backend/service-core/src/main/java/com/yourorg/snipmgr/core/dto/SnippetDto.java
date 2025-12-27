package com.yourorg.snipmgr.core.dto;

import com.yourorg.snipmgr.core.domain.Visibility;

import java.time.Instant;
import java.util.UUID;

public class SnippetDto {

    private UUID id;
    private UUID ownerId;
    private UUID teamId; 
    private String title;
    private String language;
    private String description; 
    private Visibility visibility;
    private Instant createdAt;
    private Instant updatedAt;
    private String preview;
    private int copyCount;

    public SnippetDto() {
    }

    public SnippetDto(
            UUID id,
            UUID ownerId,
            UUID teamId,
            String title,
            String language,
            String description,
            Visibility visibility,
            Instant createdAt,
            Instant updatedAt,
            String preview,
            int copyCount
    ) {
        this.id = id;
        this.ownerId = ownerId;
        this.teamId = teamId;
        this.title = title;
        this.language = language;
        this.description = description;
        this.visibility = visibility;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.preview = preview;
        this.copyCount = copyCount;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public UUID getOwnerId() { return ownerId; }
    public void setOwnerId(UUID ownerId) { this.ownerId = ownerId; }

    public UUID getTeamId() { return teamId; }
    public void setTeamId(UUID teamId) { this.teamId = teamId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Visibility getVisibility() { return visibility; }
    public void setVisibility(Visibility visibility) { this.visibility = visibility; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }

    public String getPreview() { return preview; }
    public void setPreview(String preview) { this.preview = preview; }

    public int getCopyCount() { return copyCount; }
    public void setCopyCount(int copyCount) { this.copyCount = copyCount; }
}
