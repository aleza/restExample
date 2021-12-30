package com.pruebarest.serviciorest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeting {
    private Long id;
    private String message;

    public Greeting(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
