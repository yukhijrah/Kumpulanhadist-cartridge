package com.cartridryan14.kumpulanhadist.model;

public class DoaModel {
    //Variable yang dideklarasikan
    private String nama;
    private String arti;
    private String surah;

    /* *Constructor * Menginisialisasikan Variable  */
    public DoaModel(String nama, String arti, String surah) {
        this.nama = nama;
        this.arti = arti;
        this.surah = surah;
    }

    /* *Getter *untuk mengambil isian dari constructo */


    public String getNama() {
        return nama;
    }

    public String getArti() {
        return arti;
    }

    public String getSurah() { return surah; }
}

