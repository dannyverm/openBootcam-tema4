package com.dannyverm.app;

public class SmartWatch extends SmartDevice {
    String marca;
    String modelo;
    public SmartWatch(String ram, String screen, String rom,String marca,String modelo) {
        super(ram, screen, rom);
        this.marca=marca;
        this.modelo=modelo;
    }
}
