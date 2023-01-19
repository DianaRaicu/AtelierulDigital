package tema.oo.ch3;

public class Fish extends Animal implements Pet {
    public String name;

    public Fish()
    {
        this.name=null;
    }
    @Override
    public void walk() {
        System.out.println("without legs, can't walk!");
    }

    @Override
    public void eat() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }
}