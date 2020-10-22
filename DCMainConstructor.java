package com.pbo.lp4;

public class DCMainConstructor {
    public static void main(String[] args){
        DCMainConstructor main = new DCMainConstructor();
        main.tesCase();
    }
    public void tesCase(){
        Product product = new Product("001","ASUS A407","12000000");
        Categories laptop = new Categories("Electronic","A407",product);
        Categories Aku = (laptop);

        Aku.getProduct().setNamaBarang("Kayu");
        Aku.setJenisBarang("Mebel");
        Aku.setType("Tipis");

        System.out.println(laptop);
        System.out.println(Aku);
    }
}
