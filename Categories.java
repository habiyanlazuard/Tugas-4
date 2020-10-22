package com.pbo.lp4;

import java.io.Serializable;

public class Categories implements Serializable {
    public String JenisBarang;
    public Product produksi;
    public  String type;

    public Categories(Categories nama){
        this(nama.getJenisBarang(), nama.type, new Product(nama.getProduct()));
    }

    public Categories(String jenisBarang, String type, Product produksi) {
        this.JenisBarang = jenisBarang;
        this.type = type;
        this.produksi = produksi;
    }

    @Override
    protected Categories clone() {
        Categories laptop = null;
        try {
            laptop = (Categories) super.clone();
        }catch (CloneNotSupportedException e){
            laptop = new Categories(this.getJenisBarang(), this.getType(), this.getProduct());
        }
        laptop.produksi = (Product) this.produksi.clone();
        return laptop;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public Product getProduct() {
        return produksi;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Categories\n" +"================="+
                "\nJenis Barang = '" + JenisBarang + '\'' +
                "\nproduct = '" + produksi +
                "\ntype = '" + type + '\''
                +"\n==================";
    }
}
