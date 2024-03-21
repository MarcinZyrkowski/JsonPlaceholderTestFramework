package org.example.model;

import lombok.Builder;

@Builder
public record Comment(Integer postId,
                      Integer id,
                      String name,
                      String email,
                      String body) {

}
