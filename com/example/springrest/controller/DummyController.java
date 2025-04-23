package com.example.springrest.controller;

import com.example.springrest.Fetch;
import com.example.springrest.Request;
import com.example.springrest.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {



    @GetMapping("/message")
    public Response response(){

         return new Response("sowmya",2);

    }
    @PostMapping("/fetch-data")
    public Fetch data(@RequestBody Request request){
        if(request.getName()==null){
            System.out.println("name is empty");
        }else{

            System.out.println("name is :"+ request.getName() );
        }
        return new Fetch("ME",1);
    }


}
