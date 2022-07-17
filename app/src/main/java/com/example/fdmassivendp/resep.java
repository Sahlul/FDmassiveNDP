package com.example.fdmassivendp;

public class resep {

    private String judulmasakan;
    private String ketresep;
    private String formbahan;
    private String langkahpembuatan;
    public resep() {

    }

    public resep(String jdmasakan, String keteranganrsp, String bhanbhan, String langkahpmbtn) {
        this.judulmasakan = jdmasakan;
        this.ketresep = keteranganrsp;
        this.formbahan = bhanbhan;
        this.langkahpembuatan = langkahpmbtn;
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
