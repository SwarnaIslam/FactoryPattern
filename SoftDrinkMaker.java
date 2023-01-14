package FactoryMethod_1214;

public class SoftDrinkMaker {
    public static SoftDrinks getSoftDrink(String softDrinkName, int price, String flavour, int amount){
        if("SevenUp".equalsIgnoreCase(softDrinkName)){
            return new SevenUp(price,flavour,amount);
        }
        else if("Cola".equalsIgnoreCase(softDrinkName)){
            return new Coke(price,flavour,amount);
        }
        return null;
    }
}
