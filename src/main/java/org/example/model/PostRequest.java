package org.example.model;

import lombok.Builder;

@Builder
public record PostRequest(Integer userId, String title, String body) {
}
