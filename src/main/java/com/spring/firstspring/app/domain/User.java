package com.spring.firstspring.app.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class User {
    public String getName() {
        return name;
    }

    private String name;
    private String email;
}
