package com.pbo.lp4;

public class ShallowMain {
    public static void main(String[] args) {
        ShallowMain g = new ShallowMain();
        g.Swallowing_productCategories();

    }
    public void Swallowing_productCategories(){
        Product product = new Product("001","ASUS A407","12000000");
        Categories laptop = new Categories("Electronic","A407",product);
        Categories Aku = new Categories(
                laptop.getJenisBarang(),laptop.getType(), laptop.getProduct());

       Aku.setType("A400");
       product.setNamaBarang("Acer");
        System.out.println(Aku);
        System.out.println(laptop);
    }
}
