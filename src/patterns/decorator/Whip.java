package patterns.decorator;

public class Whip extends Topping{
    public Whip(Beverage beverage){
        super(beverage, "Whip ", 3);
    }
}
