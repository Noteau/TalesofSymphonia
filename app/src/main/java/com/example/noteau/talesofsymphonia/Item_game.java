package com.example.noteau.talesofsymphonia;

class Item_game {
    private String name;
    private int valeur;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item_game(String name, int valeur, String description) {

        this.name = name;
        this.valeur = valeur;
        this.description = description;
    }
    @Override
    public String toString(){
        return name;
    }
}
