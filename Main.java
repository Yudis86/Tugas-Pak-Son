/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user;

/**
 *
 * @author yudistira
 */
public class Main {

    public static void main(String[] args) {
        User petani = new User();
        
        petani.setUsername("Yudis");
        petani.setPassword("WedangJahe");

// menggunakan method getter
        System.out.println("Username: " + petani.getUsername());
        System.out.println("Password: " + petani.getPassword());
    }
}
