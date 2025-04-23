package com.example.springrest;

import lombok.Getter;
import lombok.Setter;

public class Request {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int no;

    public Request(String name, int no) {
        this.name = name;
        this.no=no;
    }
}
