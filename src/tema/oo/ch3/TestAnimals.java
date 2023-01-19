package tema.oo.ch3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();

        System.out.println(c.getName());

        p.setName("Tom");
        System.out.println(p.getName());


        Animal animal = d;
        animal.walk();

        System.out.println(e.legs);

    }
}
