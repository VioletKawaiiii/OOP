package com.fikry.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class WebController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/book-list")
    public String bookList(){
        return "bookList";
    }

    @GetMapping("/add-book")
    public String addBook(){
        return "addBook";
    }

    @GetMapping("/member-list")
    public String memberList(){
        return "memberList";
    }

    @GetMapping("/member-registration")
    public String memberRegistration(){
        return "memberRegistration";
    }  
}
