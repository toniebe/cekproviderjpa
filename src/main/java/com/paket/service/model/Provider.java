package com.paket.service.model;

import javax.persistence.*;

@Entity
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprovider")
    private int idprovider;
    @Column(name = "nama_provider")
    private String nama_provider;
    @Column(name = "kartu")
    private String kartu;
    @Column(name = "data_paketan")
    private String data_paketan;
    @Column(name = "harga")
    private long harga;

    public Provider() {
    }

    public int getIdprovider() {
        return idprovider;
    }

    public void setIdprovider(int idprovider) {
        this.idprovider = idprovider;
    }

    public String getNama_provider() {
        return nama_provider;
    }

    public void setNama_provider(String nama_provider) {
        this.nama_provider = nama_provider;
    }

    public String getKartu() {
        return kartu;
    }

    public void setKartu(String kartu) {
        this.kartu = kartu;
    }

    public String getData_paketan() {
        return data_paketan;
    }

    public void setData_paketan(String data_paketan) {
        this.data_paketan = data_paketan;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
}
