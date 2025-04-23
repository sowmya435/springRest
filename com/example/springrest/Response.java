package com.example.springrest;

import lombok.Getter;
import lombok.Setter;


public class Response {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int no;

    public Response(String name, int no){
        this.name=name;
        this.no=no;
    }



}
