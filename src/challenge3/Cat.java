package challenge3;

public class Cat extends Animal implements Pet{
    public String name;

    public Cat(String name) {
        this.legs=4;
        this.name = name;
    }

    public Cat()
    {
        this.name=null;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {

    }
    @Override
    public void walk() {

    }

    @Override
    public void eat() {

    }

}
