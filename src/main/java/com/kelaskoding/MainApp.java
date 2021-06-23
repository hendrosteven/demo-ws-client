/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelaskoding;

/**
 *
 * @author jarvis
 */
public class MainApp {
    public static void main(String[] args){
        HelloWorldWSImplService service = new HelloWorldWSImplService();
        System.out.println(service.getHelloWorldWSImplPort().sayHello("Hendro Steven"));
    }
}
