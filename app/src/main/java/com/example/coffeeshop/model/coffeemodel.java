package com.example.coffeeshop.model;

public class coffeemodel {
    String coffename;
    int coffeesize,coffeeimage,coffeprice;

    public coffeemodel(String coffename, int coffeesize, int coffeeimage, int coffeprice) {
        this.coffename = coffename;
        this.coffeesize = coffeesize;
        this.coffeeimage = coffeeimage;
        this.coffeprice = coffeprice;
    }

    public String getCoffename() {
        return coffename;
    }

    public void setCoffename(String coffename) {
        this.coffename = coffename;
    }

    public int getCoffeesize() {
        return coffeesize;
    }

    public void setCoffeesize(int coffeesize) {
        this.coffeesize = coffeesize;
    }

    public int getCoffeeimage() {
        return coffeeimage;
    }

    public void setCoffeeimage(int coffeeimage) {
        this.coffeeimage = coffeeimage;
    }

    public int getCoffeprice() {
        return coffeprice;
    }

    public void setCoffeprice(int coffeprice) {
        this.coffeprice = coffeprice;
    }
}
