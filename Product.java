package com.pbo.lp4;

public class Product {
    public String CodeBarang;
    public String NamaBarang;
    public String HargaBarang;

    public Product(Product product){
        this(product.getCodeBarang(),  product.getNamaBarang(),product.getHargaBarang());
    }
    public Product(String codeBarang, String namaBarang, String hargaBarang) {
        this.CodeBarang = codeBarang;
        this.NamaBarang = namaBarang;
        this.HargaBarang = hargaBarang;
    }

    public Product(String namaBarang) {
        this.NamaBarang = namaBarang;
    }

    @Override
    public Object clone() {
        try {
          return (Product) super.clone();
        }catch (CloneNotSupportedException e){
            return new Product(this.getCodeBarang(), this.getNamaBarang(),this.getHargaBarang());
        }
    }

    public String getCodeBarang() {
        return CodeBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }

    public String getHargaBarang() {
        return HargaBarang;
    }

    @Override
    public String toString() {
        return "Product{" +
                "CodeBarang ='" + CodeBarang + '\'' +
                "NamaBarang ='" + NamaBarang + '\'' +
                "HargaBarang ='" + HargaBarang + '\'' +
                '}';
    }
}
