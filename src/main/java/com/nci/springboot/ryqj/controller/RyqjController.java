package com.nci.springboot.ryqj.controller;

import com.nci.springboot.ryqj.model.RenYuan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.ReentrantLock;

@RestController
public class RyqjController {
    @RequestMapping("/say")
    public String say(){

        RenYuan ry = new RenYuan();
        ry.setId("");
        ry.setUserName("");
        ry.setAge(0);
        ry.setGender("");
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();


        return "hello";
    }
}
