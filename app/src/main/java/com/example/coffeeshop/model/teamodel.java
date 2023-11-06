package com.example.coffeeshop.model;

public class teamodel {
    String teaname,teename;
    int teaimage,teaprice;

    public teamodel(String teaname, String teename, int teaimage, int teaprice) {
        this.teaname = teaname;
        this.teename = teename;
        this.teaimage = teaimage;
        this.teaprice = teaprice;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

    public String getTeename() {
        return teename;
    }

    public void setTeename(String teename) {
        this.teename = teename;
    }

    public int getTeaimage() {
        return teaimage;
    }

    public void setTeaimage(int teaimage) {
        this.teaimage = teaimage;
    }

    public int getTeaprice() {
        return teaprice;
    }

    public void setTeaprice(int teaprice) {
        this.teaprice = teaprice;
    }
}
