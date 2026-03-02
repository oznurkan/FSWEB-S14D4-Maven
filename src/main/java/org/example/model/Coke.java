package org.example.model;

public class Coke extends ProductForSale{

    private int volume;


    public Coke(String type, int price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.volume = 40;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDetails(){
        System.out.println("Name : " + getClass().getSimpleName() +"\nVolume : " + getVolume());
    }
}
