package com.dannyverm.app;

public class SmartPhone extends SmartDevice{
    String marca;
    String modelo;

    public SmartPhone(String ram, String screen, String rom,String marca,String modelo) {
        super(ram, screen, rom);
        this.marca=marca;
        this.modelo=modelo;
    }
}
