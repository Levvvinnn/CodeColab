package com.yourorg.snipmgr.core.dto;

import com.yourorg.snipmgr.core.domain.Visibility;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class SnippetUpdateRequest{
    private String title;
    private String body;
    private String language;
    private String description;
    private List<String> tags;
    private Visibility visibility;
    private UUID teamId;
    private Instant updatedAt;

    public SnippetUpdateRequest() {
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }

    public Visibility getVisibility() { return visibility; }
    public void setVisibility(Visibility visibility) { this.visibility = visibility; }

    public UUID getTeamId() { return teamId; }
    public void setTeamId(UUID teamId) { this.teamId = teamId; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }

}