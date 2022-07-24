package com.example.fdmassivendp;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class resep {

    private String judulmasakan;
    private String ketresep;
    private String formbahan;
    private String langkahpembuatan;

    public resep() {

    }

    public resep(String judulmasakan, String ketresep, String formbahan, String langkahpembuatan) {
        this.judulmasakan = judulmasakan;
        this.ketresep = ketresep;
        this.formbahan = formbahan;
        this.langkahpembuatan = langkahpembuatan;
    }

    public String getJudulmasakan() {
        return judulmasakan;
    }

    public String getKetresep() {
        return ketresep;
    }

    public String getFormbahan() {
        return formbahan;
    }

    public String getLangkahpembuatan() {
        return langkahpembuatan;
    }
}
