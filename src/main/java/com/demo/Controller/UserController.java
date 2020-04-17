package com.demo.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public static void main(String[] args) {
        System.out.println("UserController");
        String a = "abc";
        String b = "abc";
        System.out.println(a=b);
        System.out.println(a.equals(b));
    }
}
