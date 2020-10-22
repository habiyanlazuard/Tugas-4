package com.pbo.lp4;

public class DCMainInterface {
    public static void main(String[] args){
        DCMainInterface main3 = new DCMainInterface();
        main3.testCase();

        }
    public void testCase(){
        Product product = new Product("001","ASUS A407","12000000");
        Categories laptop = new Categories("Electronic","A407",product);
        Categories Aku = (Categories) laptop.clone();

        Aku.getProduct().setNamaBarang("Kayu");
        Aku.setJenisBarang("Mebel");
        Aku.setType("Tipis");

        System.out.println(laptop);
        System.out.println(Aku);
    }
}
