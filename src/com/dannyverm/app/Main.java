package com.dannyverm.app;

public class Main {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone("2BG", "6mpx", "32GB", "Samsung", "Galaxy A02");
        SmartWatch watch = new SmartWatch("512MB", "2mpx", "1GB", "Xiaomi", "Watch");

        System.out.println("Smart Phone ----> Marca: " + phone.marca + " - Modelo: " + phone.modelo
                + " - RAM: " + phone.ram + " - ROM: " + phone.rom + " - Pantalla: " + phone.screen);

        System.out.println("Smart Watch ----> Marca: " + watch.marca + " - Modelo: " + watch.modelo
                + " - RAM: " + watch.ram + " - ROM: " + watch.rom + " - Pantalla: " + watch.screen);
    }
}
