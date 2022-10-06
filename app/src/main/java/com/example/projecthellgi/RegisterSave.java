package com.example.projecthellgi;

public class RegisterSave {
    String email;
    String name;

    public RegisterSave(String email, String name){};

    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }

    public void getInfo(String email, String name){
        this.email = email;
        this.name = name;
    }
}
