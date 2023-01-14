package FactoryMethod_1214;

public class SevenUp extends SoftDrinks{
    private int price;
    private String flavour;
    private int amount;
    public  SevenUp(int price, String flavour, int amount){
        this.price=price;
        this.flavour=flavour;
        this.amount=amount;
    }
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getFlavour() {
        return this.flavour;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }
}
