package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();

        Chocolate choco = new Chocolate("Lindt", 5, "dene", 60.5, "dene");
        Coke coke = new Coke("Coca-Cola", 2, "dene", 5);
        Bread bread = new Bread("Whole Wheat", 3, "Tam Buğday", "Tam Buğday");

        ProductForSale[] products = {choco, coke, bread};

        Store store = new Store();

        store.listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("------------------------");
        }

    }
}