package org.example.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Environment {

    QA("https://jsonplaceholder.typicode.com/");


    private final String BASE_URL;
}
