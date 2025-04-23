package com.example.springrest;

import lombok.Getter;
import lombok.Setter;

public class Fetch {
    @Getter
    @Setter

    private String email;
    @Getter
    @Setter
    private int phone;

    public Fetch(String email, int phone){
        this.email=email;
        this.phone=phone;
    }
}
