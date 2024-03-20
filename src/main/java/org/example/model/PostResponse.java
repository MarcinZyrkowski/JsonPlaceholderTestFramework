package org.example.model;

import lombok.Builder;

@Builder
public record PostResponse(Integer userId, Integer id, String title, String body) {

}
