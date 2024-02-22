package com.example.practica_5_ejer_1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class URLCollector {
    private final ObservableList<String> urls = FXCollections.observableArrayList();

    public void addObserver(Downloader observer) {
        urls.addListener(observer);
    }

    public void addURL(String url) {
        urls.add(url);
    }
}