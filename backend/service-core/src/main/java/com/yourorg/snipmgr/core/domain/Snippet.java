package com.yourorg.snipmgr.core.domain;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public record Snippet(
    UUID id,
    UUID ownerId,
    UUID teamId,
    String title,
    String body,
    String language,
    String description,
    Visibility visibility,
    Instant createdAt,
    Instant updatedAt,
    int copyCount
) {
    public Snippet{
        Objects.requireNonNull(id, "id must not be null");
        Objects.requireNonNull(ownerId, "ownerId must not be null");
        Objects.requireNonNull(title, "title must not be null");
        Objects.requireNonNull(body, "body must not be null");
        Objects.requireNonNull(language, "language must not be null");
        Objects.requireNonNull(visibility, "visibility must not be null");
        Objects.requireNonNull(createdAt, "createdAt must not be null");
        Objects.requireNonNull(updatedAt, "updatedAt must not be null");

        if(copyCount<0){
            throw new IllegalArgumentException("copycount cannot be negative");
        }
    }

    public static Snippet newSnippet(
        UUID ownerId,
        UUID teamId,
        String title,
        String body,
        String language,
        String description,
        Visibility visibility
    ){
        return new Snippet(
            UUID.randomUUID(),
            Objects.requireNonNull(ownerId),
            teamId,
            Objects.requireNonNull(title),
            Objects.requireNonNull(body),
            language == null ? "" : language,
            description,
            visibility == null ? Visibility.PRIVATE : visibility,
            Instant.now(),
            Instant.now(),
            0
        );
    }
    
    
    public Snippet withUpdatedContent(
        UUID ownerId,
        String title
    ) {
        return new Snippet(
            id,
            ownerId,
            teamId,
            title,
            body,
            language,
            description,
            visibility,
            createdAt,
            Instant.now(),
            copyCount
        );
    }

    public Snippet withIncrementedCopyCount() {
        return new Snippet(
            id,
            ownerId,
            teamId,
            title,
            body,
            language,
            description,
            visibility,
            createdAt,
            updatedAt,
            copyCount+1
        );
    }
}
