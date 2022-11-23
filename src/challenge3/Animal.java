package challenge3;

public abstract class Animal {
    protected Integer legs;
    protected Animal(Integer legs)
    {
        this.legs=legs;
    }

    public Animal()
    {

    }
    public abstract void walk();
    public abstract void eat();

}
