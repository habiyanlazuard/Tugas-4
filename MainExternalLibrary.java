package com.pbo.lp4;

import java.io.Serializable;

public class MainExternalLibrary implements Serializable,Cloneable {

    public static void main(String[] args) {
        MainExternalLibrary h = new MainExternalLibrary();
        h.WhenModifyingOriginalObject_thenApacheCloneShouldNotChange();

    }
    public void WhenModifyingOriginalObject_thenApacheCloneShouldNotChange() {
        Product product = new Product("001","ASUS A407","12000000");
        Categories laptop = new Categories("Electronic","A407",product);
        Categories deepCopy = laptop.clone();

        product.setNamaBarang("ACER");
        deepCopy.getProduct().getNamaBarang();
        laptop.getProduct().getNamaBarang();
        System.out.println(laptop);
        System.out.println(deepCopy);
        System.out.println(product);
    }
}
