package FactoryMethod_1214;

public class Main {
    public static void main(String[] args) {
        SoftDrinks sevenUp=SoftDrinkMaker.getSoftDrink("sevenUp",35,"lime",500);
        SoftDrinks coke=SoftDrinkMaker.getSoftDrink("cola",35,"cola",500);

        System.out.println("Seven up: "+sevenUp);
        System.out.println("Coke:"+coke);
    }
}