package com.yourorg.snipmgr.core.domain;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public record User(
    UUID id,
    String email,
    String displayName,
    String passwordHash,
    Instant createdAt,
    Instant lastLoginAt,
    boolean isActive
) {
    public User{
        Objects.requireNonNull(id,"id must not be null");
        Objects.requireNonNull(email, "email must not be null");
        Objects.requireNonNull(displayName, "displayName must not be null");
        Objects.requireNonNull(createdAt, "createdAt must not be null");
    }

    public static User newUser(String email,String displayName,String passwordHash){
        return new User(
            UUID.randomUUID(),
            Objects.requireNonNull(email),
            Objects.requireNonNull(displayName),
            passwordHash,
            Instant.now(),
            null,
            true
        );
    }
    public User withLastLoginAt(Instant lastLoginAt){
        return new User(id, email, displayName, passwordHash, createdAt, lastLoginAt, isActive);
    }

    public User withIsActive(Boolean isActive){
        return new User(id, email, displayName, passwordHash, createdAt, lastLoginAt, isActive);
    }

    public User withPasswordHash(String passwordHash) {
        return new User(id, email, displayName, passwordHash, createdAt, lastLoginAt, isActive);
    }

}