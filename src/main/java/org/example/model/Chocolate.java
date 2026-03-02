package org.example.model;

public class Chocolate extends ProductForSale{

    private double cocoaPercentage;
    private String size;



    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 50.0;
        this.size = "medium";
    }

    public Chocolate(String type, int price, String description, double cocoaPercentage, String size) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
        this.size = size;
    }

    @Override
    public void showDetails(){
        System.out.println("Name : " + getClass().getSimpleName() +"\nCocoa Percentage : " + getCocoaPercentage() +"\nSize : " + getSize() );
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }


    public String getSize() {
        return size;
    }
}
