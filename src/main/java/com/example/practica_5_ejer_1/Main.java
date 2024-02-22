package com.example.practica_5_ejer_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        URLCollector collector = new URLCollector();
        Downloader downloader = new Downloader();

        collector.addObserver(downloader);

        Scanner scanner = new Scanner(System.in);
        System.out.println("***** URL Collector *****");
        System.out.println("Introduce '0' para salir del programa.");

        boolean exit = false;

        while (!exit) {
            System.out.println("Introduce una URL:");
            String url = scanner.nextLine();
            if (url.equals("0")) {
                System.out.println("Saliendo del programa...");
                exit = true;
            } else {
                collector.addURL(url);
            }

        }
    }
}