package com.example.noteau.talesofsymphonia;

public class Allier {
    private String _name;
    private int _reputation;
    private String _description;
    public Allier(String name, int reputation, String description) {
        _name = name;
        _reputation = reputation;
        _description = description;
    }

    public int get_reputation() {
        return _reputation;
    }

    public String get_description() {
        return _description;
    }

    public String get_name() {
        return _name;
    }
}
