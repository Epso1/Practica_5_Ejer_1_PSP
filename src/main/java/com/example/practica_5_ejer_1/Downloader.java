package com.example.practica_5_ejer_1;

import javafx.collections.ListChangeListener;

public class Downloader implements ListChangeListener<String> {
    @Override
    public void onChanged(Change<? extends String> c) {
        while (c.next()) {
            if (c.wasAdded()) {
                for (String url : c.getAddedSubList()) {
                    System.out.println("Se ha iniciado la descarga del archivo " + url);
                }
            }
        }
    }
}