package com.nci.springboot.ryqj.model;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class RenYuan {
    public static void main(String[] args) {
        //language=SQL
        String data = "select * from sec_user";
    }

    private String id;

    private String userName;

    private int age;

    private String gender;

}
