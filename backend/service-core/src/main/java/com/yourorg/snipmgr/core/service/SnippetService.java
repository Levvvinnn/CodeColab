package com.yourorg.snipmgr.core.service;

import com.yourorg.snipmgr.core.domain.Snippet;
import com.yourorg.snipmgr.core.dto.SearchResult;
import com.yourorg.snipmgr.core.dto.SnippetCreateRequest;
import com.yourorg.snipmgr.core.dto.SnippetDto;
import com.yourorg.snipmgr.core.dto.SnippetUpdateRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface SnippetService {

    SnippetDto createSnippet(SnippetCreateRequest req,UUID actorId);

    SnippetDto getSnippet(UUID snippetId,UUID actorId,Optional<String> shareToken);

    SnippetDto updateSnippet(UUID snippetId, SnippetUpdateRequest req, UUID actorId);

    void deleteSnippet(UUID snippetId, UUID actorId);

    SearchResult<SnippetDto> searchSnippets(
        String q,
        List<String> tags,
        String language,
        UUID actorId,
        int page,
        int size
    );

    SnippetDto createRevision(UUID snippetId,String newBody,UUID actorId);
}