package FactoryMethod_1214;

public abstract class SoftDrinks {
    public abstract int getPrice();
    public abstract String getFlavour();
    public abstract int getAmount();

    @Override
    public String toString() {
        return "Flavour: "+getFlavour()+", Amount: "+getAmount()+"ml, Price"+getPrice()+"tk";
    }
}
