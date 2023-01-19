package tema.patterns.ch4;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(ObservedSubject teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " learned about: " + message);
    }
}

